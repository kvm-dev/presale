package ru.presaler.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val FiltersIcon: ImageVector
    get() {
        if (_filtersicon != null) {
            return _filtersicon!!
        }
        _filtersicon = Builder(name = "Filtersicon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 9.55f)
                horizontalLineTo(15.4286f)
                verticalLineTo(7.45f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.55f)
                close()
                moveTo(17.1429f, 4.0f)
                curveTo(16.6695f, 4.0f, 16.2857f, 4.6716f, 16.2857f, 5.5f)
                verticalLineTo(11.5f)
                curveTo(16.2857f, 12.3284f, 16.6695f, 13.0f, 17.1429f, 13.0f)
                curveTo(17.6162f, 13.0f, 18.0f, 12.3284f, 18.0f, 11.5f)
                verticalLineTo(5.5f)
                curveTo(18.0f, 4.6716f, 17.6162f, 4.0f, 17.1429f, 4.0f)
                close()
                moveTo(12.0f, 16.45f)
                verticalLineTo(14.5f)
                curveTo(12.0f, 13.6716f, 11.6162f, 13.0f, 11.1429f, 13.0f)
                curveTo(10.6695f, 13.0f, 10.2857f, 13.6716f, 10.2857f, 14.5f)
                verticalLineTo(20.5f)
                curveTo(10.2857f, 21.3284f, 10.6695f, 22.0f, 11.1429f, 22.0f)
                curveTo(11.6162f, 22.0f, 12.0f, 21.3284f, 12.0f, 20.5f)
                verticalLineTo(18.55f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.45f)
                horizontalLineTo(12.0f)
                close()
                moveTo(6.0f, 18.55f)
                horizontalLineTo(9.4286f)
                verticalLineTo(16.45f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.55f)
                close()
            }
        }
        .build()
        return _filtersicon!!
    }

private var _filtersicon: ImageVector? = null
