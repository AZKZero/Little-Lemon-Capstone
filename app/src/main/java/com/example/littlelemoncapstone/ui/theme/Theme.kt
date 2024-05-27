package com.example.littlelemoncapstone.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.littlelemoncapstone.ui.theme.PrimaryGreen
import com.example.littlelemoncapstone.ui.theme.PrimaryYellow
import com.example.littlelemoncapstone.ui.theme.Purple700
import com.example.littlelemoncapstone.ui.theme.Secondary1
import com.example.littlelemoncapstone.ui.theme.Secondary2

private val DarkColorPalette = darkColors(
    primary = PrimaryGreen,
    primaryVariant = Purple700,
    secondary = Secondary2,
    onPrimary = Color.White
)

private val LightColorPalette = lightColors(
    primary = PrimaryYellow,
    primaryVariant = Purple700,
    secondary = Secondary1,
    onPrimary = Color.Black

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
fun LittleLemonTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
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