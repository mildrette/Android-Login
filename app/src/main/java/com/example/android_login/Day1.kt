package com.example.android_login

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Day1(){
val name = "mildred"
    val age = 31
    val city = "Bamenday"

    Text("my name is $name and i am $age years old, I live in $city ")
}


@Composable
fun functions(){
    
}





@Preview(showBackground = true)
@Composable
fun Day1Preview() {
    Day1()
}
