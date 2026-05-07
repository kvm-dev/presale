package ru.presaler.splash.imp.domain.interactor

import ru.presaler.networkconnection.api.domain.usecase.GetNetworkStateUseCase
import ru.presaler.storage.datastore.EncryptedDataStore

class SplashScreenInteractor
    (
    private val networkStateUseCase: GetNetworkStateUseCase,
            encryptedDataStore: EncryptedDataStore){

    val useToken = encryptedDataStore.accessToken
    suspend fun isNetworkAvailable(): Boolean{
        val connection = networkStateUseCase.isNetworkAvailable()
        println("канет $connection")
        println("шо рет $connection")
        return connection
    }
}