package ru.presaler.registration.imp.domain.interactor

import ru.presaler.networkconnection.api.domain.usecase.GetNetworkStateUseCase

class RegistrationScreenInteractor
    (
    private val networkStateUseCase: GetNetworkStateUseCase
){
    suspend fun isNetworkAvailable(): Boolean{
        val connection = networkStateUseCase.isNetworkAvailable()
        println("канет $connection")
        println("шо рет $connection")
        return connection
    }
}