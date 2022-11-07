package com.example.asignacion3.Pantallas

import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination

sealed class Screen(val route: String){
    object Home: Screen("Home")
    object Detail: Screen("detail?id={id}"){
        fun passId(id : Int): String{
            return "detail?id=$id"
        }
    }
}

class EquiposActions(navController: NavController){
    val navigateHome: () -> Unit={
        navController.navigate(Screen.Home.route){
            popUpTo(navController.graph.findStartDestination().id){
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }

    val navigateDetails = { id: Int ->
        navController.navigate(Screen.Detail.passId(id)){
            popUpTo(navController.graph.findStartDestination().id){
                saveState = true
            }
        }
    }
}