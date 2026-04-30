package ru.presaler.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalRippleConfiguration
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import ru.presaler.main.imp.presentation.ui.MainScreen
import ru.presaler.splash.imp.presentation.ui.SplashScreen
import ru.presaler.ui.icons.MainIcon
import ru.presaler.ui.icons.OrdersIcon
import ru.presaler.ui.icons.SuppliersIcon
import ru.presaler.ui.theme.MainOrangeLight
import ru.presaler.ui.theme.MainPinkLight
import ru.presaler.ui.theme.SelectedNavigationColor
import ru.presaler.ui.theme.UnselectedNavigationColor
import ru.presaler.ui.utils.NoRippleConfiguration
import ru.presaler.utils.navigationScreens.AppDestinations
import ru.presaler.utils.navigationScreens.getDestinationsList
import ru.presaler.utils.navigationScreens.getLabel

@Suppress("SuspiciousIndentation")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationApp() {
    var isShowNavBar by remember { mutableStateOf(false) }
    val navController = rememberNavController() // Инициализация контроллера навигации
    val allNavigationItems = getDestinationsList()
    val navigationBarItemColors = NavigationBarItemDefaults.colors(
        indicatorColor = Color.Transparent, // Color of the selected item's indicator
        selectedIconColor = SelectedNavigationColor, // Color of the icon when selected
        unselectedIconColor = UnselectedNavigationColor, // Color of the icon when unselected
        selectedTextColor = SelectedNavigationColor, // Color of the text when selected
        unselectedTextColor = UnselectedNavigationColor // Color of the text when unselected
    )
    val modifier = Modifier
        .fillMaxSize()
        .background(
            brush = Brush.verticalGradient(
                colors = listOf(
                    MainOrangeLight,
                    MainPinkLight
                )
            )
        )

    Scaffold(
        containerColor = Color.Transparent,
        bottomBar = {
            if(isShowNavBar){
                HorizontalDivider(Modifier.padding(horizontal = 20.dp), 1.dp, UnselectedNavigationColor)
                BottomAppBar(
                    containerColor = Color.Transparent,
                    modifier = Modifier
                        .padding(top = 10.dp)
                ){
                    NavigationBar(
                        containerColor = Color.Transparent
                    )  {
                        val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.id // Текущий маршрут
                        allNavigationItems.forEach { item ->
                            CompositionLocalProvider(LocalRippleConfiguration provides NoRippleConfiguration) {
                                when(item){
                                    is AppDestinations.Main -> {
                                        NavigationBarItem(
                                            colors = navigationBarItemColors,
                                            icon = {
                                                Icon(
                                                    imageVector = MainIcon, // Reference your ImageVector from the .kt file
                                                    contentDescription = getLabel(destinations = item),
                                                    modifier = Modifier.size(32.dp),
                                                )
                                            },
                                            label = { Text(getLabel(destinations = item)?:"") },
                                            selected = currentRoute == item.hashCode(),
                                            onClick = {
                                                navController.navigate(item) {
                                                    popUpTo(navController.graph.findStartDestination().id) {
                                                        saveState = true
                                                    }
                                                    launchSingleTop = true
                                                    restoreState = true
                                                }
                                            }
                                        )
                                    }
                                    is AppDestinations.Suppliers -> {
                                        NavigationBarItem(
                                            colors = navigationBarItemColors,
                                            icon = {
                                                Icon(
                                                    imageVector = SuppliersIcon,
                                                    contentDescription = null,
                                                    modifier = Modifier.size(32.dp),
                                                )
                                            },
                                            label = { Text(getLabel(destinations = item)?:"") },
                                            selected = currentRoute == item.hashCode(),
                                            onClick = {
                                                navController.navigate(item) {
                                                    popUpTo(navController.graph.findStartDestination().id) {
                                                        saveState = true
                                                    }
                                                    launchSingleTop = true
                                                    restoreState = true
                                                }
                                            }
                                        )
                                    }
                                    is AppDestinations.Orders -> {
                                        NavigationBarItem(
                                            colors = navigationBarItemColors,
                                            icon = {
                                                Icon(
                                                    imageVector = OrdersIcon, // Reference your ImageVector from the .kt file
                                                    contentDescription = getLabel(destinations = item),
                                                    modifier = Modifier.size(32.dp),
                                                )
                                            },
                                            label = { Text(getLabel(destinations = item)?:"") },
                                            selected = currentRoute == item.hashCode(),
                                            onClick = {
                                                navController.navigate(item) {
                                                    // Опции навигации, например, чтобы избежать повторных входов в один и тот же экран
                                                    popUpTo(navController.graph.findStartDestination().id) {
                                                        saveState = true
                                                    }
                                                    launchSingleTop = true
                                                    restoreState = true
                                                }
                                            }
                                        )
                                    }
                                    else->{}
                                }
                            }
                        }
                    }
                }
            }
        }
    ) { innerPadding ->
        NavHost(modifier = modifier,
            navController = navController,
            startDestination = AppDestinations.Main
        ){
            // Определяем маршруты и их Composable-функции
            composable<AppDestinations.Main> {
                MainScreen(
                    innerPadding = innerPadding,
                    onNavigationAuthorization = {
                        navController.navigate(route = AppDestinations.Authorization)
                        { popUpTo(AppDestinations.Splash){
                            inclusive = true
                        }}
                        isShowNavBar = false
                    },
                    navController = navController,
                    saleDestination = AppDestinations.SaleInner,
                    onclickSearch =  {
                        isShowNavBar = false
                    }
                )
                isShowNavBar = true
            }

            composable<AppDestinations.Splash> {
                SplashScreen(onNavigateToHome = {
                    navController.navigate(route = AppDestinations.Main)
                    {popUpTo(AppDestinations.Splash){
                        inclusive = true
                    }}
                    isShowNavBar = true
                },
                    onNavigationAuthorization = {
                        navController.navigate(route = AppDestinations.Authorization)
                        { popUpTo(AppDestinations.Splash){
                            inclusive = true
                        }}
                        isShowNavBar = false
                    })
            }
        }
    }
}