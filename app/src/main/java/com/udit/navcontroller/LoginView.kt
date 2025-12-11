package com.udit.navcontroller

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun LoginCall(onLoginClick :() -> Unit)
{
    Column(modifier = Modifier.fillMaxSize()
        .background(Color.Red),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(text = "Login Screen", fontSize = 30.sp)
        Button(
            onClick = onLoginClick,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        ) {
            Text("Move to Dashboard Screen")
        }
    }
}