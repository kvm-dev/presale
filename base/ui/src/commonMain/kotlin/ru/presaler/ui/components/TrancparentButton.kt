package ru.presaler.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
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
fun trancparentButton(){
    val colors = ButtonDefaults.buttonColors(
        containerColor = Color.Transparent,
    )
    Button(
        onClick = { },
        colors = colors,
        modifier = Modifier
            .padding(horizontal = 126.dp, vertical = 60.dp)

            .border(
                width = 1.dp,
                color = Color(0xFFFF8A00),
                shape = RoundedCornerShape(10.dp),
            ),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(style = bottomSheetButtonStyle(), text = buttonBusinessScrin())
    }
}