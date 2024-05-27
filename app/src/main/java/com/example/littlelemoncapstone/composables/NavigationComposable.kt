package com.example.littlelemoncapstone.composables

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.littlelemoncapstone.navigation.Home
import com.example.littlelemoncapstone.navigation.Onboarding
import com.example.littlelemoncapstone.navigation.Profile

@Composable
fun NavigationComposable(context: Context,navController: NavHostController) {

    val sharedPreferences = context.getSharedPreferences("little_lemon_user_profile", Context.MODE_PRIVATE)
    var startDestination = Onboarding.route

    if (sharedPreferences.getBoolean("isRegistered", false)) {
        startDestination = Home.route
    }

    NavHost(navController = navController, startDestination = startDestination){
        composable(Onboarding.route){
        }
        composable(Home.route){
            Home(navController)
        }
        composable(Profile.route){
        }
    }
}