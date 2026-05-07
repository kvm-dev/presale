package ru.presaler.search.imp.di

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import ru.presaler.search.imp.domain.interactor.SearchScreenInteractor
import ru.presaler.search.imp.presentation.viewmodel.SearchScreenViewModel

val searchModule = module {
    single<SearchScreenInteractor> { SearchScreenInteractor(networkStateUseCase = get()) }
    viewModelOf(::SearchScreenViewModel)
}