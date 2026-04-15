package ru.presaler.utils.navigationScreens

import kotlinx.serialization.Serializable

@Serializable
sealed class AppDestinations{
    @kotlinx.serialization.Serializable
    data object Splash: AppDestinations()
    @Serializable
    data object Authorization: AppDestinations()

    @Serializable
    data object Main: AppDestinations()

    @Serializable
    data object Search: AppDestinations()

    @Serializable
    data object SaleList: AppDestinations()

    @Serializable
    data object SaleInner: AppDestinations()

    @Serializable
    data object Orders: AppDestinations()

    @Serializable
    data object Suppliers: AppDestinations()
    @Serializable
    data object Profile: AppDestinations()
}

fun getDestinationsList() = listOf(
    AppDestinations.Splash,
    AppDestinations.Authorization,
    AppDestinations.Main,
    AppDestinations.Search,
    AppDestinations.Suppliers,
    AppDestinations.Orders,
    AppDestinations.Profile,
    AppDestinations.SaleList,
    AppDestinations.SaleInner
)
fun getLabel(destinations: AppDestinations): String?{
    when(destinations){
        is AppDestinations.Main ->{
            return "Главная"
        }
        is AppDestinations.Suppliers -> {
            return "Поставщики"
        }
        is AppDestinations.Orders -> {
            return "Заказы"
        }
        else -> return null
    }
}