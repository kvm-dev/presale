package ru.presaler.registration.imp.presentation.ui

sealed class RegistrationScreenViewState {
    data object Idle : RegistrationScreenViewState()
    data object Loading : RegistrationScreenViewState()
}