package ru.presaler.network.di

import org.koin.dsl.module
import ru.presaler.network.HttpClientProvider

val networkModule = module {
    single { HttpClientProvider.client }
}

