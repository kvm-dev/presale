package ru.presaler.registration.imp.mapper

import ru.presaler.registration.api.domain.model.request.ConfirmRegistrationRequestDomain
import ru.presaler.registration.api.domain.model.request.RegistrationRequestDomain
import ru.presaler.registration.api.domain.model.request.RegistrationUserTypeDomain
import ru.presaler.registration.api.domain.model.response.ConfirmRegistrationResponseDomain
import ru.presaler.registration.api.domain.model.response.RegistrationResponseDomain
import ru.presaler.registration.imp.domain.model.request.ConfirmRegistrationRequest
import ru.presaler.registration.imp.domain.model.request.RegistrationRequest
import ru.presaler.registration.imp.domain.model.response.ConfirmRegistrationResponse
import ru.presaler.registration.imp.domain.model.response.RegistrationResponse

object Mapper {
    fun mapRegistrationRequestFromDomain(request: RegistrationRequestDomain): RegistrationRequest{
        return RegistrationRequest(
            userType = if (request.userType == RegistrationUserTypeDomain.IP) {"ip"} else {"legal"},
            phone = request.phone,
            email = request.email,
            ipFio = request.ipFio?: "",
            ipInn = request.ipInn?: "",
            ipOgrn = request.ipOgrn?: "",
            ipAddress = request.ipAddress?: "",
            legalName = request.legalName?: "",
            legalInn = request.legalInn?: "",
            legalOgrn = request.legalOgrn?: "",
            legalKpp = request.legalKpp?: "",
            legalAddress = request.legalAddress?: "",
            legalFactAddress = request.legalFactAddress?: ""
        )
    }
    fun mapRegistrationResponseToDomain(response: RegistrationResponse): RegistrationResponseDomain{
        return RegistrationResponseDomain(
            success = response.success,
            errorMsg = response.errorMsg
        )
    }

    fun mapConfirmRegistrationRequestFromDomain(request: ConfirmRegistrationRequestDomain): ConfirmRegistrationRequest {
        return ConfirmRegistrationRequest(
            email = request.email,
            code = request.code
        )
    }

    fun mapConfirmRegistrationResponseToDomain(response: ConfirmRegistrationResponse): ConfirmRegistrationResponseDomain {
        return ConfirmRegistrationResponseDomain(
            success = response.success,
            userToken = response.userToken,
            errorMsg = response.errorMsg
        )
    }
}