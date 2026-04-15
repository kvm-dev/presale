package ru.presaler.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.Font
import ru.presaler.base.ui.ComposeResources.Lato_Black
import ru.presaler.base.ui.ComposeResources.Lato_BlackItalic
import ru.presaler.base.ui.ComposeResources.Lato_Bold
import ru.presaler.base.ui.ComposeResources.Lato_BoldItalic
import ru.presaler.base.ui.ComposeResources.Lato_Italic
import ru.presaler.base.ui.ComposeResources.Lato_Light
import ru.presaler.base.ui.ComposeResources.Lato_LightItalic
import ru.presaler.base.ui.ComposeResources.Lato_Regular
import ru.presaler.base.ui.ComposeResources.Res

@Composable
fun getPresalerFontFamily(): FontFamily {
    return FontFamily(
        Font(resource = Res.font.Lato_Black, FontWeight.Black),
        Font(resource = Res.font.Lato_BlackItalic, FontWeight.Black, style = FontStyle.Italic),
        Font(resource = Res.font.Lato_Bold, FontWeight.Bold),
        Font(resource = Res.font.Lato_BoldItalic, FontWeight.Bold, style = FontStyle.Italic),
        Font(resource = Res.font.Lato_Italic, FontWeight.Normal, style = FontStyle.Italic),
        Font(resource = Res.font.Lato_Light, FontWeight.Light),
        Font(resource = Res.font.Lato_LightItalic, FontWeight.Light, style = FontStyle.Italic),
        Font(resource = Res.font.Lato_Regular, FontWeight.ExtraLight),
    )
}