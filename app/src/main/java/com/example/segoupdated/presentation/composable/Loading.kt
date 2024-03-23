package com.example.segoupdated.presentation.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun Loading() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.Black.copy(0.7f))
    ) {
        CircularProgressIndicator(
            color = Color.White,
            modifier = Modifier.align(Alignment.Center),
        )
    }
}