package ru.presaler.registration.imp.domain.usecase

import ru.presaler.registration.api.domain.model.request.RegistrationRequestDomain
import ru.presaler.registration.api.domain.model.response.RegistrationResponseDomain
import ru.presaler.registration.api.domain.usecase.RegistrationUseCase
import ru.presaler.registration.imp.data.repository.RegistrationRepository

class RegistrationUseCaseImp(private val repository: RegistrationRepository): RegistrationUseCase {
    override suspend fun registration(request: RegistrationRequestDomain): RegistrationResponseDomain  = repository.registration(request)
}