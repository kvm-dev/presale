package ru.presaler.registration.imp.domain.model.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RegistrationRequest(
    @SerialName("userType") val userType: String,
    @SerialName("phone") val phone: String,
    @SerialName("email") val email: String,
    @SerialName("ipFio") val ipFio: String,
    @SerialName("ipInn") val ipInn: String,
    @SerialName("ipOgrn") val ipOgrn: String,
    @SerialName("ipAddress") val ipAddress: String,
    @SerialName("legalName") val legalName: String,
    @SerialName("legalInn") val legalInn: String,
    @SerialName("legalKpp") val legalKpp: String,
    @SerialName("legalOgrn") val legalOgrn: String,
    @SerialName("legalAddress") val legalAddress: String,
    @SerialName("legalFactAddress") val legalFactAddress: String)