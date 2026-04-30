package ru.presaler.storage.di

import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import ru.presaler.storage.data.drivers.DatabaseDriverFactory
import ru.presaler.storage.datastore.EncryptedDataStore
import ru.presaler.storage.datastore.SecureEncryptor

actual val storagePlatformModule = module {
    single<DatabaseDriverFactory> { DatabaseDriverFactory(context = androidContext()) }
    single<SecureEncryptor> { SecureEncryptor(context = androidContext()) }
    single<EncryptedDataStore> { EncryptedDataStore(context = androidContext(), secureEncryptor = get()) }
}