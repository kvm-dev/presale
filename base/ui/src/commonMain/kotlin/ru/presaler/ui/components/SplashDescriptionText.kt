package ru.presaler.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.presaler.ui.theme.TextStyles.textConnection

@Composable
fun SplashDescriptionText(text: String) {
    Text(modifier = Modifier
        .padding(26.dp),
        style = textConnection(),
        text = text,
    )
}