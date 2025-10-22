package com.example.android_login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
@Composable
fun Home(navController: NavController) {

    val DarkBlue = Color(0xFF0D47A1)
    val DarkPink = Color(0xFFFFB5C0)
    val DarkBluey = Color(0xFF023047)


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkBluey),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Box(
            modifier = Modifier
                .size(200.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "The App",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                fontSize = 40.sp,
                textAlign = TextAlign.Center
            )
        }
        Button( onClick = { navController.navigate("login")},
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
        )
        {Text ("Get Started", color = Color.Gray)
        }
    }
}



@Preview(showBackground = true)
@Composable
fun HomePreview() {
    val navController = rememberNavController()
    Home(navController)
}
