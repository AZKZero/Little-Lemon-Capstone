package com.example.littlelemoncapstone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.littlelemoncapstone.composables.NavigationComposable
import com.example.littlelemoncapstone.ui.theme.LittleLemonTheme

class MainActivity : ComponentActivity() {
    val sharedPreferences by lazy { getSharedPreferences("little_lemon_user_profile", MODE_PRIVATE) }
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    NavigationComposable(context = applicationContext,navController = navController)
                }
            }
        }
    }
}