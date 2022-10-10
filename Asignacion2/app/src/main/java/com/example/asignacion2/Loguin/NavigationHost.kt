package com.example.asignacion2.Loguin

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.asignacion2.Routes.*

@Composable
fun NavigationHost(navController: NavHostController){
    
    NavHost(navController = navController,
        startDestination = Pregunta2.route){
        composable(Pregunta2.route){
            Pregunta2()
        }

        composable(Sobre_nosotros.route){
            Sobre_nosotros
        }
    }
}


