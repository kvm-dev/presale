package ru.presaler.main.imp.presentation.ui

import ru.presaler.utils.model.BaseErrors

sealed class MainScreenViewState {

    data object LoadingState: MainScreenViewState()
    data class ErrorState(val error: BaseErrors): MainScreenViewState()

    data class SuccessState(
        val isNetworkAvailable: Boolean,
        val isAsModeEnabled: Boolean,
        val userName: String,
        val currentAddress: String
    ): MainScreenViewState()
}