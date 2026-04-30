package ru.presaler.network

import android.R.attr.level
import android.util.Log
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.auth.Auth
import io.ktor.client.plugins.auth.providers.BearerTokens
import io.ktor.client.plugins.auth.providers.bearer
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.observer.ResponseObserver
import io.ktor.client.request.header
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.flow.first
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import org.koin.java.KoinJavaComponent.inject
import ru.presaler.network.model.PlatformType
import ru.presaler.network.utils.disableAuthPlugin
import ru.presaler.network.utils.getCurrentVersion
import ru.presaler.network.utils.getPlatform
import ru.presaler.storage.datastore.EncryptedDataStore

actual object HttpClientProvider {
    @OptIn(ExperimentalSerializationApi::class)
    actual val client: HttpClient by lazy {
        val encryptedDataStore: EncryptedDataStore by inject(EncryptedDataStore::class.java)

        HttpClient(OkHttp) {
            install(HttpTimeout) {
                requestTimeoutMillis = 30_000
                connectTimeoutMillis = 15_000
                socketTimeoutMillis = 30_000
            }

            install(Logging) {
                logger = object : Logger {
                    override fun log(message: String) {
                        Log.i("KtorClient", message)
                    }
                }
                level = LogLevel.ALL
            }

            install(ResponseObserver) {
                onResponse { response ->
                    // В Android используем Log.d, в iOS — println
                    // Для кроссплатформенности можно использовать Logger из плагина Logging
                    Log.d("HTTP status:", "${response.status.value}")
                }
            }

            install(Auth) {
                bearer {
                    loadTokens {
                        val token = encryptedDataStore.accessToken.first()
                        if (token.isNotEmpty()) BearerTokens(token, "") else null
                    }
                }
            }

            install(DefaultRequest) {
                header(HttpHeaders.ContentType, ContentType.Application.Json)
                header("Platform", if (getPlatform() == PlatformType.ANDROID) "android" else "ios")
                header("Version", getCurrentVersion())
            }

            install(disableAuthPlugin())

            install(ContentNegotiation) {
                json(Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                    explicitNulls = false
                })
            }
        }
    }
}