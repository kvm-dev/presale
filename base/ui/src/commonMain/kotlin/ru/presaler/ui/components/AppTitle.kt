package ru.presaler.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import ru.presaler.ui.icons.AppIcon
import ru.presaler.ui.res.SplashStrings.getAppTitle
import ru.presaler.ui.theme.TextStyles.apptitletext

@Composable
fun apptitle(){
    Row(modifier = Modifier
        .padding(horizontal = 16.dp, vertical = 24.dp),
        verticalAlignment = Alignment.CenterVertically,
    ){
        Icon(tint = Color.Unspecified,
            imageVector = AppIcon,
            contentDescription = "backButton",
            modifier = Modifier

                .size(90.dp))
        Text(
            style = apptitletext(),
            text = getAppTitle(),
            modifier = Modifier
                .padding(end = 22.dp)
                )
    }
}