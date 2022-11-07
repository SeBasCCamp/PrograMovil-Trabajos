package com.example.asignacion3.Pantallas

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController
import com.example.asignacion3.ui.theme.Asignacion3Theme

@SuppressLint("RememberReturnType")
@Composable

fun Equipos(){
    Asignacion3Theme {
        val navController = rememberNavController()
        val navigationActions = remember(navController){
            EquiposActions(navController)
        }

        EquiposNavGraph(
            navController = navController,
            navigateToHome = navigationActions.navigateToHome,
            navigateToDetail = navigationActions.navigateToDetails
        )
    }
}