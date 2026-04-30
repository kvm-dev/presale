package ru.presaler.ui.components

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import qrgenerator.qrkitpainter.text
import ru.presaler.ui.icons.AppIcon
import ru.presaler.ui.theme.SimplyWhite
import ru.presaler.ui.theme.TextStyles.artikulText
import ru.presaler.ui.theme.TextStyles.blackCountText
import ru.presaler.ui.theme.TextStyles.chipsStyle
import ru.presaler.ui.theme.TextStyles.inArtikulText
import ru.presaler.ui.theme.TextStyles.inCartText
import ru.presaler.ui.theme.TextStyles.itemText
import ru.presaler.ui.theme.TextStyles.searchText
import ru.presaler.ui.theme.TextStyles.switchButtonText

@Composable
fun CurrentScreenScroll(){

    LazyVerticalGrid(
        columns = GridCells.Fixed(1),
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 170.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(50) { item ->
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .width(160.dp)
                    .height(230.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .clickable(onClick = {}),
            ) {
                Box(){
                    Icon(
                        imageVector = AppIcon,
                        contentDescription = "DeleteIcon",
                        modifier = Modifier
                            .padding(top=10.dp,start=10.dp)
                            .size(50.dp)
                            .clickable(onClick = {}),
                        tint = Color.Unspecified
                    )
                    Icon(
                        imageVector = AppIcon,
                        contentDescription = "ItemImage",
                        modifier = Modifier
                            .padding(top=10.dp,start=10.dp)
                            .size(150.dp),
                        tint = Color.Unspecified
                    )
                    Column (
                        modifier = Modifier
                            .padding(top=20.dp,end=20.dp,start=150.dp)
                    ){
                        Row(){
                            Text(
                                text="Молоко такое-то и такое-то с длинным названием прям очень очень длинным названием и не помещается в 3 строки",
                                style=itemText(),
                                maxLines = 3,
                                overflow = TextOverflow.Ellipsis
                            )
                        }


                        Row(
                            modifier = Modifier.padding(top=4.dp)
                        ){
                            Text(
                                text="399 p",
                                style = blackCountText()
                            )
                        }


                        Row(
                            modifier = Modifier.padding(top=4.dp)
                        ){
                            Text(
                                text = buildAnnotatedString {
                                    withStyle(artikulText().toSpanStyle()) {
                                        append("Артикул: ")
                                    }
                                    withStyle(inArtikulText().toSpanStyle()) {
                                        append("123123123")
                                    }
                                },
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }


                        Row(){
                            Text(
                                text = buildAnnotatedString {
                                    withStyle(artikulText().toSpanStyle()) {
                                        append("Поставщик: ")
                                    }
                                    withStyle(inArtikulText().toSpanStyle()) {
                                        append("ООО \"Рога и Копыта\" — макс 3 строчки")
                                    }
                                },
                                maxLines = 3,
                                overflow = TextOverflow.Ellipsis,
                                lineHeight = 16.sp
                            )
                        }
                        Row(){
                            
                        }
                    }
                }

            }
        }
    }
}