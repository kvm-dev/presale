package ru.presaler.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ru.presaler.ui.theme.TextStyles.bottomSheetButtonStyle

@Composable
fun TransparentButton(text: String, modifier: Modifier, onClick:() -> Unit){
    val colors = ButtonDefaults.buttonColors(
        containerColor = Color.Transparent,
    )
    Button(
        onClick = onClick,
        colors = colors,
        modifier = modifier
            .padding(bottom = 48.dp)
            .border(
                width = 1.dp,
                color = Color(0xFFFF8A00),
                shape = RoundedCornerShape(10.dp),
            ),

        shape = RoundedCornerShape(10.dp)
    ) {
        Text(style = bottomSheetButtonStyle(), text = text)
    }
}