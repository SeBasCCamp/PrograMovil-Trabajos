package com.example.asignacion2


sealed class Routes(val route: String) {
    object Logueo : Routes("Login")
    object Pregunta2 : Routes("Logueo")
}