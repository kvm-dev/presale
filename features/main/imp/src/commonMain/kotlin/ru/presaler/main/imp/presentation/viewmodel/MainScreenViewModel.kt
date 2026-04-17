package ru.presaler.main.imp.presentation.viewmodel

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.plus
import ru.presaler.main.imp.domain.interactor.MainScreenInteractor
import ru.presaler.main.imp.presentation.ui.MainScreenIntents
import ru.presaler.main.imp.presentation.ui.MainScreenSideEffects
import ru.presaler.main.imp.presentation.ui.MainScreenViewState
import ru.presaler.viewmodel.BaseViewModel

class MainScreenViewModel(private val interactor: MainScreenInteractor) : BaseViewModel<MainScreenViewState, MainScreenSideEffects>(
    MainScreenViewState.LoadingState){

    val scope = (viewModelScope + coroutineExceptionHandler)

    private val _isKnowHowToUseSlider = MutableStateFlow(false)

    fun initViewModel() = orbitIntent {
        val job = scope.launch(Dispatchers.IO + coroutineExceptionHandler) {
            reduce { MainScreenViewState.SuccessState(
                isNetworkAvailable = true,
                isAsModeEnabled = true,
                userName = "kerim",
                currentAddress = "street"
            ) }

        }
        if(!job.isActive) job.join()
    }

    override fun intentHandler(intent: Any) {
        when(intent){
            MainScreenIntents.InitViewModelIntent -> initViewModel()
            else -> {
                //todo
            }
            }
        }
    }
