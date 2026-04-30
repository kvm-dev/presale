package ru.presaler.network

import io.ktor.client.HttpClient

expect object HttpClientProvider {
    val client: HttpClient
}