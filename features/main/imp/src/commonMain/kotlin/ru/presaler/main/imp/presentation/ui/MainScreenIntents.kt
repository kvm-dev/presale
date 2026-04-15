package ru.presaler.main.imp.presentation.ui

sealed class MainScreenIntents {
    data object InitViewModelIntent : MainScreenIntents()
    data object GoToAuthorizationIntent : MainScreenIntents()
    data object NavigateToSaleIntent: MainScreenIntents()
    data object NavigateToSearchIntent: MainScreenIntents()
    data object NavigateToProfileIntent: MainScreenIntents()
    data object ChangeAddressIntent: MainScreenIntents()
    data object RefreshIntent: MainScreenIntents()
}