package ru.presaler.main.imp.presentation.ui

import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.backhandler.BackHandler
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.compose.viewmodel.koinViewModel
import org.orbitmvi.orbit.compose.collectAsState
import org.orbitmvi.orbit.compose.collectSideEffect
import ru.presaler.main.imp.presentation.viewmodel.MainScreenViewModel
import ru.presaler.utils.model.BaseErrors
import ru.presaler.utils.navigationScreens.AppDestinations

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun MainScreen(viewModel: MainScreenViewModel = koinViewModel(), onNavigationAuthorization: ()->Unit, onclickSearch: ()->Unit, navController: NavController, saleDestination: AppDestinations.SaleInner) {

    val state by viewModel.collectAsState()

    var showExitBottomSheet by remember { mutableStateOf(false) }

    BackHandler(enabled = true) {
        showExitBottomSheet = true
    }

    var isRefreshing by remember { mutableStateOf(false) }
    val pullToRefreshState = rememberPullToRefreshState()
    val scrollState = rememberScrollState()
    val saleId  = remember { mutableIntStateOf(0) }
    val coroutineScope = rememberCoroutineScope()
    val onRefresh: () -> Unit = {
        isRefreshing = true
        coroutineScope.launch {
            // fetch something
            delay(1000)
            viewModel.intentHandler(MainScreenIntents.InitViewModelIntent)
            isRefreshing = false
        }
    }

    viewModel.collectSideEffect { sideEffect ->
//        when (sideEffect) {
//            MainScreenSideEffects.NAVIGATE_TO_AUTHORIZATION_ZONE -> {
//                viewModel.intentHandler(MainScreenIntents.GoToAuthorizationIntent)
//                onNavigationAuthorization()
//            }
//
//            MainScreenSideEffects.NAVIGATE_TO_EVENT_INNER_SCREEN -> {
//                val route = eventDestination.copy(eventId = eventId.intValue)
//                navController.navigate(route)
//            }
//
//            MainScreenSideEffects.REFRESH_SCREEN -> {
//                onRefresh()
//            }
//        }
    }

    when (state) {
        is MainScreenViewState.ErrorState -> {
            when(val errorState = (state as MainScreenViewState.ErrorState).error){
                BaseErrors.UNAUTHORIZED-> viewModel.intentHandler(MainScreenIntents.GoToAuthorizationIntent)
                else-> {
//                    BaseErrorBottomSheet(
//                        title = getUnknownErrorTitle(lang = viewModel.currentLangState.value),
//                        description = getUnknownErrorDescription(lang = viewModel.currentLangState.value),
//                        mainButtonText = getUnknownErrorMainButton(lang = viewModel.currentLangState.value),
//                        secondButtonText = getUnknownErrorSecondButton(lang = viewModel.currentLangState.value),
//                        actionMain = { closeApp() },
//                        actionSecond = { viewModel.intentHandler(MainScreenIntents.OpenChatIntent) },
//                        onDismiss = { closeApp() })
                }
            }
        }
        MainScreenViewState.LoadingState -> {
            isRefreshing = false

            isRefreshing = false
            viewModel.intentHandler(MainScreenIntents.InitViewModelIntent)
//            if (showExitBottomSheet) {
//                ExitBottomSheet(
//                    lang = viewModel.currentLangState.value, onDismissRequest = {
//                        showExitBottomSheet = false
//                    })
//            }
        }
        is MainScreenViewState.SuccessState-> {
            val successState = state as MainScreenViewState.SuccessState
            isRefreshing = false
            val isShowAchievementDialog  = remember { mutableStateOf(false) }
            val selectedAchievement  = remember { mutableIntStateOf(0) }

        }
    }
}

