package ru.presaler.registration.imp.data.network

import ru.presaler.registration.api.domain.model.request.ConfirmRegistrationRequestDomain
import ru.presaler.registration.api.domain.model.request.RegistrationRequestDomain
import ru.presaler.registration.api.domain.model.response.ConfirmRegistrationResponseDomain
import ru.presaler.registration.api.domain.model.response.RegistrationResponseDomain
import ru.presaler.registration.imp.mapper.Mapper

class NetworkDataSource(private val api: RegistrationApi){

    suspend fun registration(request: RegistrationRequestDomain): RegistrationResponseDomain {
        return Mapper.mapRegistrationResponseToDomain(api.registration(Mapper.mapRegistrationRequestFromDomain(request)))
    }

    suspend fun confirmRegistration(request: ConfirmRegistrationRequestDomain): ConfirmRegistrationResponseDomain {
        return Mapper.mapConfirmRegistrationResponseToDomain(api.confirmRegistration(Mapper.mapConfirmRegistrationRequestFromDomain(request)))
    }
}