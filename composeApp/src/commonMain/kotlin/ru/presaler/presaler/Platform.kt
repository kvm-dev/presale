package ru.presaler.presaler

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform