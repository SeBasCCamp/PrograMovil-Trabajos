package com.example.asignacion2.Loguin

import android.graphics.drawable.Icon
import android.support.v4.os.IResultReceiver.Default
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.asignacion2.Routes
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import com.example.asignacion2.Routes.*
import com.example.asignacion2.Loguin.LoginPage


sealed class DrawerScreens(val title: String, val route : String) {
    object cartelera : DrawerScreens("Cartelera", "cartelera")
    object sobreNosotros : DrawerScreens("Sobre Nosotros", "sobreNosotros")
}

private val screens = listOf(
    DrawerScreens.cartelera,
    DrawerScreens.sobreNosotros,
)




@Composable
fun TopBar(title: String = "", buttonIcon: ImageVector, onButtonClicked: () -> Unit) {
    TopAppBar(
        title = {
            Text(text = "Hola  ")
            Text(
                usuario.nombre
            )
        },
        navigationIcon = {
            IconButton(onClick = { onButtonClicked() } ) {
                Icon(buttonIcon, contentDescription = "")
            }
        },
        backgroundColor = MaterialTheme.colors.primaryVariant
    )
}

@Composable
fun Drawer(
    modifier: Modifier = Modifier,
    onDestinationClicked: (route:String) -> Unit
) {
    Column(
        modifier
            .fillMaxSize()
    ) {

        Text(text = "Hola  " + usuario.nombre,
            style = MaterialTheme.typography.h4,
        )

        screens.forEach { screen ->
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = screen.title,
                style = MaterialTheme.typography.h4,
                modifier = Modifier.clickable {
                    onDestinationClicked(screen.route)
                }
            )
        }
    }
}

@Composable
fun PantallaPrincipal() {
    val navController = rememberNavController()
    Surface(color = MaterialTheme.colors.background) {
        val drawerState = rememberDrawerState(DrawerValue.Closed)
        val scope = rememberCoroutineScope()
        val openDrawer = {
            scope.launch {
                drawerState.open()
            }
        }
        ModalDrawer(
            drawerState = drawerState,
            gesturesEnabled = drawerState.isOpen,
            drawerContent = {
                Drawer(
                    onDestinationClicked = { route ->
                        scope.launch {
                            drawerState.close()
                        }
                        navController.navigate(route) {

                            popUpTo = navController.graph.startDestinationId
                            launchSingleTop = true
                        }
                    }
                )
            }
        ){
                NavHost(
                    navController = navController,
                    startDestination = DrawerScreens.cartelera.route)
                {
                    composable(DrawerScreens.cartelera.route){
                        cartelera(
                            openDrawer = {
                                openDrawer()
                            }
                        )
                    }

                    composable(DrawerScreens.sobreNosotros.route){
                        sobreNosotros(openDrawer = {
                            openDrawer()

                        },
                            navController
                        )
                    }
                }
        }
    }
}


@Preview
@Composable
fun Preview(){


}
