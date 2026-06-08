package com.example.praktam_2417051070.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val AppColorScheme = lightColorScheme(
    primary = BluePrimary,
    secondary = BlueSecondary,
    background = LightBackground,
    surface = CardSurface,
    onPrimary = OnPrimaryText
)

@Composable
fun HobiMatchTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = AppColorScheme,
        typography = AppTypography,
        content = content
    )
}