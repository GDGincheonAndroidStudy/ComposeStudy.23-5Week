package com.example.applemusic.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
//    primary = White,
//    onPrimary = Black,
    primary = red200,
    onPrimary = White,
    primaryVariant = Purple700,
    secondary = White,
    onSecondary = Black
)

private val LightColorPalette = lightColors(
    primary = White,
    onPrimary = Black,
    primaryVariant = Purple700,
    secondary = red200,
    onSecondary = White

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun GdgStudyTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}