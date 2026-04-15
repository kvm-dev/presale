package ru.presaler.presaler

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinApplication
import org.koin.compose.koinInject
import org.koin.dsl.KoinAppDeclaration

import presaler.composeapp.generated.resources.Res
import presaler.composeapp.generated.resources.compose_multiplatform
import ru.presaler.main.imp.di.mainModule
import ru.presaler.navigation.NavigationApp
import ru.presaler.splash.imp.di.splashModule
import ru.presaler.utils.di.utilsModule

@Composable
@Preview
//fun App(koinAppDeclaration: KoinAppDeclaration? = null, database: AppDatabase) {
fun App(koinAppDeclaration: KoinAppDeclaration? = null) {
    KoinApplication(application = {
        koinAppDeclaration?.invoke(this)
        modules(
            utilsModule,
//            networkModule,
//            storagePlatformModule,
//            storageModule,
//            networkConnectionModule,
            splashModule,
//            asModeModule,
            mainModule,
        )
    }) {
        MaterialTheme{
            NavigationApp()
        }
    }
}