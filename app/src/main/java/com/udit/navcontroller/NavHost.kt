package com.udit.navcontroller

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavHostRoute(navHostController: NavHostController){
    NavHost(navHostController, "login") {
        composable("login"){
            LoginCall(onLoginClick = {
                navHostController.navigate("dashboard")
            })
        }
        composable("dashboard"){
            DashboardView(onDashboardClick = {
                navHostController.navigate("profile")
            })
        }
        composable("profile"){
            ProfileClick(onProfileClick = {
                navHostController.navigate("dashboard")
            })
        }
    }
}