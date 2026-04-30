package ru.presaler.registration.imp.data.network

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.HttpStatusCode
import ru.presaler.network.utils.disableAuthKey
import ru.presaler.network.utils.exceptionHandler
import ru.presaler.network.utils.getBaseUrl
import ru.presaler.registration.imp.domain.model.request.ConfirmRegistrationRequest
import ru.presaler.registration.imp.domain.model.request.RegistrationRequest
import ru.presaler.registration.imp.domain.model.response.ConfirmRegistrationResponse
import ru.presaler.registration.imp.domain.model.response.RegistrationResponse

class RegistrationApi(private val client: HttpClient) {

    val baseUrl = getBaseUrl()
    suspend fun registration(request: RegistrationRequest): RegistrationResponse {
        val result = with(client) {
            post("$baseUrl${RegistrationEndpoints.registration}"){
                attributes.put(disableAuthKey, true)
                setBody(request)
            }
        }
        return if(result.status == HttpStatusCode.OK) {
            result.body<RegistrationResponse>()
        } else{
            RegistrationResponse(errorMsg = exceptionHandler(result.status).message?: "", success = false)
        }
    }

    suspend fun confirmRegistration(request: ConfirmRegistrationRequest): ConfirmRegistrationResponse {
        val result = with(client) {
            post("$baseUrl${RegistrationEndpoints.confirmation}"){
                attributes.put(disableAuthKey, true)
                setBody(request)
            }
        }
        return if(result.status == HttpStatusCode.OK) {
            result.body<ConfirmRegistrationResponse>()
        } else{
            ConfirmRegistrationResponse(errorMsg = exceptionHandler(result.status).message?: "", success = false, userToken = "")
        }
    }
}