package ru.presaler.search.imp.presentation.viewmodel

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.launch
import kotlinx.coroutines.plus
import ru.presaler.search.imp.domain.interactor.SearchScreenInteractor
import ru.presaler.search.imp.presentation.ui.SearchScreenSideEffects
import ru.presaler.search.imp.presentation.ui.SearchScreenViewState
import ru.presaler.viewmodel.BaseViewModel

class SearchScreenViewModel(private val interactor: SearchScreenInteractor) : BaseViewModel<SearchScreenViewState, SearchScreenSideEffects>(
    SearchScreenViewState.Idle
) {
    val scope = (viewModelScope + coroutineExceptionHandler)


    private fun loadData() = orbitIntent {
        scope.launch(Dispatchers.IO) {
            val result =  interactor.isNetworkAvailable()
            println("результат $result")

        }
    }

    override fun intentHandler(intent: Any) {
        when(intent){
        }
    }
}
