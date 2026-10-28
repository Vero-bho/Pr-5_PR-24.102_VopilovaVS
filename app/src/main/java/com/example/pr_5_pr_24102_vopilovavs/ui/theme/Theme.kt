package com.example.pr_5_pr_24102_vopilovavs.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import androidx.compose.ui.graphics.Color

val CustomLightPurple = Color(0xFFFFBB86FC)
val CustomPurple = Color(0xFF6200EE)
val CustomDarkPurple = Color(0xFF3700B3)

private val DarkColorScheme = darkColorScheme(
    primary = CustomDarkPurple,
    secondary = CustomPurple,
    tertiary = CustomLightPurple
)

private val LightColorScheme = lightColorScheme(
    primary = CustomPurple,
    secondary = CustomDarkPurple,
    tertiary = CustomLightPurple
)

@Composable
fun Pr5_PR24102_VopilovaVSTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) com.example.pr_5_pr_24102_vopilovavs.ui.theme.DarkColorScheme else com.example.pr_5_pr_24102_vopilovavs.ui.theme.LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}