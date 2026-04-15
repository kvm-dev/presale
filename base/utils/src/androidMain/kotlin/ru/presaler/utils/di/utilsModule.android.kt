package ru.presaler.utils.di

import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module
import ru.presaler.utils.BrowserUtils
import ru.presaler.utils.ShareUtils

actual val utilsModule: Module
    get() =  module {
        single<BrowserUtils> { BrowserUtils(platformContext = androidContext()) }
        single<ShareUtils> { ShareUtils(platformContext = androidContext()) }
    }