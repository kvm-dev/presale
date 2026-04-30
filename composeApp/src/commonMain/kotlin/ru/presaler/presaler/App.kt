package ru.presaler.presaler

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.dsl.KoinAppDeclaration
import ru.presaler.navigation.NavigationApp

@Composable
@Preview
fun App(koinAppDeclaration: KoinAppDeclaration? = null) {
        MaterialTheme{
            NavigationApp()
        }

}