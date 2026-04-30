package ru.presaler.storage.data.local

import ru.presaler.storage.AppDatabase
import ru.presaler.storage.data.drivers.DatabaseDriverFactory
import ru.presaler.storage.mapper.Mapper
import ru.presaler.storage.model.ProfileTrader

class LocalDataSource(databaseDriverFactory: DatabaseDriverFactory) {
    private val database = AppDatabase.Companion(databaseDriverFactory.createDriver())
    private val dbQuery = database.appDatabaseQueries

    internal fun getTraderProfile(): ProfileTrader? {
        try {
            val profile = dbQuery.selectTraderProfile().executeAsOne()
            val address = dbQuery.selectTradePointAddress().executeAsList().filter { it.userId == profile.userId }
            return ProfileTrader(
                userId = profile.userId.toInt(),
                userName = profile.userName,
                userType = profile.userType,
                userStatus = profile.userStatus.toInt(),
                userEmail = profile.userEmail,
                userPhone = profile.userPhone,
                userRole = profile.userRole.toInt(),
                userInn = profile.userInn,
                userOgrn = profile.userOgrn,
                userKpp = profile.userKpp,
                userFactAddress = profile.userFactAddress,
                userLegalAddress = profile.userLegalAddress,
                tradePointAddressList = Mapper.mapTradePointAddress(address),
                errorMsg = ""


            )
        }
        catch (_: Exception) {
            return null
        }
    }

    internal fun clearAndSaveTraderProfile(profileTrader: ProfileTrader){
        try {
            dbQuery.clearAllTraderProfiles()
            dbQuery.clearAllTraderPointAddress()
            dbQuery.insertTraderProfile(
                userId = profileTrader.userId.toLong(),
                userName = profileTrader.userName,
                userType = profileTrader.userType,
                userStatus = profileTrader.userStatus.toLong(),
                userEmail = profileTrader.userEmail,
                userPhone = profileTrader.userPhone,
                userRole = profileTrader.userRole.toLong(),
                userInn = profileTrader.userInn,
                userOgrn = profileTrader.userOgrn,
                userKpp = profileTrader.userKpp,
                userFactAddress = profileTrader.userFactAddress,
                userLegalAddress = profileTrader.userLegalAddress,

            )
            profileTrader.tradePointAddressList.forEach { traderPoint->
                dbQuery.insertTradePointAddress(
                    userId = profileTrader.userId.toLong(),
                    address = traderPoint.address,
                    isActive = if(traderPoint.isActive) { 1L } else { 0L},
                    uId = traderPoint.uId.toLong())
            }
        }
        catch (e: Exception) {
            throw e
        }
    }
}