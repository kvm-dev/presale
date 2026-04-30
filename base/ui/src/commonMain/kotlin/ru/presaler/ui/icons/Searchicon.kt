package ru.presaler.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SearchIcon: ImageVector
    get() {
        if (_searchicon != null) {
            return _searchicon!!
        }
        _searchicon = Builder(name = "Searchicon", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
                viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.1667f, 15.8333f)
                curveTo(12.8486f, 15.8333f, 15.8333f, 12.8486f, 15.8333f, 9.1667f)
                curveTo(15.8333f, 5.4848f, 12.8486f, 2.5f, 9.1667f, 2.5f)
                curveTo(5.4848f, 2.5f, 2.5f, 5.4848f, 2.5f, 9.1667f)
                curveTo(2.5f, 12.8486f, 5.4848f, 15.8333f, 9.1667f, 15.8333f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 17.5f)
                lineTo(13.875f, 13.875f)
            }
        }
        .build()
        return _searchicon!!
    }

private var _searchicon: ImageVector? = null
