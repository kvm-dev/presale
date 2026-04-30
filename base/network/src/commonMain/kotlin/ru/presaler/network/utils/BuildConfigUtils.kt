package ru.presaler.network.utils

import Presaler.base.network.APP_VERSION
import Presaler.base.network.BASE_URL_PRODUCTION
import Presaler.base.network.BASE_URL_TEST
import Presaler.base.network.BUILD_TYPE
import ru.presaler.network.model.BuildType
import ru.presaler.network.model.PlatformType
import ru.presaler.network.platform

fun getBuildType(): BuildType {
    return if(BUILD_TYPE.contains("debug")) BuildType.DEBUG else BuildType.RELEASE
}

fun getCurrentVersion() = APP_VERSION

fun getPlatform(): PlatformType {
    return if(platform().contains("Android")) PlatformType.ANDROID else PlatformType.IOS
}

fun getBaseUrl(): String{
    return if(getBuildType() == BuildType.DEBUG) BASE_URL_TEST else BASE_URL_PRODUCTION
}
