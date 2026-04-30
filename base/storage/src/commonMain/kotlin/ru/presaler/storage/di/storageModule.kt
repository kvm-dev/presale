package ru.presaler.storage.di

import org.koin.dsl.module
import ru.presaler.storage.data.DataBaseSDK
import ru.presaler.storage.data.local.LocalDataSource

val storageModule = module {
    single<LocalDataSource> { LocalDataSource(databaseDriverFactory = get()) }
    single<DataBaseSDK> { DataBaseSDK(dataSource = get()) }
}