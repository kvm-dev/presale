package ru.presaler.splash.imp.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import io.github.alexzhirkevich.compottie.Compottie
import io.github.alexzhirkevich.compottie.LottieCompositionSpec
import io.github.alexzhirkevich.compottie.rememberLottieComposition
import io.github.alexzhirkevich.compottie.rememberLottiePainter
import org.koin.compose.viewmodel.koinViewModel
import org.orbitmvi.orbit.compose.collectAsState
import org.orbitmvi.orbit.compose.collectSideEffect
import ru.presaler.features.splash.imp.ComposeResources.Res
import ru.presaler.splash.imp.presentation.viewmodel.SplashScreenViewModel
import ru.presaler.ui.components.QrCodeScanner

@Composable
fun SplashScreen(viewModel: SplashScreenViewModel = koinViewModel(), onNavigateToHome: () -> Unit, onNavigationAuthorization: () -> Unit) {

    val state by viewModel.collectAsState()

    viewModel.collectSideEffect { sideEffect ->
        when (sideEffect) {
            SplashScreenSideEffects.NAVIGATE_TO_AUTHORIZED_ZONE -> { onNavigateToHome() }
            SplashScreenSideEffects.NAVIGATE_TO_AUTHORIZATION_ZONE -> { onNavigationAuthorization() }
        }
    }

    when(state){
        SplashScreenViewState.Idle -> {
            viewModel.intentHandler(SplashScreenIntents.InitViewModelIntent)
        }

        SplashScreenViewState.Loading-> {
            val composition by rememberLottieComposition {
                LottieCompositionSpec.JsonString(
                    Res.readBytes("files/splash_animation.json").decodeToString()
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxHeight()
            ) {
                println("тут")
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentScale = ContentScale.FillWidth,
                    painter = rememberLottiePainter(
                        composition = composition,
                        iterations = Compottie.IterateForever),
                    contentDescription = ""
                )
                Text("какой-то текст")
            }
        }
    }
}
