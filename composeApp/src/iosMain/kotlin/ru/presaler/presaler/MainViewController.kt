package ru.presaler.presaler

import androidx.compose.ui.window.ComposeUIViewController
import org.koin.core.context.startKoin
import ru.presaler.main.imp.di.mainModule
import ru.presaler.network.di.networkModule
import ru.presaler.networkconnection.imp.di.networkConnectionModule
import ru.presaler.splash.imp.di.splashModule
import ru.presaler.storage.di.storageModule
import ru.presaler.storage.di.storagePlatformModule
import ru.presaler.utils.di.utilsModule

fun MainViewController() = ComposeUIViewController(
    configure = {
        startKoin {
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
) {
    App()
}