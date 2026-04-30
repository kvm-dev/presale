package ru.presaler.storage.di

import org.koin.dsl.module
import ru.presaler.storage.data.drivers.DatabaseDriverFactory
import ru.presaler.storage.datastore.EncryptedDataStore

actual val storagePlatformModule = module {
    single<DatabaseDriverFactory> { DatabaseDriverFactory() }
    single<EncryptedDataStore> { EncryptedDataStore() }
}