package ru.presaler.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.presaler.ui.icons.CloseIcon
import ru.presaler.ui.icons.SearchIcon
import ru.presaler.ui.theme.Purple200

@Composable
fun SearchField(keyword1: MutableState<String>){
    TextField(
        value = keyword1.value,
        onValueChange = { keyword1.value = it },
        leadingIcon = {
            Icon(
                imageVector = SearchIcon,
                contentDescription = "SearchIcon",
                modifier = Modifier
                    .size(28.dp)
            )
        },
        trailingIcon =  {
            IconButton(onClick = { keyword1.value = "" }) {
                Icon(
                    imageVector = CloseIcon,
                    contentDescription = "ClearIcon",
                    modifier = Modifier
                        .size(24.dp)
                )
            }
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
            .dropShadow(
                shape = CircleShape,
                block = {
                    radius = 30f  // радиус размытия тени
                    offset = Offset(0f, 0f)  // смещение тени по осям X и Y
                    color = Purple200  // цвет тени
                    spread = 14f  // расширение размера тени
                    alpha = 0.4f  // прозрачность тени
                }
            ),
        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
        placeholder = { Text("Поиск товаров и категорий", color = Color.LightGray, fontSize = 16.sp)},
        shape = CircleShape,
        singleLine = true,
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            errorIndicatorColor = Color.Transparent,
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White
        )
    )
}