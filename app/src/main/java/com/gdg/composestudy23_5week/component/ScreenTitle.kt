package com.gdg.composestudy23_5week.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun ScreenHeader(title: String) {
    Text(
        text = title,
        fontWeight = FontWeight.Bold,
        fontSize = 35.sp,
        color = Color.Black
    )
}