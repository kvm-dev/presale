package ru.presaler.networkconnection.api.domain.usecase

interface GetNetworkStateUseCase {
    suspend fun isNetworkAvailable():Boolean
}