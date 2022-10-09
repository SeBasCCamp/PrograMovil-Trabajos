package com.example.asignacion2.Loguin

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.asignacion2.Routes
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Preview(showBackground = true)
@Composable
fun LoginMain(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Logueo.route) {

        composable(Routes.Logueo.route) {
            LoginPage(navController = navController)
        }

        composable(Routes.Pregunta2.route) {
            Pregunta2(navController = navController)
        }


    }
}
