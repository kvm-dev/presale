package ru.presaler.registration.imp.domain.usecase

import ru.presaler.registration.api.domain.model.request.ConfirmRegistrationRequestDomain
import ru.presaler.registration.api.domain.model.response.ConfirmRegistrationResponseDomain
import ru.presaler.registration.api.domain.usecase.ConfirmRegistrationUseCase
import ru.presaler.registration.imp.data.repository.RegistrationRepository

class ConfirmRegistrationUseCaseImp(private val repository: RegistrationRepository): ConfirmRegistrationUseCase {
    override suspend fun confirmRegistration(request: ConfirmRegistrationRequestDomain): ConfirmRegistrationResponseDomain {
        return repository.confirmRegistration(request)
    }
}