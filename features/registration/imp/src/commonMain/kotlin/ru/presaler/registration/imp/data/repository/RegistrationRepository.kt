package ru.presaler.registration.imp.data.repository

import ru.presaler.registration.api.domain.model.request.ConfirmRegistrationRequestDomain
import ru.presaler.registration.api.domain.model.request.RegistrationRequestDomain
import ru.presaler.registration.api.domain.model.response.ConfirmRegistrationResponseDomain
import ru.presaler.registration.imp.data.local.LocalDataSource
import ru.presaler.registration.imp.data.network.NetworkDataSource

class RegistrationRepository(private val networkDataSource: NetworkDataSource, private val localDataSource: LocalDataSource) {
    suspend fun registration(request: RegistrationRequestDomain) = networkDataSource.registration(request)

    suspend fun confirmRegistration(request: ConfirmRegistrationRequestDomain): ConfirmRegistrationResponseDomain{
        val response = networkDataSource.confirmRegistration(request)
        if(response.success && response.userToken.isNotEmpty()){
            localDataSource.saveUserTokenToLocal(response.userToken)
        }
        return response
    }
}