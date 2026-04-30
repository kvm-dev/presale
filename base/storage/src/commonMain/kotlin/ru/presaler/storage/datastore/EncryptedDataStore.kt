package ru.presaler.storage.datastore

import kotlinx.coroutines.flow.Flow

expect class EncryptedDataStore {

    val accessToken: Flow<String>

    suspend fun saveToken(userToken: String)
    suspend fun clearUserData()

}