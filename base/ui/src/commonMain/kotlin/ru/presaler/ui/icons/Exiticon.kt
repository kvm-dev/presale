package ru.presaler.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val ExitIcon: ImageVector
    get() {
        if (_exiticon != null) {
            return _exiticon!!
        }
        _exiticon = Builder(name = "Exiticon", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF434343)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.5f, 0.0f)
                    curveTo(2.9336f, 0.0f, 0.0f, 2.9336f, 0.0f, 6.5f)
                    verticalLineTo(23.5f)
                    curveTo(0.0f, 27.0664f, 2.9336f, 30.0f, 6.5f, 30.0f)
                    horizontalLineTo(15.0789f)
                    curveTo(18.3917f, 30.0f, 21.1568f, 27.4683f, 21.5336f, 24.25f)
                    horizontalLineTo(17.4718f)
                    curveTo(17.1661f, 25.283f, 16.2352f, 26.0f, 15.0789f, 26.0f)
                    horizontalLineTo(6.5f)
                    curveTo(5.0804f, 26.0f, 4.0f, 24.9196f, 4.0f, 23.5f)
                    verticalLineTo(6.5f)
                    curveTo(4.0f, 5.0804f, 5.0804f, 4.0f, 6.5f, 4.0f)
                    horizontalLineTo(15.0789f)
                    curveTo(16.2352f, 4.0f, 17.1661f, 4.717f, 17.4718f, 5.75f)
                    horizontalLineTo(21.5336f)
                    curveTo(21.1568f, 2.5317f, 18.3917f, 0.0f, 15.0789f, 0.0f)
                    horizontalLineTo(6.5f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF434343)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.8434f, 9.0f)
                    curveTo(23.5807f, 9.0f, 23.3206f, 9.0517f, 23.078f, 9.1522f)
                    curveTo(22.8353f, 9.2527f, 22.6148f, 9.4f, 22.4291f, 9.5857f)
                    curveTo(22.2434f, 9.7715f, 22.096f, 9.9919f, 21.9955f, 10.2346f)
                    curveTo(21.895f, 10.4773f, 21.8433f, 10.7373f, 21.8433f, 11.0f)
                    curveTo(21.8433f, 11.2627f, 21.895f, 11.5227f, 21.9955f, 11.7654f)
                    curveTo(22.096f, 12.0081f, 22.2434f, 12.2285f, 22.4291f, 12.4143f)
                    lineTo(23.0148f, 13.0f)
                    horizontalLineTo(8.1865f)
                    curveTo(7.6561f, 13.0f, 7.1474f, 13.2107f, 6.7723f, 13.5858f)
                    curveTo(6.3972f, 13.9609f, 6.1865f, 14.4696f, 6.1865f, 15.0f)
                    curveTo(6.1865f, 15.5304f, 6.3972f, 16.0391f, 6.7723f, 16.4142f)
                    curveTo(7.1474f, 16.7893f, 7.6561f, 17.0f, 8.1865f, 17.0f)
                    horizontalLineTo(23.0148f)
                    lineTo(22.4291f, 17.5857f)
                    curveTo(22.2434f, 17.7715f, 22.096f, 17.9919f, 21.9955f, 18.2346f)
                    curveTo(21.895f, 18.4773f, 21.8433f, 18.7373f, 21.8433f, 19.0f)
                    curveTo(21.8433f, 19.2627f, 21.895f, 19.5227f, 21.9955f, 19.7654f)
                    curveTo(22.096f, 20.0081f, 22.2434f, 20.2285f, 22.4291f, 20.4143f)
                    curveTo(22.6148f, 20.6f, 22.8353f, 20.7473f, 23.078f, 20.8478f)
                    curveTo(23.3206f, 20.9484f, 23.5807f, 21.0001f, 23.8434f, 21.0001f)
                    curveTo(24.106f, 21.0001f, 24.3661f, 20.9484f, 24.6088f, 20.8478f)
                    curveTo(24.8514f, 20.7473f, 25.0719f, 20.6f, 25.2576f, 20.4143f)
                    lineTo(28.8972f, 16.7747f)
                    curveTo(29.2268f, 16.6093f, 29.5042f, 16.3561f, 29.6989f, 16.0429f)
                    curveTo(29.8935f, 15.7297f, 29.9978f, 15.3688f, 30.0002f, 15.0f)
                    curveTo(29.9997f, 14.6256f, 29.8942f, 14.2588f, 29.6955f, 13.9415f)
                    curveTo(29.4969f, 13.6241f, 29.2132f, 13.3689f, 28.8767f, 13.2048f)
                    lineTo(25.2576f, 9.5857f)
                    curveTo(25.0719f, 9.4f, 24.8514f, 9.2527f, 24.6087f, 9.1522f)
                    curveTo(24.3661f, 9.0517f, 24.106f, 9.0f, 23.8434f, 9.0f)
                    close()
                }
            }
        }
        .build()
        return _exiticon!!
    }

private var _exiticon: ImageVector? = null
