package ru.presaler.storage.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "encryptedData")

actual class EncryptedDataStore(private val context: Context, private val secureEncryptor: SecureEncryptor) {
    val accessTokenKey = stringPreferencesKey("access_token")

    actual val accessToken: Flow<String> =
        context.dataStore.data.map { preferences ->
            val encryptedData = preferences[accessTokenKey] ?: ""
            if(encryptedData.isNotEmpty()){
                secureEncryptor.decrypt(encryptedData)
            }else{
                ""
            }
        }

    actual suspend fun saveToken(userToken: String) {
        context.dataStore.edit { preferences ->
            preferences[accessTokenKey] = secureEncryptor.encrypt(userToken)
        }
    }

    actual suspend fun clearUserData() {
        context.dataStore.edit {
            it.clear()
        }
    }
}