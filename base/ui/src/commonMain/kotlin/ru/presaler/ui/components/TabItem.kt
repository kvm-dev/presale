package ru.presaler.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ru.presaler.ui.theme.MainPinkLight
import ru.presaler.ui.theme.Purple200
import ru.presaler.ui.theme.TextStyles.switchButtonText

@Composable
fun TabItem(tabWidth: Dp,tabHeight:Dp, text: String, isSelected: Boolean, onClick: () -> Unit) {

    val animatedTextColor by animateColorAsState(
        targetValue = if (isSelected) MainPinkLight else Color.LightGray,
        animationSpec = tween(300)
    )

    Box(
        modifier = Modifier
            .clip(CircleShape)
            .size(width = tabWidth, height = tabHeight)
            .clickable (
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ){ onClick() }
            .padding(vertical = 10.dp, horizontal = 20.dp),

        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            style = switchButtonText(isSelected).copy(color = animatedTextColor)
        )
    }
}