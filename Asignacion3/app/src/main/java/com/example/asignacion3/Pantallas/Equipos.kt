package com.example.asignacion3.Pantallas

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController
import com.example.asignacion3.Pantallas.domain.model.Teams
import com.example.asignacion3.ui.theme.Asignacion3Theme

@SuppressLint("RememberReturnType")
@Composable

fun Teams(){
    Asignacion3Theme {
        val navController = rememberNavController()
        val navigationActions = remember(navController){
            TeamsActions(navController)
        }

        TeamsNavGraph(
            navController = navController,
            navigateToHome = navigationActions.navigateToHome,
            navigateToDetail = navigationActions.navigateToDetail
        )
    }
}