package ru.presaler.storage.model

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class ProfileTrader(
    @SerialName("userId") val userId: Int,
    @SerialName("userName") val userName: String,
    @SerialName("userType") val userType: String,
    @SerialName("userStatus") val userStatus: Int,
    @SerialName("userEmail") val userEmail: String,
    @SerialName("userPhone") val userPhone: String,
    @SerialName("userRole") val userRole: Int,
    @SerialName("userInn") val userInn: String,
    @SerialName("userOgrn") val userOgrn: String,
    @SerialName("userFactAddress") val userFactAddress: String,
    @SerialName("userKpp") val userKpp: String,
    @SerialName("userLegalAddress") val userLegalAddress: String,
    @SerialName("tradePointAddressList") val tradePointAddressList: List<TradePointsAddressList>,
    @SerialName("errorMsg") val errorMsg: String
)

@kotlinx.serialization.Serializable
data class TradePointsAddressList(
    @SerialName("uId") val uId: Int,
    @SerialName("address") val address: String,
    @SerialName("isActive") val isActive: Boolean,
)