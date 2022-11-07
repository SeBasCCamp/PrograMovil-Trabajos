package com.example.asignacion3.Pantallas

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHost
import com.example.asignacion3.Routes
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.asignacion3.LogIn.LoginPage
import com.example.asignacion3.Routes.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Preview(showBackground = true)
@Composable
fun LoginMain(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = LogIn.route) {

        composable(LogIn.route) {
            LoginPage(navController = navController)
        }

        composable(Equipos.route) {
            Equipos()
        }
    }
}





