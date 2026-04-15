package ru.presaler.main.imp.di

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import ru.presaler.main.imp.domain.interactor.MainScreenInteractor
import ru.presaler.main.imp.presentation.viewmodel.MainScreenViewModel

val mainModule = module {
    single<MainScreenInteractor> { MainScreenInteractor() }
    viewModelOf(::MainScreenViewModel)
}