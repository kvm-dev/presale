package ru.presaler.splash.imp.presentation.viewmodel

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.zip
import kotlinx.coroutines.launch
import kotlinx.coroutines.plus
import ru.presaler.splash.imp.domain.interactor.SplashScreenInteractor
import ru.presaler.splash.imp.presentation.ui.SplashScreen
import ru.presaler.splash.imp.presentation.ui.SplashScreenIntents
import ru.presaler.splash.imp.presentation.ui.SplashScreenSideEffects
import ru.presaler.splash.imp.presentation.ui.SplashScreenViewState
import ru.presaler.viewmodel.BaseViewModel

class SplashScreenViewModel(private val interactor: SplashScreenInteractor) : BaseViewModel<SplashScreenViewState, SplashScreenSideEffects>(
    SplashScreenViewState.Idle
) {
    val scope = (viewModelScope + coroutineExceptionHandler)


    private fun loadData() = orbitIntent {
        scope.launch {
            reduce {
                SplashScreenViewState.Loading
            }
        }
    }

    override fun intentHandler(intent: Any) {
        when(intent){
            SplashScreenIntents.InitViewModelIntent -> loadData()
        }
    }
}
