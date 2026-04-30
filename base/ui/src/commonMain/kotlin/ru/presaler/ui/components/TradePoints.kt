package ru.presaler.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import kotlinx.datetime.format.Padding
import qrgenerator.qrkitpainter.text
import ru.presaler.ui.icons.AppIcon
import ru.presaler.ui.icons.BackArrow
import ru.presaler.ui.icons.TraderPointIcon
import ru.presaler.ui.theme.TextStyles.addressText
import ru.presaler.ui.theme.TextStyles.srcGrayText
import ru.presaler.ui.theme.TextStyles.srcWhiteText
import ru.presaler.ui.theme.TextStyles.tradesPointMainText
import ru.presaler.ui.theme.TradeCardBackground

@Composable
fun tradePointsCard(padding: PaddingValues) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding)
    ) {

        // ---------- Верхняя панель ----------
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier
                    .size(40.dp)
                    .padding(start = 16.dp,)
                    .clickable(onClick = {}),
                imageVector = BackArrow,
                contentDescription = "BackArrow"
            )

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    mainText(),
                    style = tradesPointMainText()
                )
            }
        }


        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 30.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(2.dp)
        ) {

            items(4) {


                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .clickable(onClick = {})
                    ) {
                        Box() {
                        Row(modifier = Modifier
                            .padding(end = 12.dp)
                            .zIndex(2f)) {
                            Icon(
                                modifier = Modifier.size(60.dp),
                                imageVector = TraderPointIcon,
                                tint = Color.Unspecified,
                                contentDescription = "TraderPointIcon"
                            )

                            Box(
                                modifier = Modifier
                                    .padding(start = 12.dp,)
                                    .border(
                                        width = 1.dp,
                                        color = Color.White,
                                        shape = RoundedCornerShape(
                                            topStart = 20.dp,
                                            topEnd = 20.dp,
                                            bottomStart = 20.dp,
                                            bottomEnd = 0.dp,
                                        )
                                        )
                                    .clip(RoundedCornerShape(
                                        topStart = 20.dp,
                                        topEnd = 20.dp,
                                        bottomStart = 20.dp,
                                        bottomEnd = 0.dp
                                    ))
                                    .background(TradeCardBackground)
                            ) {

                                Row(
                                    modifier = Modifier.padding(6.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {

                                    Text(
                                        adres(),
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis,
                                        modifier = Modifier.weight(1f)
                                        .padding(start = 6.dp)
                                    )

                                    Icon(
                                        modifier = Modifier
                                            .size(40.dp),
                                        imageVector = AppIcon,
                                        tint = Color.Unspecified,
                                        contentDescription = "AppIcon"
                                    )
                                }
                            }
                        }
                        Column(
                            modifier = Modifier
                                .height(180.dp)
                                .fillMaxWidth()
                                .padding(start = 12.dp, end = 12.dp, top = 24.dp)
                                .clip(RoundedCornerShape(20.dp))
                                .background(TradeCardBackground)
                        ) {

                            Row(modifier = Modifier
                                .padding(top = 40.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    modifier = Modifier
                                        .size(60.dp)
                                        .padding(8.dp),
                                    imageVector = AppIcon,
                                    tint = Color.Unspecified,
                                    contentDescription = "AppIcon"
                                )
                                Text(
                                    worcers(),
                                    Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Start
                                )
                            }

                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    modifier = Modifier
                                        .size(60.dp)
                                        .padding(8.dp),
                                    imageVector = AppIcon,
                                    tint = Color.Unspecified,
                                    contentDescription = "AppIcon"
                                )
                                Text(
                                    time(),
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Start
                                )
                            }

                        }

                    }
                }
            }
            item {
                ButtonNewPoint(modifier = Modifier
                    .fillMaxWidth()
                    .padding(40.dp)

                    , onClick = {})
            }
        }
    }
}
