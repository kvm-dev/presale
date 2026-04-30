package ru.presaler.networkconnection.imp.domain.usecase

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.http.isSuccess
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.withContext
import ru.presaler.network.utils.disableAuthKey
import ru.presaler.networkconnection.api.domain.usecase.GetNetworkStateUseCase

class GetNetworkStateUseCaseImp(
    private val client: HttpClient
) : GetNetworkStateUseCase {

    override suspend fun isNetworkAvailable(): Boolean = withContext(Dispatchers.IO) {
        return@withContext try {
            client.get("https://google.com") {
                attributes.put(disableAuthKey, true)
//                timeout { connectTimeoutMillis = 5000 }
            }.status.isSuccess()
        } catch (e: Exception) {
            false
        }
    }
}