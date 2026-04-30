package ru.presaler.registration.api.domain.usecase

import ru.presaler.registration.api.domain.model.request.ConfirmRegistrationRequestDomain
import ru.presaler.registration.api.domain.model.response.ConfirmRegistrationResponseDomain

interface ConfirmRegistrationUseCase {
    suspend fun confirmRegistration(request: ConfirmRegistrationRequestDomain): ConfirmRegistrationResponseDomain
}