package com.example.week07

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {

    Column(

        modifier = Modifier
            .fillMaxSize()
            .padding(
                top = 70.dp,
                start = 30.dp
            )
    ) {

        Text(
            text = "Discover",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Nike App",
            fontSize = 18.sp
        )
    }
}