package com.example.android_login

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController, startDestination = "home") {
        composable("home") { Home(navController) }
        composable("login") { Login(navController) }
        composable("signup") { Signup(navController) }
        composable("welcome") { WelcomePage(navController) }
    }
}
