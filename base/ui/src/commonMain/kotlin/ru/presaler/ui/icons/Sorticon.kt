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

public val SortIcon: ImageVector
    get() {
        if (_sorticon != null) {
            return _sorticon!!
        }
        _sorticon = Builder(name = "Sorticon", defaultWidth = 24.0.dp, defaultHeight = 22.0.dp,
                viewportWidth = 24.0f, viewportHeight = 22.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.4857f, 0.0f)
                curveTo(17.764f, 0.0f, 18.0304f, 0.134f, 18.2241f, 0.3714f)
                lineTo(23.7098f, 7.0936f)
                curveTo(24.1053f, 7.5782f, 24.0953f, 8.352f, 23.6874f, 8.8218f)
                curveTo(23.2796f, 9.2918f, 22.6284f, 9.2799f, 22.233f, 8.7953f)
                lineTo(18.5143f, 4.2383f)
                verticalLineTo(20.7778f)
                curveTo(18.5143f, 21.4528f, 18.0537f, 22.0f, 17.4857f, 22.0f)
                curveTo(16.9177f, 22.0f, 16.4571f, 21.4528f, 16.4571f, 20.7778f)
                verticalLineTo(4.2383f)
                lineTo(12.7384f, 8.7953f)
                curveTo(12.343f, 9.2799f, 11.6918f, 9.2918f, 11.284f, 8.8218f)
                curveTo(10.8761f, 8.352f, 10.8661f, 7.5782f, 11.2616f, 7.0936f)
                lineTo(16.7473f, 0.3714f)
                curveTo(16.941f, 0.134f, 17.2074f, 0.0f, 17.4857f, 0.0f)
                close()
                moveTo(6.5143f, 0.0f)
                curveTo(7.0823f, 0.0f, 7.5429f, 0.5472f, 7.5429f, 1.2222f)
                verticalLineTo(17.7617f)
                lineTo(11.2616f, 13.2047f)
                curveTo(11.657f, 12.7201f, 12.3082f, 12.7082f, 12.716f, 13.1782f)
                curveTo(13.1239f, 13.648f, 13.1339f, 14.4217f, 12.7384f, 14.9064f)
                lineTo(7.2527f, 21.6286f)
                curveTo(7.059f, 21.866f, 6.7926f, 22.0f, 6.5143f, 22.0f)
                curveTo(6.236f, 22.0f, 5.9696f, 21.866f, 5.7759f, 21.6286f)
                lineTo(0.2902f, 14.9064f)
                curveTo(-0.1053f, 14.4217f, -0.0953f, 13.648f, 0.3125f, 13.1782f)
                curveTo(0.7204f, 12.7082f, 1.3715f, 12.7201f, 1.767f, 13.2047f)
                lineTo(5.4857f, 17.7617f)
                verticalLineTo(1.2222f)
                curveTo(5.4857f, 0.5472f, 5.9462f, 0.0f, 6.5143f, 0.0f)
                close()
            }
        }
        .build()
        return _sorticon!!
    }

private var _sorticon: ImageVector? = null
