package ru.presaler.splash.imp.domain.interactor

import ru.presaler.networkconnection.api.domain.usecase.GetNetworkStateUseCase

class SplashScreenInteractor
    (
    private val networkStateUseCase: GetNetworkStateUseCase){
    suspend fun isNetworkAvailable(): Boolean{
        val connection = networkStateUseCase.isNetworkAvailable()
        println("канет $connection")
        println("шо рет $connection")
        return connection
    }
}