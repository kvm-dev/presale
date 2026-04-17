package ru.presaler.splash.imp.presentation.ui
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.compottie.Compottie
import io.github.alexzhirkevich.compottie.LottieCompositionSpec
import io.github.alexzhirkevich.compottie.rememberLottieComposition
import io.github.alexzhirkevich.compottie.rememberLottiePainter
import org.koin.compose.viewmodel.koinViewModel
import org.orbitmvi.orbit.compose.collectAsState
import org.orbitmvi.orbit.compose.collectSideEffect
import ru.presaler.features.splash.imp.ComposeResources.Res
import ru.presaler.splash.imp.presentation.viewmodel.SplashScreenViewModel
import ru.presaler.ui.components.AppTitle
import ru.presaler.ui.components.ButtonAuth
import ru.presaler.ui.components.SplashDescription

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

                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Spacer(modifier = Modifier.weight(1f))

                Image(
                    modifier = Modifier
                        .padding(top = 48.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.FillWidth,
                    painter = rememberLottiePainter(
                        composition = composition,
                        iterations = Compottie.IterateForever),
                    contentDescription = ""
                )

                AppTitle()
                SplashDescription()

                Spacer(modifier = Modifier.weight(1f))
                //ConnectionStatus() //Проверка статуса
                ButtonAuth(modifier = Modifier, onClick = {})
            }
        }
    }
}
