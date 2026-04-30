package ru.presaler.registration.imp.data.local

import ru.presaler.storage.datastore.EncryptedDataStore

class LocalDataSource(private val encryptedDataStore: EncryptedDataStore) {

    suspend fun saveUserTokenToLocal(userToken: String){
        encryptedDataStore.saveToken(userToken)
    }
}