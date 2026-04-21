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

public val BackArrow: ImageVector
    get() {
        if (_backarrow != null) {
            return _backarrow!!
        }
        _backarrow = Builder(name = "Backarrow", defaultWidth = 24.0.dp, defaultHeight = 28.0.dp,
                viewportWidth = 24.0f, viewportHeight = 28.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF171725)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 20.6601f)
                lineTo(9.0f, 13.7734f)
                lineTo(15.0f, 6.8867f)
            }
        }
        .build()
        return _backarrow!!
    }

private var _backarrow: ImageVector? = null
