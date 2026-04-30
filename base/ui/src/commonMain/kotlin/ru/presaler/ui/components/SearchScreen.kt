package ru.presaler.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.presaler.ui.icons.AppIcon
import ru.presaler.ui.icons.CloseIcon
import ru.presaler.ui.icons.FiltersIcon
import ru.presaler.ui.icons.SearchIcon
import ru.presaler.ui.icons.SortIcon
import ru.presaler.ui.theme.Purple200
import ru.presaler.ui.theme.TextStyles.greenPriceText
import ru.presaler.ui.theme.TextStyles.inCartText
import ru.presaler.ui.theme.TextStyles.searchCompanyText
import ru.presaler.ui.theme.TextStyles.searchText
import ru.presaler.ui.theme.TextStyles.yellowPriceText

@Composable
fun SearchScreen() {
    val keyword = remember { mutableStateOf("") }
    Box(
        modifier = Modifier
            .padding(top = 70.dp, start = 18.dp, end = 18.dp),
    ) {
        SearchField(keyword)
    }
    Box(
        modifier = Modifier
            .padding(top = 130.dp, start = 10.dp)
    ){
        TextButton(
            onClick = {}
        ){
            Icon(
                imageVector = FiltersIcon,
                contentDescription = null,
                tint=Color.Black,
                modifier = Modifier
                    .size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                "Фильтры",
                color=Color.Black
            )
        }
        TextButton(
            onClick = {},
            modifier = Modifier
                .padding(start = 320.dp, top = 5.dp)
        ){
            Icon(
                imageVector = SortIcon,
                contentDescription = null,
                tint=Color.Black,
                modifier = Modifier
                    .size(24.dp)
            )
        }
    }
    Box(
        modifier = Modifier
            .padding(top = 190.dp)
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(16.dp)
        ) {
            items(50) { item ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .width(160.dp)
                        .height(314.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(color = Color.White)
                        .clickable(onClick = {})
                ) {
                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .background(color = Color.White)
                    ) {
                        Image(imageVector = AppIcon,
                            contentDescription = "",
                            contentScale = ContentScale.Crop ,
                            modifier = Modifier
                                .width(156.dp)
                                .height(180.dp)
                                .clip(RoundedCornerShape(16.dp))
                        )
                        Text(
                            text="ООО ''Коровка из Кореновки''",
                            style = searchCompanyText(),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier
                                .height(20.dp)
                                .fillMaxWidth()
                                .background(color = Color(0xfffff8a05))
                                .padding(start = 6.dp, end = 6.dp, top=2.dp)
                        )
                        Text(
                            text="Молоко такое-то и такое-то  с длинным названием",
                            style = searchText(),
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier
                                .padding(top = 2.dp, start = 10.dp, end = 2.dp)
                        )
                        Row (
                            modifier = Modifier
                                .padding(top = 8.dp)
                        ){
                            Text(
                                text="830 Р",
                                style = yellowPriceText(),
                                modifier = Modifier
                                    .padding(start = 14.dp)
                            )
                            Text(
                                text="399 Р",
                                style = greenPriceText(),
                                modifier = Modifier
                                    .padding(start = 26.dp)
                            )
                        }
                        Row (
                            modifier = Modifier
                                .padding(top = 6.dp, start = 4.dp, end = 4.dp)

                        ){
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .height(34.dp)
                                    .width(200.dp),
                                colors = ButtonColors(
                                    containerColor = Color(0xfffea00ff),
                                    contentColor = Color.Transparent,
                                    disabledContainerColor = Color.Transparent,
                                    disabledContentColor = Color.Transparent,
                                )
                            ){
                                Text(
                                    "В корзину",
                                    style = inCartText(),
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}