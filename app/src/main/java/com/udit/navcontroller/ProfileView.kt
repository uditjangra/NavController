package com.udit.navcontroller

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp

@Composable
fun ProfileClick(onProfileClick :()-> Unit, onProfileClick2: () -> Unit, onCloseClick: () -> Unit){
    Column(modifier = Modifier.fillMaxSize()
        .background(Color.Blue),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Profile Screen", fontSize = 30.sp)
        Row(
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        ) {
            Button(
                onClick = onProfileClick,

            ) {
                Text("Move Back")
            }
            Button(
                onClick = onProfileClick2,

            ) {
                Text("Login Again")
            }
            Button(
                onClick = onCloseClick,

                ) {
                Text("Close App")
            }
        }
    }
}