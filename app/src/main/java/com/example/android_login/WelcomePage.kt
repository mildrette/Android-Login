package com.example.android_login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun WelcomePage(navController: NavController) {

    val DarkBlue = Color(0xFF0D47A1)
    val DarkPink = Color(0xFFFFB5C0)
    val DarkBluey = Color(0xFF023047)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(DarkBluey),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Welcome to RelaySMS!",
                color = Color.White,
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(DarkBlue),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Welcome to RelaySMS!",
                color = Color.White,
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(24.dp))


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Your secure messaging app that works online and offline.",
                color = Color.Gray,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { navController.navigate("login") },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(text = "Get Started", color = Color.White, fontSize = 18.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomePagePreview() {
    val navController = rememberNavController()
    WelcomePage(navController)
}



//.clip(CircleShape)
//                .background(Color.White),

//        Text("WeLcome", color = Color.DarkGray)
//        Button(
//            onClick = { navController.navigate("Home") },
//            colors = ButtonDefaults.buttonColors(
//                containerColor = colorResource(id = R.color.teal_700)
//            )
//        ) {
//            Text("just Text")
//        }