package com.example.segoupdated.presentation.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.segoupdated.presentation.ui.theme.PrimaryColor

@Composable
fun CustomButton(
    text: String,
    modifier: Modifier,
    onClick: () -> (Unit)
) {
    Button(
        onClick = {
            onClick()
        }, colors = ButtonDefaults.buttonColors(PrimaryColor),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 50.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(PrimaryColor)
    ) {
        Text(text = text)
    }
}