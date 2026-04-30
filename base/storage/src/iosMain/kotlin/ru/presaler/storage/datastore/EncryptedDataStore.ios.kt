package ru.presaler.storage.datastore

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import platform.Foundation.NSUserDefaults

actual class EncryptedDataStore {

    val ACCESS_TOKEN_KEY = "ACCESS_TOKEN"

    private val userDefaults = NSUserDefaults.standardUserDefaults()

    actual val accessToken: Flow<String>
        get() {
            return flow {
                emit(userDefaults.stringForKey(ACCESS_TOKEN_KEY)?: "")
            }
        }

    actual suspend fun saveToken(userToken: String) {
        userDefaults.setObject(userToken, forKey = ACCESS_TOKEN_KEY)
    }

    actual suspend fun clearUserData() {
        userDefaults.removeObjectForKey(ACCESS_TOKEN_KEY)
        userDefaults.synchronize()
    }

}