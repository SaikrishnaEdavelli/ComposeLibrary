package com.example.uilibrary

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


@Composable
fun NBText(text:String){
    Text(text = text, fontFamily = FontFamily.Monospace, fontSize = 30.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
}

@Composable
fun NBText2(text:String){
    Text(text = text, fontFamily = FontFamily.Monospace, fontSize = 45.sp, fontWeight = FontWeight.Medium, color = Color.DarkGray)
}


