package ru.presaler.storage.mapper

import ru.presaler.storage.TradePointAddress
import ru.presaler.storage.model.TradePointsAddressList

object Mapper {
    fun mapTradePointAddress(tradePointAddress: List<TradePointAddress>): List<TradePointsAddressList>{
        val list =  ArrayList<TradePointsAddressList>()
        tradePointAddress.forEach {
            list.add(TradePointsAddressList(
                uId = it.uId.toInt(),
                address = it.address,
                isActive = it.isActive == 1L
            ))
        }
        return list
        }

}