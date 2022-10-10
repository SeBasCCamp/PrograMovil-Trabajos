package com.example.asignacion2


sealed class Routes(val route: String) {
    object Logueo : Routes("Login")
    object Pregunta2 : Routes("Logueo")
    object Cartelera : Routes("Cartelera")
    object Sobre_nosotros : Routes("Sobre_nosotros")
    object inSideMain : Routes("insideMain")
}