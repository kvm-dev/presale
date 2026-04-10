rootProject.name = "Presaler"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

include(":composeApp")
include(":base:ui")
include(":base:network")
include(":base:notifications")
include(":base:storage")
include(":base:navigation")
include(":base:utils")
include(":base:viewmodel")
include(":features:asmode:api")
include(":features:asmode:imp")
include(":features:networkconnection:api")
include(":features:splash:api")
include(":features:splash:imp")
include(":features:main:api")
include(":features:main:imp")
include(":features:search:api")
include(":features:search:imp")
