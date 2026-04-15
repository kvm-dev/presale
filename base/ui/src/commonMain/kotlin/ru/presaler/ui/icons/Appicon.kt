package ru.presaler.ui.icons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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

public val AppIcon: ImageVector
    get() {
        if (_appicon != null) {
            return _appicon!!
        }
        _appicon = Builder(name = "Appicon", defaultWidth = 320.0.dp, defaultHeight = 320.0.dp,
                viewportWidth = 320.0f, viewportHeight = 320.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFDF7400), 1.0f to Color(0xFFFFC755),
                        start = Offset(140.47f,172.384f), end = Offset(223.501f,92.626f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(131.769f, 44.624f)
                    curveTo(134.005f, 44.058f, 136.431f, 43.784f, 138.613f, 43.313f)
                    curveTo(144.098f, 42.128f, 148.349f, 41.39f, 153.445f, 44.508f)
                    curveTo(158.285f, 47.469f, 160.631f, 51.4f, 162.269f, 56.682f)
                    curveTo(169.351f, 50.776f, 178.332f, 50.502f, 186.198f, 55.024f)
                    curveTo(196.702f, 48.788f, 209.376f, 52.133f, 215.182f, 62.806f)
                    curveTo(217.494f, 67.059f, 219.142f, 71.668f, 219.938f, 76.442f)
                    curveTo(224.235f, 76.717f, 228.89f, 76.927f, 233.161f, 77.304f)
                    curveTo(233.511f, 77.576f, 233.482f, 77.579f, 233.551f, 78.2f)
                    curveTo(234.156f, 83.629f, 234.761f, 89.077f, 235.371f, 94.506f)
                    lineTo(239.169f, 128.342f)
                    lineTo(243.472f, 166.773f)
                    curveTo(244.205f, 173.318f, 245.09f, 180.206f, 245.692f, 186.741f)
                    lineTo(222.453f, 193.787f)
                    curveTo(216.156f, 193.948f, 209.857f, 193.966f, 203.56f, 193.839f)
                    curveTo(203.414f, 204.104f, 197.895f, 207.906f, 188.858f, 210.132f)
                    curveTo(187.391f, 210.493f, 185.827f, 211.174f, 184.342f, 211.493f)
                    curveTo(183.856f, 211.701f, 182.793f, 212.074f, 182.254f, 212.152f)
                    curveTo(179.59f, 213.108f, 176.702f, 213.979f, 173.986f, 214.795f)
                    curveTo(163.269f, 218.012f, 152.625f, 221.677f, 141.899f, 224.84f)
                    curveTo(140.491f, 225.247f, 139.154f, 225.633f, 137.726f, 225.979f)
                    curveTo(132.103f, 227.48f, 128.229f, 228.441f, 122.802f, 225.51f)
                    curveTo(115.121f, 221.361f, 113.994f, 213.231f, 111.748f, 205.639f)
                    lineTo(104.638f, 181.521f)
                    lineTo(80.961f, 101.01f)
                    curveTo(79.359f, 96.506f, 78.054f, 91.281f, 76.698f, 86.646f)
                    curveTo(74.099f, 77.758f, 69.101f, 66.998f, 77.946f, 59.88f)
                    curveTo(78.245f, 59.456f, 81.338f, 56.909f, 81.874f, 56.482f)
                    curveTo(85.663f, 52.897f, 88.411f, 52.696f, 93.315f, 51.784f)
                    lineTo(102.768f, 50.033f)
                    curveTo(112.327f, 48.257f, 122.215f, 46.225f, 131.769f, 44.624f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFEED9FE), 1.0f to Color(0xFFFEFBFF),
                        start = Offset(157.333f,213.212f), end = Offset(126.835f,62.3206f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(131.769f, 44.624f)
                    curveTo(134.005f, 44.058f, 136.431f, 43.784f, 138.613f, 43.313f)
                    curveTo(144.098f, 42.128f, 148.349f, 41.39f, 153.445f, 44.508f)
                    curveTo(158.285f, 47.469f, 160.631f, 51.4f, 162.269f, 56.682f)
                    curveTo(160.147f, 58.677f, 158.998f, 59.944f, 157.272f, 62.375f)
                    curveTo(154.574f, 66.631f, 153.381f, 69.505f, 151.789f, 74.177f)
                    curveTo(151.416f, 75.448f, 151.006f, 76.771f, 150.668f, 78.048f)
                    curveTo(148.859f, 78.075f, 145.825f, 77.788f, 143.953f, 77.642f)
                    curveTo(141.671f, 77.463f, 138.684f, 77.349f, 136.478f, 77.026f)
                    lineTo(136.052f, 77.134f)
                    curveTo(135.694f, 77.785f, 134.113f, 88.167f, 133.861f, 89.686f)
                    lineTo(127.723f, 126.512f)
                    curveTo(134.523f, 142.701f, 140.593f, 159.33f, 147.322f, 175.561f)
                    curveTo(148.443f, 178.266f, 149.448f, 181.054f, 150.601f, 183.738f)
                    curveTo(163.258f, 190.66f, 183.11f, 192.633f, 197.26f, 193.567f)
                    curveTo(199.36f, 193.635f, 201.462f, 193.725f, 203.56f, 193.839f)
                    curveTo(203.414f, 204.104f, 197.895f, 207.906f, 188.858f, 210.132f)
                    curveTo(187.391f, 210.493f, 185.827f, 211.174f, 184.342f, 211.493f)
                    curveTo(183.856f, 211.701f, 182.793f, 212.074f, 182.254f, 212.152f)
                    curveTo(179.59f, 213.108f, 176.702f, 213.979f, 173.986f, 214.795f)
                    curveTo(163.269f, 218.012f, 152.625f, 221.677f, 141.899f, 224.84f)
                    curveTo(140.491f, 225.247f, 139.154f, 225.633f, 137.726f, 225.979f)
                    curveTo(132.103f, 227.48f, 128.229f, 228.441f, 122.802f, 225.51f)
                    curveTo(115.121f, 221.361f, 113.994f, 213.231f, 111.748f, 205.639f)
                    lineTo(104.638f, 181.521f)
                    lineTo(80.961f, 101.01f)
                    curveTo(79.359f, 96.506f, 78.054f, 91.281f, 76.698f, 86.646f)
                    curveTo(74.099f, 77.758f, 69.101f, 66.998f, 77.946f, 59.88f)
                    curveTo(78.245f, 59.456f, 81.338f, 56.909f, 81.874f, 56.482f)
                    curveTo(85.663f, 52.897f, 88.411f, 52.696f, 93.315f, 51.784f)
                    lineTo(102.768f, 50.033f)
                    curveTo(112.327f, 48.257f, 122.215f, 46.225f, 131.769f, 44.624f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFE8B27), 1.0f to Color(0xFFFF7682),
                        start = Offset(78.4531f,74.9783f), end = Offset(114.596f,74.8872f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(131.769f, 44.624f)
                    curveTo(134.005f, 44.058f, 136.431f, 43.784f, 138.613f, 43.313f)
                    curveTo(144.098f, 42.128f, 148.349f, 41.39f, 153.445f, 44.508f)
                    curveTo(158.286f, 47.469f, 160.631f, 51.4f, 162.269f, 56.682f)
                    curveTo(160.147f, 58.677f, 158.998f, 59.944f, 157.272f, 62.375f)
                    curveTo(156.622f, 61.7f, 155.912f, 61.085f, 155.152f, 60.537f)
                    curveTo(150.275f, 57.088f, 146.182f, 58.514f, 140.824f, 59.557f)
                    curveTo(137.443f, 60.239f, 134.055f, 60.887f, 130.661f, 61.503f)
                    lineTo(105.37f, 66.392f)
                    curveTo(101.545f, 67.128f, 96.64f, 67.827f, 93.085f, 69.059f)
                    curveTo(88.367f, 70.694f, 86.002f, 77.27f, 87.228f, 81.823f)
                    curveTo(87.926f, 84.469f, 88.701f, 87.03f, 89.479f, 89.625f)
                    lineTo(93.58f, 103.401f)
                    lineTo(107.47f, 150.32f)
                    lineTo(111.469f, 163.733f)
                    curveTo(111.792f, 164.813f, 113.126f, 169.042f, 113.253f, 169.923f)
                    curveTo(114.388f, 173.318f, 115.426f, 177.094f, 116.446f, 180.544f)
                    lineTo(121.746f, 198.477f)
                    curveTo(123.857f, 205.611f, 125.084f, 214.984f, 133.423f, 217.285f)
                    curveTo(136.334f, 218.089f, 138.395f, 217.64f, 141.215f, 216.787f)
                    curveTo(141.287f, 217.078f, 141.241f, 216.952f, 141.338f, 217.171f)
                    lineTo(157.825f, 212.076f)
                    curveTo(159.232f, 211.63f, 162.234f, 210.865f, 163.334f, 210.258f)
                    curveTo(163.352f, 211.547f, 163.498f, 216.847f, 163.149f, 217.763f)
                    curveTo(162.914f, 217.582f, 162.939f, 217.598f, 162.741f, 217.383f)
                    lineTo(162.438f, 217.425f)
                    curveTo(162.347f, 217.738f, 162.346f, 218.022f, 162.135f, 218.089f)
                    curveTo(160.659f, 218.554f, 158.885f, 219.076f, 157.424f, 219.534f)
                    lineTo(147.419f, 222.64f)
                    curveTo(145.347f, 223.287f, 143.199f, 224.04f, 141.107f, 224.558f)
                    curveTo(141.431f, 224.771f, 141.492f, 224.74f, 141.899f, 224.84f)
                    curveTo(140.491f, 225.247f, 139.154f, 225.633f, 137.726f, 225.979f)
                    curveTo(132.103f, 227.48f, 128.229f, 228.441f, 122.802f, 225.51f)
                    curveTo(115.121f, 221.361f, 113.994f, 213.231f, 111.748f, 205.639f)
                    lineTo(104.638f, 181.521f)
                    lineTo(80.961f, 101.01f)
                    curveTo(79.359f, 96.506f, 78.054f, 91.281f, 76.698f, 86.646f)
                    curveTo(74.099f, 77.758f, 69.101f, 66.998f, 77.946f, 59.88f)
                    curveTo(78.245f, 59.456f, 81.338f, 56.909f, 81.874f, 56.482f)
                    curveTo(85.663f, 52.897f, 88.411f, 52.696f, 93.315f, 51.784f)
                    lineTo(102.768f, 50.033f)
                    curveTo(112.327f, 48.257f, 122.215f, 46.225f, 131.769f, 44.624f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFC55C99), 1.0f to Color(0xFF932B9B),
                        start = Offset(108.211f,142.194f), end = Offset(91.614f,147.94f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(81.874f, 56.482f)
                    curveTo(81.167f, 57.591f, 80.578f, 58.283f, 79.91f, 59.48f)
                    curveTo(78.046f, 62.821f, 77.468f, 66.729f, 78.285f, 70.467f)
                    curveTo(78.785f, 72.761f, 79.811f, 75.883f, 80.496f, 78.182f)
                    lineTo(84.489f, 91.558f)
                    lineTo(97.072f, 134.088f)
                    lineTo(106.559f, 166.351f)
                    lineTo(109.523f, 176.485f)
                    curveTo(109.834f, 177.55f, 110.704f, 180.782f, 111.084f, 181.661f)
                    curveTo(113.098f, 188.838f, 115.299f, 196.157f, 117.411f, 203.308f)
                    curveTo(118.497f, 206.988f, 120.372f, 214.236f, 122.087f, 217.277f)
                    curveTo(123.622f, 220.06f, 125.895f, 222.364f, 128.655f, 223.937f)
                    curveTo(131.773f, 225.688f, 134.281f, 225.943f, 137.726f, 225.979f)
                    curveTo(132.103f, 227.48f, 128.229f, 228.441f, 122.802f, 225.51f)
                    curveTo(115.121f, 221.361f, 113.994f, 213.231f, 111.748f, 205.639f)
                    lineTo(104.638f, 181.521f)
                    lineTo(80.961f, 101.01f)
                    curveTo(79.359f, 96.506f, 78.054f, 91.281f, 76.698f, 86.646f)
                    curveTo(74.099f, 77.758f, 69.101f, 66.998f, 77.946f, 59.88f)
                    curveTo(78.245f, 59.456f, 81.338f, 56.909f, 81.874f, 56.482f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFB7289)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(77.946f, 59.88f)
                    curveTo(77.632f, 61.792f, 75.931f, 60.914f, 76.68f, 62.795f)
                    curveTo(76.808f, 63.117f, 76.785f, 68.09f, 76.627f, 68.57f)
                    curveTo(76.069f, 70.276f, 76.67f, 71.569f, 76.483f, 73.381f)
                    curveTo(76.52f, 77.127f, 76.323f, 80.812f, 76.574f, 84.53f)
                    curveTo(77.054f, 87.729f, 81.241f, 98.339f, 80.961f, 101.01f)
                    curveTo(79.359f, 96.506f, 78.054f, 91.281f, 76.698f, 86.646f)
                    curveTo(74.099f, 77.758f, 69.101f, 66.998f, 77.946f, 59.88f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFB7289)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(111.084f, 181.661f)
                    curveTo(111.411f, 182.107f, 111.285f, 182.13f, 111.624f, 182.182f)
                    curveTo(111.592f, 181.431f, 110.76f, 179.023f, 110.502f, 178.14f)
                    lineTo(107.289f, 167.253f)
                    lineTo(93.815f, 121.536f)
                    lineTo(89.532f, 106.915f)
                    curveTo(89.048f, 105.23f, 88.498f, 103.435f, 88.01f, 101.744f)
                    curveTo(87.675f, 101.15f, 89.357f, 100.376f, 88.985f, 99.912f)
                    curveTo(88.388f, 99.169f, 88.629f, 98.776f, 88.623f, 97.736f)
                    curveTo(88.609f, 95.271f, 88.135f, 91.583f, 88.607f, 89.208f)
                    lineTo(88.761f, 89.166f)
                    curveTo(89.188f, 89.815f, 91.814f, 99.069f, 92.203f, 100.416f)
                    lineTo(106.886f, 150.007f)
                    curveTo(108.483f, 155.359f, 110.177f, 160.704f, 111.646f, 166.087f)
                    curveTo(112.1f, 167.75f, 112.899f, 169.594f, 113.139f, 171.063f)
                    lineTo(113.241f, 171.084f)
                    lineTo(113.17f, 170.594f)
                    curveTo(113.371f, 170.357f, 113.272f, 170.407f, 113.253f, 169.923f)
                    curveTo(114.388f, 173.318f, 115.427f, 177.094f, 116.446f, 180.544f)
                    lineTo(121.746f, 198.477f)
                    curveTo(123.857f, 205.611f, 125.084f, 214.984f, 133.423f, 217.285f)
                    curveTo(136.335f, 218.089f, 138.395f, 217.64f, 141.215f, 216.787f)
                    curveTo(141.287f, 217.078f, 141.241f, 216.952f, 141.338f, 217.171f)
                    lineTo(157.825f, 212.076f)
                    curveTo(159.232f, 211.63f, 162.234f, 210.865f, 163.334f, 210.258f)
                    curveTo(163.352f, 211.547f, 163.498f, 216.847f, 163.149f, 217.763f)
                    curveTo(162.914f, 217.582f, 162.939f, 217.599f, 162.741f, 217.383f)
                    lineTo(162.438f, 217.425f)
                    curveTo(162.347f, 217.738f, 162.346f, 218.023f, 162.135f, 218.089f)
                    curveTo(160.659f, 218.554f, 158.885f, 219.076f, 157.424f, 219.534f)
                    lineTo(147.42f, 222.64f)
                    curveTo(145.348f, 223.287f, 143.2f, 224.04f, 141.107f, 224.558f)
                    curveTo(141.431f, 224.771f, 141.492f, 224.74f, 141.899f, 224.84f)
                    curveTo(140.491f, 225.247f, 139.154f, 225.633f, 137.727f, 225.979f)
                    curveTo(134.281f, 225.943f, 131.773f, 225.688f, 128.655f, 223.937f)
                    curveTo(125.895f, 222.364f, 123.622f, 220.06f, 122.087f, 217.277f)
                    curveTo(120.373f, 214.236f, 118.497f, 206.988f, 117.411f, 203.308f)
                    curveTo(115.299f, 196.157f, 113.098f, 188.838f, 111.084f, 181.661f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF968B6)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(131.769f, 44.624f)
                    curveTo(134.006f, 44.058f, 136.431f, 43.784f, 138.613f, 43.313f)
                    curveTo(144.098f, 42.128f, 148.349f, 41.39f, 153.445f, 44.508f)
                    curveTo(158.286f, 47.469f, 160.632f, 51.4f, 162.269f, 56.682f)
                    curveTo(160.148f, 58.677f, 158.999f, 59.944f, 157.272f, 62.375f)
                    curveTo(156.622f, 61.7f, 155.912f, 61.085f, 155.152f, 60.537f)
                    curveTo(150.275f, 57.088f, 146.183f, 58.514f, 140.825f, 59.557f)
                    curveTo(137.443f, 60.239f, 134.055f, 60.887f, 130.661f, 61.503f)
                    curveTo(130.284f, 61.371f, 129.834f, 61.229f, 129.431f, 61.304f)
                    curveTo(125.136f, 62.101f, 120.836f, 62.92f, 116.55f, 63.772f)
                    curveTo(115.823f, 63.917f, 115.212f, 64.469f, 114.513f, 64.22f)
                    curveTo(114.325f, 63.597f, 114.922f, 63.826f, 114.764f, 62.925f)
                    curveTo(113.912f, 58.069f, 114.845f, 53.153f, 114.559f, 48.318f)
                    curveTo(115.037f, 48.388f, 114.818f, 48.37f, 115.282f, 48.253f)
                    curveTo(120.59f, 46.918f, 126.137f, 46.315f, 131.46f, 45.056f)
                    curveTo(131.563f, 44.912f, 131.666f, 44.768f, 131.769f, 44.624f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFE6CEFF), 1.0f to Color(0xFFFFFFFF),
                        start = Offset(132.318f,58.7927f), end = Offset(118.705f,51.4936f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(132.671f, 51.77f)
                    curveTo(133.841f, 51.564f, 134.953f, 51.976f, 135.278f, 53.214f)
                    curveTo(135.426f, 53.795f, 135.311f, 54.412f, 134.964f, 54.901f)
                    curveTo(134.122f, 56.088f, 130.262f, 56.466f, 128.731f, 56.753f)
                    lineTo(118.335f, 58.697f)
                    curveTo(117.254f, 58.749f, 116.333f, 58.452f, 115.962f, 57.299f)
                    curveTo(114.985f, 54.261f, 120.587f, 54.036f, 122.76f, 53.627f)
                    lineTo(132.671f, 51.77f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF3E9FE)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(110.191f, 55.852f)
                    curveTo(111.535f, 55.579f, 112.845f, 56.448f, 113.115f, 57.793f)
                    curveTo(113.386f, 59.137f, 112.513f, 60.445f, 111.168f, 60.713f)
                    curveTo(109.828f, 60.98f, 108.524f, 60.11f, 108.254f, 58.77f)
                    curveTo(107.985f, 57.43f, 108.851f, 56.124f, 110.191f, 55.852f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF843BA4), 1.0f to Color(0xFFCF56BD),
                        start = Offset(179.96f,211.601f), end = Offset(163.209f,211.369f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(184.398f, 203.474f)
                    curveTo(185.316f, 203.884f, 185.575f, 203.059f, 186.3f, 203.508f)
                    curveTo(186.717f, 204.756f, 186.81f, 208.922f, 186.588f, 210.177f)
                    curveTo(185.701f, 211.01f, 184.564f, 210.506f, 184.342f, 211.493f)
                    curveTo(183.856f, 211.701f, 182.793f, 212.074f, 182.254f, 212.153f)
                    curveTo(179.59f, 213.108f, 176.702f, 213.979f, 173.986f, 214.795f)
                    curveTo(163.269f, 218.012f, 152.625f, 221.677f, 141.899f, 224.84f)
                    curveTo(141.492f, 224.741f, 141.431f, 224.771f, 141.106f, 224.558f)
                    curveTo(143.199f, 224.04f, 145.347f, 223.287f, 147.419f, 222.64f)
                    lineTo(157.424f, 219.534f)
                    curveTo(158.884f, 219.076f, 160.659f, 218.554f, 162.135f, 218.089f)
                    curveTo(162.346f, 218.023f, 162.347f, 217.738f, 162.438f, 217.425f)
                    lineTo(162.74f, 217.383f)
                    curveTo(162.939f, 217.599f, 162.914f, 217.582f, 163.149f, 217.763f)
                    curveTo(163.498f, 216.847f, 163.352f, 211.547f, 163.333f, 210.258f)
                    curveTo(162.234f, 210.865f, 159.232f, 211.63f, 157.824f, 212.076f)
                    lineTo(141.338f, 217.171f)
                    curveTo(141.241f, 216.952f, 141.287f, 217.078f, 141.214f, 216.787f)
                    curveTo(141.705f, 216.525f, 144.272f, 215.764f, 144.942f, 215.561f)
                    curveTo(147.537f, 214.789f, 150.127f, 214.002f, 152.714f, 213.202f)
                    lineTo(170.967f, 207.551f)
                    curveTo(174.204f, 206.553f, 178.089f, 205.255f, 181.303f, 204.447f)
                    curveTo(181.753f, 204.187f, 183.824f, 203.619f, 184.398f, 203.474f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF7435A0)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(184.399f, 203.474f)
                    curveTo(185.316f, 203.884f, 185.576f, 203.059f, 186.301f, 203.508f)
                    curveTo(186.717f, 204.756f, 186.811f, 208.922f, 186.588f, 210.177f)
                    curveTo(185.702f, 211.01f, 184.565f, 210.506f, 184.342f, 211.493f)
                    curveTo(183.857f, 211.701f, 182.794f, 212.074f, 182.254f, 212.153f)
                    curveTo(180.952f, 212.048f, 180.996f, 212.331f, 179.978f, 212.444f)
                    curveTo(179.97f, 212.311f, 179.961f, 212.177f, 179.953f, 212.043f)
                    curveTo(180.572f, 210.838f, 179.146f, 209.802f, 180.182f, 208.737f)
                    curveTo(180.337f, 208.578f, 180.208f, 205.568f, 180.194f, 205.127f)
                    lineTo(179.921f, 205.175f)
                    curveTo(180.669f, 204.954f, 180.76f, 204.964f, 181.303f, 204.447f)
                    curveTo(181.753f, 204.187f, 183.824f, 203.619f, 184.399f, 203.474f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF1C1784), 1.0f to Color(0xFF67319C),
                        start = Offset(202.913f,202.29f), end = Offset(186.259f,202.135f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(197.26f, 193.567f)
                    curveTo(199.36f, 193.635f, 201.462f, 193.725f, 203.56f, 193.839f)
                    curveTo(203.414f, 204.104f, 197.895f, 207.906f, 188.858f, 210.132f)
                    curveTo(187.391f, 210.493f, 185.827f, 211.174f, 184.342f, 211.493f)
                    curveTo(184.565f, 210.506f, 185.701f, 211.01f, 186.588f, 210.177f)
                    curveTo(186.811f, 208.922f, 186.717f, 204.755f, 186.301f, 203.508f)
                    curveTo(185.575f, 203.059f, 185.316f, 203.884f, 184.399f, 203.474f)
                    curveTo(190.98f, 200.895f, 194.97f, 201.675f, 197.26f, 193.567f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFB7289)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(136.479f, 77.026f)
                    curveTo(137.895f, 76.65f, 140.346f, 76.276f, 141.849f, 76.003f)
                    lineTo(151.79f, 74.176f)
                    curveTo(151.417f, 75.448f, 151.006f, 76.771f, 150.668f, 78.047f)
                    curveTo(148.859f, 78.075f, 145.826f, 77.788f, 143.953f, 77.642f)
                    curveTo(141.671f, 77.463f, 138.684f, 77.349f, 136.479f, 77.026f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFF6421), 1.0f to Color(0xFFCF405B),
                        start = Offset(196.99f,98.0821f), end = Offset(259.784f,174.213f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(199.562f, 75.124f)
                    lineTo(214.8f, 76.113f)
                    lineTo(219.938f, 76.442f)
                    curveTo(224.235f, 76.717f, 228.89f, 76.927f, 233.161f, 77.304f)
                    curveTo(233.511f, 77.576f, 233.482f, 77.579f, 233.551f, 78.2f)
                    curveTo(234.156f, 83.629f, 234.762f, 89.077f, 235.371f, 94.506f)
                    lineTo(239.169f, 128.342f)
                    lineTo(243.472f, 166.773f)
                    curveTo(244.205f, 173.318f, 245.09f, 180.206f, 245.692f, 186.741f)
                    lineTo(222.453f, 193.787f)
                    curveTo(222.327f, 189.164f, 221.737f, 183.144f, 221.416f, 178.453f)
                    lineTo(219.325f, 147.954f)
                    lineTo(216.582f, 108.207f)
                    curveTo(216.049f, 99.707f, 215.422f, 91.214f, 214.703f, 82.729f)
                    curveTo(210.352f, 82.295f, 205.816f, 82.095f, 201.423f, 81.72f)
                    curveTo(201.09f, 81.324f, 199.849f, 76.156f, 199.562f, 75.124f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF8C264D), 1.0f to Color(0xFFB23A5F),
                        start = Offset(230.776f,78.9849f), end = Offset(200.3f,78.8773f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(199.562f, 75.124f)
                    lineTo(214.8f, 76.113f)
                    lineTo(219.938f, 76.442f)
                    curveTo(224.235f, 76.717f, 228.89f, 76.927f, 233.161f, 77.304f)
                    curveTo(231.947f, 77.839f, 226.773f, 79.3f, 225.225f, 79.701f)
                    curveTo(221.946f, 80.551f, 217.904f, 81.985f, 214.703f, 82.729f)
                    curveTo(210.352f, 82.295f, 205.816f, 82.095f, 201.423f, 81.72f)
                    curveTo(201.09f, 81.324f, 199.849f, 76.156f, 199.562f, 75.124f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFEC233)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(162.269f, 56.682f)
                    curveTo(169.351f, 50.776f, 178.332f, 50.502f, 186.198f, 55.024f)
                    curveTo(196.703f, 48.788f, 209.377f, 52.133f, 215.182f, 62.806f)
                    curveTo(217.494f, 67.059f, 219.143f, 71.668f, 219.938f, 76.442f)
                    lineTo(214.8f, 76.113f)
                    lineTo(199.562f, 75.124f)
                    curveTo(199.849f, 76.156f, 201.09f, 81.324f, 201.424f, 81.72f)
                    curveTo(202.247f, 83.106f, 203.229f, 92.996f, 203.094f, 94.834f)
                    curveTo(203.153f, 95.573f, 203.215f, 97.663f, 203.356f, 98.244f)
                    curveTo(204.206f, 101.744f, 200.828f, 104.708f, 198.476f, 101.08f)
                    curveTo(198.337f, 99.058f, 198.224f, 97.035f, 198.135f, 95.01f)
                    curveTo(197.97f, 94.488f, 197.434f, 90.385f, 197.393f, 89.579f)
                    curveTo(197.273f, 87.265f, 195.941f, 83.287f, 196.033f, 81.272f)
                    curveTo(195.692f, 79.879f, 194.793f, 75.935f, 194.099f, 74.81f)
                    curveTo(189.447f, 74.393f, 184.419f, 74.163f, 179.73f, 73.863f)
                    curveTo(178.042f, 73.764f, 176.355f, 73.647f, 174.668f, 73.512f)
                    curveTo(172.295f, 73.453f, 169.705f, 73.219f, 167.301f, 73.09f)
                    curveTo(165.786f, 72.945f, 162.821f, 72.929f, 161.601f, 72.709f)
                    curveTo(160.114f, 72.564f, 158.973f, 72.854f, 157.51f, 73.132f)
                    curveTo(156.873f, 74.384f, 156.163f, 76.975f, 155.751f, 78.413f)
                    curveTo(155.024f, 81.527f, 154.302f, 84.629f, 153.834f, 87.793f)
                    curveTo(153.731f, 88.484f, 153.665f, 89.313f, 153.493f, 89.975f)
                    curveTo(153.252f, 92.248f, 153.685f, 97.197f, 150.353f, 96.939f)
                    curveTo(149.643f, 96.889f, 148.99f, 96.53f, 148.568f, 95.957f)
                    curveTo(147.608f, 94.656f, 148.29f, 91.485f, 148.499f, 89.819f)
                    curveTo(148.566f, 89.665f, 148.523f, 89.793f, 148.546f, 89.588f)
                    curveTo(148.936f, 86.141f, 149.621f, 81.331f, 150.668f, 78.047f)
                    curveTo(151.006f, 76.771f, 151.417f, 75.448f, 151.79f, 74.176f)
                    curveTo(153.381f, 69.505f, 154.574f, 66.631f, 157.272f, 62.375f)
                    curveTo(158.999f, 59.944f, 160.148f, 58.677f, 162.269f, 56.682f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(186.197f, 55.024f)
                    curveTo(196.702f, 48.788f, 209.376f, 52.133f, 215.182f, 62.806f)
                    curveTo(217.494f, 67.059f, 219.142f, 71.668f, 219.938f, 76.442f)
                    lineTo(214.799f, 76.113f)
                    lineTo(199.561f, 75.124f)
                    curveTo(197.364f, 68.202f, 195.212f, 63.839f, 190.427f, 58.368f)
                    curveTo(189.499f, 57.783f, 187.777f, 56.057f, 186.197f, 55.024f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFB731), 1.0f to Color(0xFFFF8735),
                        start = Offset(219.073f,63.9814f), end = Offset(187.151f,64.398f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(186.197f, 55.024f)
                    curveTo(196.702f, 48.788f, 209.376f, 52.133f, 215.182f, 62.806f)
                    curveTo(217.494f, 67.059f, 219.142f, 71.668f, 219.938f, 76.442f)
                    lineTo(214.799f, 76.113f)
                    curveTo(212.863f, 67.974f, 209.17f, 58.437f, 199.636f, 57.115f)
                    curveTo(196.203f, 56.638f, 193.613f, 57.094f, 190.427f, 58.368f)
                    curveTo(189.499f, 57.783f, 187.777f, 56.057f, 186.197f, 55.024f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(163.905f, 62.046f)
                    curveTo(165.66f, 60.085f, 167.883f, 58.604f, 170.368f, 57.739f)
                    curveTo(174.23f, 56.457f, 178.441f, 56.743f, 182.096f, 58.536f)
                    curveTo(183.485f, 59.186f, 185.198f, 60.275f, 186.224f, 61.428f)
                    curveTo(182.766f, 65.299f, 181.162f, 68.857f, 179.73f, 73.863f)
                    curveTo(178.042f, 73.764f, 176.355f, 73.647f, 174.668f, 73.512f)
                    curveTo(172.295f, 73.453f, 169.705f, 73.219f, 167.3f, 73.09f)
                    lineTo(163.905f, 62.046f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFE7C2D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(182.096f, 58.536f)
                    curveTo(183.484f, 59.186f, 185.197f, 60.275f, 186.224f, 61.428f)
                    curveTo(182.766f, 65.299f, 181.162f, 68.857f, 179.73f, 73.863f)
                    curveTo(178.042f, 73.764f, 176.355f, 73.647f, 174.668f, 73.512f)
                    curveTo(176.032f, 67.975f, 178.315f, 62.844f, 182.096f, 58.536f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(186.224f, 61.428f)
                    curveTo(188.939f, 63.476f, 193.689f, 71.539f, 194.099f, 74.81f)
                    curveTo(189.447f, 74.393f, 184.419f, 74.163f, 179.73f, 73.863f)
                    curveTo(181.162f, 68.857f, 182.766f, 65.299f, 186.224f, 61.428f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF968B6)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(163.905f, 62.046f)
                    lineTo(167.3f, 73.09f)
                    curveTo(165.785f, 72.945f, 162.82f, 72.929f, 161.601f, 72.709f)
                    lineTo(161.737f, 72.633f)
                    curveTo(161.889f, 72.017f, 160.499f, 67.989f, 160.226f, 67.119f)
                    curveTo(161.23f, 65.278f, 162.467f, 63.573f, 163.905f, 62.046f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF3E9FE)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(160.226f, 67.119f)
                    curveTo(160.499f, 67.989f, 161.89f, 72.017f, 161.738f, 72.633f)
                    lineTo(161.601f, 72.709f)
                    curveTo(160.114f, 72.564f, 158.972f, 72.854f, 157.51f, 73.132f)
                    curveTo(157.769f, 71.782f, 159.521f, 68.38f, 160.226f, 67.119f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFB73D63), 1.0f to Color(0xFFE65679),
                        start = Offset(195.183f,76.9338f), end = Offset(156.412f,76.6499f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(157.51f, 73.132f)
                    curveTo(158.972f, 72.854f, 160.114f, 72.564f, 161.601f, 72.709f)
                    curveTo(162.821f, 72.929f, 165.786f, 72.945f, 167.3f, 73.09f)
                    curveTo(169.705f, 73.219f, 172.295f, 73.453f, 174.668f, 73.512f)
                    curveTo(176.355f, 73.647f, 178.042f, 73.764f, 179.73f, 73.863f)
                    curveTo(184.419f, 74.163f, 189.447f, 74.393f, 194.099f, 74.81f)
                    curveTo(194.793f, 75.935f, 195.692f, 79.878f, 196.033f, 81.272f)
                    curveTo(195.363f, 81.43f, 158.121f, 78.811f, 155.751f, 78.413f)
                    curveTo(156.163f, 76.975f, 156.872f, 74.384f, 157.51f, 73.132f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFD6027), 1.0f to Color(0xFFD9474F),
                        start = Offset(145.778f,94.5132f), end = Offset(155.319f,94.5697f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(153.492f, 89.975f)
                    curveTo(153.941f, 90.065f, 154.411f, 90.485f, 154.706f, 90.806f)
                    curveTo(157.659f, 94.007f, 155.159f, 99.779f, 150.638f, 99.629f)
                    curveTo(145.633f, 99.464f, 143.766f, 93.448f, 147.343f, 90.185f)
                    curveTo(147.697f, 89.862f, 148.049f, 89.739f, 148.499f, 89.819f)
                    curveTo(148.289f, 91.485f, 147.607f, 94.656f, 148.567f, 95.957f)
                    curveTo(148.99f, 96.53f, 149.642f, 96.889f, 150.353f, 96.939f)
                    curveTo(153.684f, 97.197f, 153.252f, 92.248f, 153.492f, 89.975f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFD6028), 1.0f to Color(0xFFD9474F),
                        start = Offset(195.782f,100.092f), end = Offset(205.473f,100.051f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(203.093f, 94.834f)
                    curveTo(210.177f, 99.198f, 203.359f, 107.848f, 197.594f, 103.916f)
                    curveTo(194.624f, 101.89f, 194.785f, 97.136f, 198.134f, 95.01f)
                    curveTo(198.224f, 97.035f, 198.337f, 99.058f, 198.476f, 101.08f)
                    curveTo(200.828f, 104.708f, 204.206f, 101.744f, 203.356f, 98.244f)
                    curveTo(203.215f, 97.663f, 203.153f, 95.573f, 203.093f, 94.834f)
                    close()
                }
            }
        }
        .build()
        return _appicon!!
    }

private var _appicon: ImageVector? = null
