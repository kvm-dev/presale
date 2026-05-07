package ru.presaler.ui.components
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ru.presaler.ui.icons.AppIcon
import ru.presaler.ui.icons.QrIcon
import ru.presaler.ui.theme.MainYellowLight
import ru.presaler.ui.theme.TextStyles.bottomSheetButtonBlackStyle


@Composable
fun ButtonAuth(onClick: () -> Unit, modifier: Modifier, text: String) {
        val colors = ButtonDefaults.buttonColors(
                containerColor = MainYellowLight,
            )
        Button(
            onClick = { },
            colors = colors,
            modifier = modifier
                .padding(bottom = 20.dp),
            shape = RoundedCornerShape(10.dp)
        ) {
            Icon(
                modifier = Modifier
                    .size(36.dp),
                imageVector = QrIcon,
                tint = Color.Unspecified,
                contentDescription = "Qr"
            )
            Text(modifier= Modifier
                .padding(start = 14.dp),
                style = bottomSheetButtonBlackStyle(), text = text)
        }
}

