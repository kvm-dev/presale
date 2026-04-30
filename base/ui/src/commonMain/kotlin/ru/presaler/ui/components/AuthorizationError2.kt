package ru.presaler.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import ru.presaler.ui.icons.AppIcon
import ru.presaler.ui.icons.BackArrow
import ru.presaler.ui.res.getSplashDescription
import ru.presaler.ui.theme.TextStyles.bottomSheetButtonStyle
import ru.presaler.ui.theme.TextStyles.textConnection

@Composable
fun authorizationError2() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(120.dp)) // отступ сверху как в Figma

        Icon(
            modifier = Modifier
                .width(320.dp)
                .height(320.dp),
            imageVector = AppIcon,
            tint = Color.Unspecified,
            contentDescription = "AppIcon"
        )

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = textConnection(),
            text = authoError2(),
        )

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
            ),
            modifier = Modifier
                .width(201.dp)
                .height(45.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFFFF8A00),
                    shape = RoundedCornerShape(10.dp),
                ),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(style = bottomSheetButtonStyle(), text = buttonbackAvtorization())
        }

        Spacer(modifier = Modifier.height(40.dp))
    }
}
