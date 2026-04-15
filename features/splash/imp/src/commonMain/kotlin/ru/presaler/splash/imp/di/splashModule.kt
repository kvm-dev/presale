package ru.presaler.splash.imp.di

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import ru.presaler.splash.imp.domain.interactor.SplashScreenInteractor
import ru.presaler.splash.imp.presentation.viewmodel.SplashScreenViewModel

val splashModule = module {
    single<SplashScreenInteractor> { SplashScreenInteractor() }
    viewModelOf(::SplashScreenViewModel)
}