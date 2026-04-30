package ru.presaler.presaler

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import ru.presaler.main.imp.di.mainModule
import ru.presaler.network.di.networkModule
import ru.presaler.networkconnection.imp.di.networkConnectionModule
import ru.presaler.splash.imp.di.splashModule
import ru.presaler.storage.di.storageModule
import ru.presaler.storage.di.storagePlatformModule
import ru.presaler.utils.di.utilsModule

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        if (GlobalContext.getOrNull() == null) { // проверка, чтобы не запустить дважды
            startKoin {
                androidContext(this@MainActivity)
                androidLogger(Level.DEBUG) // Optional: for logging Koin activities
                modules(
                    utilsModule,
                    storagePlatformModule,
                    storageModule,
                    networkModule,
                    networkConnectionModule,
                    splashModule,
                    mainModule
                )
            }
        }
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}