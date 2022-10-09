package com.example.asignacion2


sealed class Routes(val route: String) {
    object Login : Routes("Login")
}