package ru.presaler.ui.components

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun SwitchButton( text1: String,text2: String,Width: Dp,Height: Dp,Padding: Dp,BackgroundColor: Color, ContentAligment: Alignment): Int {

    var selected by remember { mutableStateOf(0) }

    val indicatorOffset by animateDpAsState(
        targetValue = if (selected == 0) 0.dp else Width,
        animationSpec = tween(300)
    )

    Box(
        modifier = Modifier
            .height(Height)
            .fillMaxWidth()
            .padding(top = Padding),
        contentAlignment = ContentAligment
    ) {

        Box(
            modifier = Modifier
                .clip(CircleShape)
                .background(Color(0xffff2f2f2))
        ) {

            // Плавно переезжающая белая плашка
            Box(
                modifier = Modifier
                    .offset(x = indicatorOffset)
                    .size(width = Width, height = Height)
                    .clip(CircleShape)
                    .background(color=BackgroundColor)
            )

            Row {
                TabItem(
                    text = text1,
                    tabWidth = Width,
                    tabHeight = Height,
                    isSelected = selected == 0,
                    onClick = { selected = 0 }
                )
                TabItem(
                    text = text2,
                    tabWidth = Width,
                    tabHeight = Height,
                    isSelected = selected == 1,
                    onClick = { selected = 1 }
                )
            }
        }
    }
    return selected
}