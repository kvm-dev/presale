package ru.presaler.storage.data

import ru.presaler.storage.data.local.LocalDataSource
import ru.presaler.storage.model.ProfileTrader

class DataBaseSDK(private val dataSource: LocalDataSource) {

    suspend fun getTraderProfile(): ProfileTrader? = dataSource.getTraderProfile()
    suspend fun saveTraderProfile(profile: ProfileTrader) = dataSource.clearAndSaveTraderProfile(profile)
}