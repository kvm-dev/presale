package ru.presaler.registration.api.domain.usecase

import ru.presaler.registration.api.domain.model.request.RegistrationRequestDomain
import ru.presaler.registration.api.domain.model.response.RegistrationResponseDomain

interface RegistrationUseCase{
    suspend fun registration(request: RegistrationRequestDomain): RegistrationResponseDomain
}