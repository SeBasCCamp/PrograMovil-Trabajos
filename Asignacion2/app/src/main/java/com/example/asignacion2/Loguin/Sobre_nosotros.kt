package com.example.asignacion2.Loguin

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Default
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.asignacion2.Routes

@Composable
fun sobreNosotros(openDrawer: () ->Unit) {

    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(
            title = "SobreNosotros",
            buttonIcon = Icons.Filled.Menu,
            onButtonClicked = { openDrawer() }
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Home Page content here.")
        }
    }


    Box(modifier = Modifier.fillMaxSize()) {
        val navController = rememberNavController()
        Button(
            onClick = { navController.navigate(Routes.inSideMain.route) },
            shape = RoundedCornerShape(50.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .align(Alignment.BottomCenter)
        ) {
            Text(text = "Regresar")
        }
    }
}

/*
@Preview(showBackground = true)
@Composable
fun DefaultPreview3(){
    val navController = rememberNavController()
    sobreNosotros(navController = navController)
}
*/
