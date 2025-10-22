package com.example.android_login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.text.ClickableText
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.withStyle

@Composable
fun Signup(navController: NavController) {
    var text by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var Confirmpassword by remember { mutableStateOf("") }

    val DarkBlue = Color(0xFF0D47A1)
    val DarkPink = Color(0xFFffB5C0)

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkPink),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.welcome),
            contentDescription = "welcome image",
            modifier = Modifier.size(200.dp)
        )

        Column(
            modifier = Modifier
                .weight(1f)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
                )
        ) {
            Text(
                text = "Sign Up",
                color = Color.Gray,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                textAlign = TextAlign.Start
            )

            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Email") },
                placeholder = { Text("Your number or Email") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 8.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") },
                placeholder = { Text("Password") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 8.dp)
            )

            OutlinedTextField(
                value = Confirmpassword,
                onValueChange = { Confirmpassword = it },
                label = { Text("Confirm Password") },
                placeholder = { Text("Confirm Password") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 8.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { navController.navigate("welcome") },
                colors = ButtonDefaults.buttonColors(containerColor = DarkPink),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                Text(text = "Login", color = Color.White)
            }

            Spacer(modifier = Modifier.height(16.dp))

            val annotatedText = buildAnnotatedString {
                append("Already have an account? ")
                pushStringAnnotation(tag = "Login", annotation = "login")
                withStyle(style = SpanStyle(color = Color(0xFF0D47A1), fontWeight = FontWeight.Bold, textDecoration = TextDecoration.Underline)) {
                    append("Sign Up")
                }
                pop()
            }

            ClickableText(
                text = annotatedText,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 18.sp,
                    color = Color.Gray
                ),
                onClick = { offset ->
                    annotatedText.getStringAnnotations(tag = "SignUp", start = offset, end = offset)
                        .firstOrNull()?.let { annotation ->
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(annotation.item))
                            context.startActivity(intent)
                        }
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .wrapContentWidth(Alignment.CenterHorizontally)
            ) {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email",
                    tint = DarkBlue,
                    modifier = Modifier.size(30.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.twitter),
                    contentDescription = "Twitter",
                    tint = DarkBlue,
                    modifier = Modifier.size(30.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignupPreview() {
    val navController = rememberNavController()
    Signup(navController)
}
