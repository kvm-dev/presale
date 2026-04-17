package ru.presaler.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val ChangeIcon: ImageVector
    get() {
        if (_changeicon != null) {
            return _changeicon!!
        }
        _changeicon = Builder(name = "Changeicon", defaultWidth = 29.0.dp, defaultHeight = 31.0.dp,
                viewportWidth = 29.0f, viewportHeight = 31.0f).apply {
            path(fill = SolidColor(Color(0xFF434343)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.9866f, 14.9656f)
                curveTo(4.5452f, 14.9656f, 5.5824f, 13.9285f, 5.5824f, 12.3699f)
                lineTo(5.5749f, 11.5511f)
                curveTo(5.5749f, 11.5511f, 5.189f, 9.2301f, 8.2854f, 9.2301f)
                lineTo(20.8238f, 9.3167f)
                verticalLineTo(12.6278f)
                curveTo(21.4318f, 13.2339f, 22.4181f, 13.2339f, 23.0261f, 12.6278f)
                lineTo(27.8694f, 7.7863f)
                curveTo(28.4756f, 7.1765f, 28.4756f, 6.1901f, 27.8694f, 5.584f)
                lineTo(23.0261f, 0.4546f)
                curveTo(22.4181f, -0.1515f, 21.4318f, -0.1515f, 20.8238f, 0.4546f)
                verticalLineTo(3.9275f)
                curveTo(20.5207f, 3.8391f, 8.677f, 3.7882f, 8.677f, 3.7882f)
                curveTo(1.6916f, 3.7882f, 0.1631f, 8.3605f, 0.1631f, 10.2014f)
                verticalLineTo(12.1421f)
                curveTo(0.1631f, 13.7007f, 1.428f, 14.9656f, 2.9866f, 14.9656f)
                close()
            }
            path(fill = SolidColor(Color(0xFF434343)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(25.5012f, 15.0428f)
                curveTo(23.9426f, 15.0428f, 22.6776f, 16.1421f, 22.6776f, 17.7007f)
                lineTo(22.6814f, 19.5021f)
                curveTo(22.5967f, 20.1741f, 21.4673f, 20.6127f, 19.8108f, 20.6127f)
                horizontalLineTo(7.5021f)
                lineTo(7.4984f, 17.6781f)
                curveTo(6.8922f, 17.072f, 5.9059f, 17.072f, 5.296f, 17.6781f)
                lineTo(0.4546f, 22.5196f)
                curveTo(-0.1515f, 23.1294f, -0.1515f, 24.1158f, 0.4546f, 24.7219f)
                lineTo(5.296f, 29.5633f)
                curveTo(5.9059f, 30.1732f, 6.8922f, 30.1732f, 7.4984f, 29.5633f)
                lineTo(7.5021f, 26.0791f)
                horizontalLineTo(19.8108f)
                curveTo(26.7962f, 26.0791f, 28.3247f, 21.4824f, 28.3247f, 19.6396f)
                verticalLineTo(17.6988f)
                curveTo(28.3247f, 16.1421f, 27.0598f, 15.0428f, 25.5012f, 15.0428f)
                close()
            }
        }
        .build()
        return _changeicon!!
    }

private var _changeicon: ImageVector? = null
