package ru.presaler.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle.Companion.Italic
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun getFoolStackTypography(): androidx.compose.material3.Typography {

    val foolStackTypography = Typography(
//        displayLarge = TextStyle(
//            fontFamily = foolStackFontFamily,
//            fontWeight = FontWeight.Bold,
//            fontStyle = Italic,
//            fontSize = 16.sp,
//            brush = Brush.linearGradient(
//                colors = listOf(MainOrangeLight, MainGreenLight)
//            )
//        ),
        displayLarge = TextStyle(
            fontFamily = getPresalerFontFamily(),
            fontWeight = FontWeight.Bold,
            fontStyle = Italic,
            fontSize = 16.sp
        ),
        displayMedium = TextStyle(
            fontFamily = getPresalerFontFamily(),
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        ),

        displaySmall = TextStyle(
            fontFamily = getPresalerFontFamily(),
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp
        ),

        headlineLarge = TextStyle(
            fontFamily = getPresalerFontFamily(),
            fontWeight = FontWeight.Black,
            fontSize = 32.sp,
            brush = Brush.linearGradient(
                colors = listOf(MainOrangeLight, MainGreenLight)
            )
        ),
        headlineMedium = TextStyle(
            fontFamily = getPresalerFontFamily(),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        ),

        headlineSmall = TextStyle(
            fontFamily = getPresalerFontFamily(),
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp
        ),
        titleLarge = TextStyle(
            fontFamily = getPresalerFontFamily(),
            fontWeight = FontWeight.Bold,
            fontSize = 48.sp
        ),
        titleMedium = TextStyle(
            fontFamily = getPresalerFontFamily(),
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp
        ),
        titleSmall = TextStyle(
            fontFamily = getPresalerFontFamily(),
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp
        ),
        bodyLarge = TextStyle(
            fontFamily = getPresalerFontFamily(),
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp
        ),
        bodyMedium = TextStyle(
            fontFamily = getPresalerFontFamily(),
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        ),
        bodySmall = TextStyle(
            fontFamily = getPresalerFontFamily(),
            fontWeight = FontWeight.ExtraLight,
            fontSize = 16.sp
        ),
        labelLarge = TextStyle(
            fontFamily = getPresalerFontFamily(),
            fontWeight = FontWeight.SemiBold,
            fontSize = 22.sp
        ),
        labelMedium = TextStyle(
            fontFamily = getPresalerFontFamily(),
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp
        ),
        labelSmall = TextStyle(
            fontFamily = getPresalerFontFamily(),
            fontWeight = FontWeight.Black,
            fontSize = 14.sp
        ),
    )
    return foolStackTypography
}
