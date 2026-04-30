package ru.presaler.registration.api.domain.model.response

data class ConfirmRegistrationResponseDomain(
    val success: Boolean,
    val userToken: String,
    val errorMsg: String,
)