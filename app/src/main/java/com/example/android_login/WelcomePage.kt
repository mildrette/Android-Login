package com.example.android_login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun WelcomePage(navController: NavController){
    Column( horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(16.dp).fillMaxSize()){
        Text("WeLcome")
        Button(onClick = {navController.navigate("Home")}){
            Text("just Text")
        }
    }
}

@Preview
@Composable
fun WelcomePagePreview(){
    val navController = rememberNavController()
    WelcomePage(navController)
}