package ru.presaler.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import ru.presaler.ui.theme.TextStyles.saleText
import ru.presaler.ui.theme.TextStyles.serviceTitleStyle1

@Composable
fun TextInput(
    modifier: Modifier,
    keyboardType: KeyboardType,
    placeholder: String
) {
    val text = remember { mutableStateOf("") }
    TextField(

        keyboardOptions = KeyboardOptions(keyboardType = keyboardType ),
        shape = RoundedCornerShape(14.dp),
        modifier = modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(horizontal = 20.dp, vertical = 10.dp),
        placeholder = {Text(placeholder)},
        value = text.value,
        textStyle = serviceTitleStyle1() ,
        onValueChange = { currentText->
            text.value = currentText }
    )
}


@Composable
fun text(){
        Column{
            Text(modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 46.dp)
               ,
                textAlign = TextAlign.Center,
                style = saleText(),
                text = mainBusinessText(),
            )

            TextInput(
                modifier = Modifier,
                placeholder = buttonName(),
                keyboardType = KeyboardType.Text,
            )
            TextInput(
                modifier = Modifier,
                placeholder = buttonINN(),
                keyboardType = KeyboardType.Number,
            )
            TextInput(
                modifier = Modifier,
                placeholder = buttonDock(),
                keyboardType = KeyboardType.Number,
            )
            TextInput(
                modifier = Modifier,
                placeholder = buttonAddress(),
                keyboardType = KeyboardType.Text,
            )
            TextInput(
                modifier = Modifier,
                placeholder = buttonAddress(),
                keyboardType = KeyboardType.Text,
            )
            TextInput(
                modifier = Modifier,
                placeholder = buttonNamber(),
                keyboardType = KeyboardType.Text,
            )
            TextInput(
                modifier = Modifier,
                placeholder = bottonEmail(),
                keyboardType = KeyboardType.Text,
            )
        }
}