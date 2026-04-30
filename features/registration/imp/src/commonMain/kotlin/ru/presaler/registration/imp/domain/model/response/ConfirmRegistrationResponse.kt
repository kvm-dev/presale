package ru.presaler.registration.imp.domain.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ConfirmRegistrationResponse(
    @SerialName("success") val success: Boolean,
    @SerialName("userToken") val userToken: String,
    @SerialName("errorMsg") val errorMsg: String,
)