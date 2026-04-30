package ru.presaler.registration.imp.di

import org.koin.dsl.module
import ru.presaler.registration.api.domain.usecase.ConfirmRegistrationUseCase
import ru.presaler.registration.api.domain.usecase.RegistrationUseCase
import ru.presaler.registration.imp.data.local.LocalDataSource
import ru.presaler.registration.imp.data.network.NetworkDataSource
import ru.presaler.registration.imp.data.network.RegistrationApi
import ru.presaler.registration.imp.data.network.RegistrationEndpoints
import ru.presaler.registration.imp.data.repository.RegistrationRepository
import ru.presaler.registration.imp.domain.usecase.ConfirmRegistrationUseCaseImp
import ru.presaler.registration.imp.domain.usecase.RegistrationUseCaseImp

val registrationModule = module {
    single<RegistrationEndpoints> { RegistrationEndpoints }
    single<RegistrationApi> { RegistrationApi(client = get()) }
    single<LocalDataSource> { LocalDataSource(encryptedDataStore = get()) }
    single<NetworkDataSource> { NetworkDataSource(api = get()) }
    single<RegistrationRepository> { RegistrationRepository(networkDataSource = get(), localDataSource = get()) }
    single<RegistrationUseCase> { RegistrationUseCaseImp(repository = get()) }
    single<ConfirmRegistrationUseCase> { ConfirmRegistrationUseCaseImp(repository = get()) }
}