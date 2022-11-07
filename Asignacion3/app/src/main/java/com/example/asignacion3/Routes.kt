package com.example.asignacion3


sealed class Routes(val route: String) {
    object LogIn : Routes("LogIn")
    object Equipos : Routes("Equipos")
}