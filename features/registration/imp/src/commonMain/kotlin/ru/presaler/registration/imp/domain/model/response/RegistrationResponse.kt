package ru.presaler.registration.imp.domain.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RegistrationResponse(
    @SerialName("success") val success: Boolean,
    @SerialName("errorMsg") val errorMsg: String,
)