package ru.presaler.registration.api.domain.model.request

data class RegistrationRequestDomain(
    val userType: RegistrationUserTypeDomain,
    val phone: String,
    val email: String,
    val ipFio: String? = null,
    val ipInn: String? = null,
    val ipOgrn: String? = null,
    val ipAddress: String? = null,
    val legalName: String? = null,
    val legalInn: String? = null,
    val legalKpp: String? = null,
    val legalOgrn: String? = null,
    val legalAddress: String? = null,
    val legalFactAddress: String? = null
)