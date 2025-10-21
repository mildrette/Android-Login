package com.example.android_login

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(navController: NavHostController){
    NavHost(navController, startDestination = "login"){
        composable("login") { Login(navController) }
        composable("welcome"){
            WelcomePage(navController)
        }
    }

}
