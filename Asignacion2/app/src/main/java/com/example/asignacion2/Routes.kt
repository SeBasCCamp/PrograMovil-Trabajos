package com.example.asignacion2


sealed class Routes(val route: String) {
    object Logueo : Routes("Login")
    object inSideMain : Routes("insideMain")
    object cartelera : Routes("cartelera")
}