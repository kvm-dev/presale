package ru.presaler.registration.imp.domain.model.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ConfirmRegistrationRequest(
    @SerialName("email") val email: String,
    @SerialName("code") val code: String
)