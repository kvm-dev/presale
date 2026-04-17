package ru.presaler.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontStyle.Companion.Italic
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import ru.presaler.ui.theme.SimplyWhite

object TextStyles {
    @Composable
    fun getTitlesStyle() = getFoolStackTypography()

    @Composable
    fun serviceTagStyle() = TextStyle(
        fontFamily = getPresalerFontFamily(),
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        color = SimplyWhite,
        textAlign = TextAlign.Center
    )

    @Composable
    fun serviceTextStyle() = TextStyle(
        fontFamily = getPresalerFontFamily(),
        fontWeight = FontWeight.Bold,
        fontSize = 10.sp,
        color = SimplyWhite,
        textAlign = TextAlign.Start
    )

    @Composable
    fun serviceTitleStyle() = TextStyle(
        fontFamily = getPresalerFontFamily(),
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        color = SimplyWhite,
        textAlign = TextAlign.Center
    )

    @Composable
    fun screenTitleStyle() = TextStyle(
        fontFamily = getPresalerFontFamily(),
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        color = SimplyWhite,
        textAlign = TextAlign.Center
    )

    @Composable
    fun chipsStyle() = TextStyle(
        fontFamily = getPresalerFontFamily(),
        fontWeight = FontWeight.Black,
        fontSize = 14.sp,
        color = SimplyBlack,
        fontStyle = Italic,
        textAlign = TextAlign.Center
    )

    @Composable
    fun bottomSheetButtonStyle() = TextStyle(
        fontFamily = getPresalerFontFamily(),
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        color = SimplyWhite,
        textAlign = TextAlign.Center
    )

    @Composable
    fun bottomSheetButtonBlackStyle() = TextStyle(
        fontFamily = getPresalerFontFamily(),
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        color = SimplyBlack,
        textAlign = TextAlign.Center
    )

    @Composable
    fun notificationTitleStyle() = TextStyle(
        fontFamily = getPresalerFontFamily(),
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        color = SimplyWhite,
        textAlign = TextAlign.Center
    )

    @Composable
    fun boldItalicLabel() = TextStyle(
        fontFamily = getPresalerFontFamily(),
        fontWeight = FontWeight.Bold,
        fontStyle = Italic,
        fontSize = 14.sp,
        color = SimplyWhite,
        textAlign = TextAlign.Center
    )

    @Composable
    fun textArea() = TextStyle(
        fontFamily = getPresalerFontFamily(),
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        color = SimplyWhite,
        textAlign = TextAlign.Start
    )

    @Composable
    fun srcGrayText() = TextStyle(
        fontFamily = getPresalerFontFamily(),
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        color = Color.LightGray,
        textAlign = TextAlign.Start
    )

    @Composable
    fun srcWhiteText() = TextStyle(
        fontFamily = getPresalerFontFamily(),
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        color = SimplyWhite,
        textAlign = TextAlign.Start,
        fontStyle = Italic,
    )

    @Composable
    fun addressText() = TextStyle(
        fontFamily = getPresalerFontFamily(),
        fontWeight = FontWeight.Light,
        fontSize = 14.sp,
        color = SimplyWhite,
        textAlign = TextAlign.Start
    )
    @Composable
    fun offersText() = TextStyle(
        fontFamily = getPresalerFontFamily(),
        fontWeight = FontWeight.Light,
        fontSize = 22.sp,
        color = SimplyBlack,
        textAlign = TextAlign.Start
    )

    @Composable
    fun companyText() = TextStyle(
        fontFamily = getPresalerFontFamily(),
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        color = OfferYellow,
        textAlign = TextAlign.Start
    )

    @Composable
    fun saleText() = TextStyle(
        fontFamily = getPresalerFontFamily(),
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        color = SimplyBlack,
        textAlign = TextAlign.Start
    )
}