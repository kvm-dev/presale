package ru.presaler.registration.imp.presentation.viewmodel

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.launch
import kotlinx.coroutines.plus
import ru.presaler.registration.imp.domain.interactor.RegistrationScreenInteractor
import ru.presaler.registration.imp.presentation.ui.RegistrationScreenIntents
import ru.presaler.registration.imp.presentation.ui.RegistrationScreenSideEffects
import ru.presaler.registration.imp.presentation.ui.RegistrationScreenViewState
import ru.presaler.viewmodel.BaseViewModel

class RegistrationScreenViewModel(private val interactor: RegistrationScreenInteractor) : BaseViewModel<RegistrationScreenViewState, RegistrationScreenSideEffects>(
    RegistrationScreenViewState.Idle
) {
    val scope = (viewModelScope + coroutineExceptionHandler)


    private fun loadData() = orbitIntent {
        scope.launch(Dispatchers.IO) {
            val result =  interactor.isNetworkAvailable()
            println("результат $result")
            reduce {
                RegistrationScreenViewState.Loading
            }
        }
    }

    override fun intentHandler(intent: Any) {
        when(intent){
        }
    }
}