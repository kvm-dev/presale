package ru.presaler.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import qrgenerator.qrkitpainter.QrKitBallShape
import qrgenerator.qrkitpainter.QrKitBrush
import qrgenerator.qrkitpainter.QrKitColors
import qrgenerator.qrkitpainter.QrKitErrorCorrection
import qrgenerator.qrkitpainter.QrKitFrameShape
import qrgenerator.qrkitpainter.QrKitLogo
import qrgenerator.qrkitpainter.QrKitLogoPadding
import qrgenerator.qrkitpainter.QrKitPixelShape
import qrgenerator.qrkitpainter.QrKitShapes
import qrgenerator.qrkitpainter.createCircle
import qrgenerator.qrkitpainter.createRoundCorners
import qrgenerator.qrkitpainter.rememberQrKitPainter
import qrgenerator.qrkitpainter.solidBrush
import ru.presaler.ui.icons.AppIcon
import ru.presaler.ui.theme.SimplyBlack
import ru.presaler.ui.theme.SimplyWhite

@Composable
fun QrCodeGenerator(qrData: String) {
    val painter = rememberVectorPainter(image = AppIcon)
    val qrPainter = rememberQrKitPainter(
        data = qrData,
        qrOptions = {
            errorCorrection = QrKitErrorCorrection.High

            logo = QrKitLogo(
                painter = painter,
                size = 0.15f,
                padding = QrKitLogoPadding.Natural(0.1f)
            )

            colors = QrKitColors(
                darkBrush = QrKitBrush.solidBrush(SimplyBlack),
                lightBrush = QrKitBrush.solidBrush(SimplyWhite),
                frameBrush = QrKitBrush.solidBrush(SimplyBlack),
            )

            shapes = QrKitShapes(
                darkPixelShape = QrKitPixelShape.createRoundCorners(5f), // Слишком сильное скругление тоже мешает
                ballShape = QrKitBallShape.createCircle(),
                frameShape = QrKitFrameShape.createRoundCorners(5f)
            )
        }
    )

    Image(
        painter = qrPainter,
        contentDescription = "QR Code",
        modifier = Modifier
            .size(250.dp)
            .padding(16.dp)
    )
}