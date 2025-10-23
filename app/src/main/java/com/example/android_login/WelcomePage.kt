package com.example.android_login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WelcomePage(navController: NavController) {

    val DarkBlue = Color(0xFF0D47A1)
    val DarkPink = Color(0xFFFFB5C0)
    val DarkBluey = Color(0xFF023047)

    var selectedItem by remember { mutableStateOf("home") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "RelaySMS",
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = DarkBluey
                )
            )
        },
        bottomBar = {
            NavigationBar(containerColor = DarkBluey) {
                NavigationBarItem(
                    selected = selectedItem == "home",
                    onClick = { selectedItem = "home" },
                    icon = { Icon(Icons.Filled.Home, contentDescription = "Home") },
                    label = { Text("Home") }
                )
                NavigationBarItem(
                    selected = selectedItem == "info",
                    onClick = { selectedItem = "info" },
                    icon = { Icon(Icons.Filled.Info, contentDescription = "About") },
                    label = { Text("About") }
                )
                NavigationBarItem(
                    selected = selectedItem == "settings",
                    onClick = { selectedItem = "settings" },
                    icon = { Icon(Icons.Filled.Settings, contentDescription = "Settings") },
                    label = { Text("Settings") }
                )
            }
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(innerPadding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Welcome to RelaySMS!",
                color = DarkBluey,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 32.dp)
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(DarkBlue),
                contentAlignment = Alignment.Center
            ) {
                Text("Section 1", color = Color.White, fontSize = 20.sp)
            }

            Spacer(modifier = Modifier.height(16.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(DarkPink),
                contentAlignment = Alignment.Center
            ) {
                Text("Section 2", color = Color.White, fontSize = 20.sp)
            }

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "Your secure messaging app that works online and offline.",
                color = Color.Gray,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { navController.navigate("login") },
                colors = ButtonDefaults.buttonColors(containerColor = DarkBluey),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text("Get Started", color = Color.White, fontSize = 18.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomePagePreview() {
    val navController = rememberNavController()
    WelcomePage(navController)
}
