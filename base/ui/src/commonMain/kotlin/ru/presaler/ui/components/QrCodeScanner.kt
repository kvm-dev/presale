package ru.presaler.ui.components

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import org.publicvalue.multiplatform.qrcode.CameraPosition
import org.publicvalue.multiplatform.qrcode.CodeType
import org.publicvalue.multiplatform.qrcode.ScannerWithPermissions
import ru.presaler.ui.theme.MainPinkLight


@Composable
fun QrCodeScanner(onQrCodeScanned: (String) -> Unit) {
    val windowSize = 240.dp
    val windowSizePx = with(LocalDensity.current) { windowSize.toPx() }
    val infiniteTransition = rememberInfiniteTransition(label = "ScannerAnimationLine")
    val translateY by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = windowSizePx,
        animationSpec = infiniteRepeatable(
            animation = tween(2000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "ScanLine"
    )
    Box {
        ScannerWithPermissions(
            onScanned = {
                onQrCodeScanned(it); true
                        },
            types = listOf(CodeType.QR),
            cameraPosition = CameraPosition.BACK,
            enableTorch = false,
        )
        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .graphicsLayer(alpha = 0.99f)
        ) {
            drawRect(Color.Black.copy(alpha = 0.6f))

            val windowSizePx = windowSize.toPx()
            val left = (size.width - windowSizePx) / 2
            val top = (size.height - windowSizePx) / 2

            drawRoundRect(
                color = Color.Transparent,
                topLeft = Offset(left, top),
                size = Size(windowSizePx, windowSizePx),
                cornerRadius = CornerRadius(16.dp.toPx()),
                blendMode = BlendMode.Clear
            )
        }

        Box(
            modifier = Modifier
                .size(windowSize)
                .align(Alignment.Center)
                .border(2.dp, Color.White.copy(alpha = 0.5f), RoundedCornerShape(16.dp))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(2.dp)
                    .offset(y = with(LocalDensity.current) { translateY.toDp() })
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color.Transparent,
                                MainPinkLight,
                                Color.Transparent
                            )
                        )
                    )
            )
        }
    }
}