package ru.presaler.search.imp.presentation.ui

sealed class SearchScreenViewState{
    data object Idle : SearchScreenViewState()
    data object Loading : SearchScreenViewState()
}