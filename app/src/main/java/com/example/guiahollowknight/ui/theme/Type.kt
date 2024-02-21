package com.example.guiahollowknight.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.guiahollowknight.R


val DancingScript = FontFamily(
    Font(R.font.dancingscript_regular),
    Font(R.font.dancingscript_bold)
)
val Pacifico = FontFamily(
    Font(R.font.pacifico_regular),
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = DancingScript,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    ),
    displayMedium = TextStyle(
        fontFamily = DancingScript,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    ),
    displayLarge = TextStyle(
        fontFamily = Pacifico,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    ),
    displaySmall = TextStyle(
        fontFamily = DancingScript,
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp
    )

)