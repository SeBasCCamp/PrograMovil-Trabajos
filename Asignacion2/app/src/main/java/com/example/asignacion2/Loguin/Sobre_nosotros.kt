package com.example.asignacion2.Loguin

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Default
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun TopAppBarScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("¿Quienes Somos?")
                }
            )
        }
    ) {
        Box(Modifier.fillMaxSize()) {
            Text(
                text = "Aca nombres y codigo",
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3(){
    TopAppBarScreen()
}

