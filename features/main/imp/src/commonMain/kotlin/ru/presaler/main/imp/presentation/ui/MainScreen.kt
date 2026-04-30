package ru.presaler.main.imp.presentation.ui

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.backhandler.BackHandler
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.datetime.format.Padding
import org.jetbrains.compose.resources.imageResource
import org.jetbrains.compose.resources.painterResource
import org.koin.compose.viewmodel.koinViewModel
import org.orbitmvi.orbit.compose.collectAsState
import org.orbitmvi.orbit.compose.collectSideEffect
import ru.presaler.main.imp.presentation.viewmodel.MainScreenViewModel
import ru.presaler.ui.components.TextInput
import ru.presaler.ui.components.authorizationError2
import ru.presaler.ui.components.text
import ru.presaler.ui.components.tradePointScreen
import ru.presaler.ui.components.tradePointsCard
import ru.presaler.ui.components.trancparentButton
import ru.presaler.ui.components.userTypeLegal
import ru.presaler.ui.icons.AppIcon
import ru.presaler.ui.icons.OrdersIcon
import ru.presaler.ui.icons.TraderPointIcon
import ru.presaler.ui.theme.TextStyles.addressText
import ru.presaler.ui.theme.TextStyles.chipsStyle
import ru.presaler.ui.theme.TextStyles.companyText
import ru.presaler.ui.theme.TextStyles.offersText
import ru.presaler.ui.theme.TextStyles.saleText
import ru.presaler.ui.theme.TextStyles.srcGrayText
import ru.presaler.ui.theme.TextStyles.srcWhiteText
import ru.presaler.ui.theme.TextStyles.textArea
import ru.presaler.ui.components.CurrentScreenScroll
import ru.presaler.ui.components.SearchScreen
import ru.presaler.ui.components.SwitchButton
import ru.presaler.utils.model.BaseErrors
import ru.presaler.utils.navigationScreens.AppDestinations

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun MainScreen(innerPadding: PaddingValues, viewModel: MainScreenViewModel = koinViewModel(), onNavigationAuthorization: ()->Unit, onclickSearch: ()->Unit, navController: NavController, saleDestination: AppDestinations.SaleInner) {

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
//          val successState = state as MainScreenViewState.SuccessState
//          isRefreshing = false
//          val isShowAchievementDialog  = remember { mutableStateOf(false) }
//          val selectedAchievement  = remember { mutableIntStateOf(0) }

            //--------------------------------------------------Business


            authorizationError2()

                //--------------------------------------------------=-




            var selected=SwitchButton(
                text1="Текущий",
                text2="История",
                Height=60.dp,
                Width=178.dp,
                Padding=70.dp,
                BackgroundColor=Color.White,
                ContentAligment = Alignment.TopCenter
            )
            val indicatorOffset1 by animateDpAsState(
                targetValue = if (selected == 0) 0.dp else -400.dp,
                animationSpec = tween(250)
            )
            val indicatorOffset2 by animateDpAsState(
                targetValue = if (selected == 1) 0.dp else 400.dp,
                animationSpec = tween(250)
            )
            if(selected==0)
                Box(
                    modifier = Modifier
                        .offset(x=indicatorOffset1)
                ){
                    CurrentScreenScroll()
                } else
                    Box(
                        modifier = Modifier
                            .offset(x=indicatorOffset2)
                    ){
                        CurrentScreenScroll()
                    }



//            Box(
//            modifier = Modifier
//            ){
//                Box(
//                    modifier = Modifier
//                        .padding(top = 50.dp, start = 6.dp)
//                ){
//                    Icon(
//                        imageVector = AppIcon,
//                        contentDescription = "AppIcon",
//                        tint = Color.Unspecified,
//                        modifier = Modifier.size(75.dp),
//                        modifier = Modifier.size(76.dp),
//                    )
//                    Text(
//                        text = "Заказчик:",
//                        style = srcGrayText(),
//                        modifier = Modifier
//                            .padding(start = 75.dp, top = 10.dp)
//                            .padding(start = 76.dp, top = 10.dp)
//                    )
//                    Text(
//                        text = "Пупкина Анна Михайловна",
//                        style = srcWhiteText(),
//                        modifier = Modifier
//                            .padding(start = 75.dp, top = 32.dp)
//                            .padding(start = 76.dp, top = 32.dp)
//                    )
//                    Icon(
//                        imageVector = ExitIcon,
//                        contentDescription = "ChangeIcon",
//                        tint = Color.Unspecified,
//                        modifier = Modifier
////                            .padding(start = 316.dp, top = 16.dp)
////                            .size(36.dp)
////                            .clickable(
//                                onClick = { }
//                            )
//                    )
//                }
//                Box(
//                    modifier = Modifier
//                        .padding(top = 120.dp, start = 8.dp)
//                        .width(width = 350.dp)
//                ){
//                    Icon(
//                        imageVector = TraderPointIcon,
//                        contentDescription = "TraderPointIcon",
//                        tint = Color.Unspecified,
//                        modifier = Modifier.size(65.dp),
//                    )
//                    Text(
//                        text = "г. Симферополь, ул. Пушкина, д. Колотушкина",
//                        style = addressText(),
//                        modifier = Modifier
//                            .padding(start = 80.dp, top = 15.dp)
//                            .padding(start = 80.dp, top = 16.dp)
//                    )
//                    Icon(
//                        imageVector = ChangeIcon,
//                        contentDescription = "ChangeIcon",
//                        tint = Color.Unspecified,
//                        modifier = Modifier
//                            .padding(start = 310.dp, top = 16.dp)
//                            .size(36.dp)
//                            .clickable(
//                                enabled = true,
//                                onClick = { }
//                            )
//                    )
//                }
//                val keyword = remember { mutableStateOf("") }
//                Box(
//                    modifier = Modifier
//                        .padding(top = 190.dp, start = 18.dp, end = 18.dp),
//                ) {
//                    TextField(
//                        value = keyword.value,
//                        onValueChange = { keyword.value = it },
//                        leadingIcon = { },
//                        trailingIcon =  {
//                            IconButton(onClick = { keyword.value = "" }) {
//                                Icon(
//                                    imageVector = AppIcon,
//                                    contentDescription = "Clear"
//                                )
//                            }
//                        },
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .height(55.dp),
//                        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
//                        placeholder = { Text("Поиск товаров и категорий", color = Color.LightGray, fontSize = 16.sp)},
//                        shape = RoundedCornerShape(13.dp),
//                        singleLine = true,
//                        colors = TextFieldDefaults.colors(
//                            focusedIndicatorColor = Color.Transparent,
//                            unfocusedIndicatorColor = Color.Transparent,
//                            errorIndicatorColor = Color.Transparent,
//                            focusedContainerColor = Color.White,
//                            unfocusedContainerColor = Color.White
//                        )
//                    )
//                    SearchField(keyword)
//                }
//                Box(
//                    modifier = Modifier
//                        .padding(top = 250.dp, start = 8.dp)
//                ){
//                    Text(
//                        text = "Акции и скидки у поставщиков",
//                        style = offersText(),
//                        modifier = Modifier
//                            .padding(start = 18.dp, top = 15.dp)
//                    )
//                }
//                Box(
//                    modifier = Modifier
//                        .padding(top = 300.dp, start = 8.dp)
//                ){
//                    LazyRow(
//                        horizontalArrangement = Arrangement.spacedBy(12.dp),
//                        contentPadding = PaddingValues(horizontal = 16.dp),
//                    ) {
//                        items(20) { item ->
//                            Card(
//                                modifier = Modifier
//                                    .width(300.dp)
//                                    .height(270.dp),
//                                colors = CardDefaults.cardColors(
//                                    containerColor = Color.Black.copy(alpha = 0f)),
//                                shape = RoundedCornerShape(16.dp)
//                            ) {
//                                Column () {
//                                        Image(imageVector = AppIcon,
//                                            contentDescription = "",
//                                            contentScale = ContentScale.Crop ,
//                                            modifier = Modifier
//                                                .height(180.dp)
//                                                .clip(RoundedCornerShape(16.dp))
//                                            )
//                                        Text(
//                                            text="ООО ''Простоквашино''",
//                                            style = companyText(),
//                                            modifier = Modifier
//                                                .padding(top=10.dp)
//                                        )
//                                        Text(
//                                            text="Скидка на молочную продукцию до 15%",
//                                            style = saleText(),
//                                            modifier = Modifier
//                                                .padding(top=10.dp)
//                                        )
//                                    .height(270.dp)
//                                    .clickable(onClick = {})
//                                    .clip(RoundedCornerShape(16.dp)),
//                                colors = CardDefaults.cardColors(
//                                    containerColor = Color.Black.copy(alpha = 0f)),
//                            ) {
//                                Column (
//                                    modifier = Modifier
//                                        .padding(horizontal = 10.dp)
//                                ) {
//                                    Image(imageVector = AppIcon,
//                                        contentDescription = "",
//                                        contentScale = ContentScale.Crop ,
//                                        modifier = Modifier
//                                            .height(180.dp)
//                                            .clip(RoundedCornerShape(16.dp))
//                                    )
//                                    Text(
//                                        text="ООО ''Простоквашино''",
//                                        maxLines = 1,
//                                        overflow = TextOverflow.Ellipsis,
//                                        style = companyText(),
//                                        modifier = Modifier
//                                            .padding(top=10.dp)
//                                    )
//                                    Text(
//                                        text="Скидка на молочную продукцию до 15%",
//                                        maxLines = 2,
//                                        overflow = TextOverflow.Ellipsis,
//                                        style = saleText(),
//                                        modifier = Modifier
//                                            .padding(top=10.dp)
//                                    )
//                                }
//                            }
//                        }
//                    }
//                }
          }
     }
    }

//            }

