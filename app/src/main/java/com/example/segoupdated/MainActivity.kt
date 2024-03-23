package com.example.segoupdated

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.segoupdated.presentation.ui.theme.SEGOTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            SEGOTheme {
                // A surface container using the 'background' color from the theme

            }
        }
    }
}




