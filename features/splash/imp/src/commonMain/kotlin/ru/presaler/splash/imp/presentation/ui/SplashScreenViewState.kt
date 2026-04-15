package ru.presaler.splash.imp.presentation.ui

sealed class SplashScreenViewState{
    data object Idle : SplashScreenViewState()
    data object Loading : SplashScreenViewState()
}
