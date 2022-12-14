package com.example.asignacion2


sealed class Routes(val route: String) {
    object Logueo : Routes("Login")
    object inSideMain : Routes("insideMain")
    object cartelera : Routes("cartelera")
    object resumenDetective :Routes(route = "resumenDetective")
    object resumenDrStrange :Routes(route = "resumenDrStrange")
    object resumenTopGun :Routes(route = "resumenTopgun")
}