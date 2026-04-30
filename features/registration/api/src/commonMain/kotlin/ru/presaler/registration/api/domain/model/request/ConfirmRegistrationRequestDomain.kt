package ru.presaler.registration.api.domain.model.request

data class ConfirmRegistrationRequestDomain(
    val email: String,
    val code: String
)