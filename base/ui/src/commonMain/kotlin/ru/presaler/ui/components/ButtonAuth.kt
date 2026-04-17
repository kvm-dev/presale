package ru.presaler.ui.components
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.presaler.ui.res.getButtonAuthorization
import ru.presaler.ui.theme.MainYellowLight
import ru.presaler.ui.theme.TextStyles.bottomSheetButtonBlackStyle


@Composable
fun ButtonAuth(onClick: () -> Unit, modifier: Modifier) {
        val colors = ButtonDefaults.buttonColors(
                containerColor = MainYellowLight,
            )
        Button(
            onClick = { },
            colors = colors,
            modifier = modifier
                .padding(bottom = 138.dp),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(style = bottomSheetButtonBlackStyle(), text = getButtonAuthorization())
        }
}

