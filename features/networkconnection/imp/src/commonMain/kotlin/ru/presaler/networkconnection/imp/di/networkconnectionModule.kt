package ru.presaler.networkconnection.imp.di

import org.koin.dsl.module
import ru.presaler.networkconnection.api.domain.usecase.GetNetworkStateUseCase
import ru.presaler.networkconnection.imp.domain.usecase.GetNetworkStateUseCaseImp

val networkConnectionModule = module {
    single<GetNetworkStateUseCase> { GetNetworkStateUseCaseImp(client = get()) }
}