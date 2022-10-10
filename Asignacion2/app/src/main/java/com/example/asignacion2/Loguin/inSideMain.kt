package com.example.asignacion2.Loguin

import android.support.v4.os.IResultReceiver.Default
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.asignacion2.Routes
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import com.example.asignacion2.Routes.*


@Composable
fun insideMain(){
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val navigationItems = listOf(
        Cartelera,
        Sobre_nosotros,
    )

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {TopBar(scope, scaffoldState)},
        drawerContent = {Drawer(
            scope,
            scaffoldState,
            navController,
            menu_items = navigationItems)}
    ){
        NavigationHost(navController)
    }

}

@Composable
fun TopBar(
    scope : CoroutineScope,
    scaffoldState: ScaffoldState
){
    TopAppBar(
        title = { Text(text="hola") },
        navigationIcon = {
            IconButton(onClick = {
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            }) {
                Icon(imageVector = Icons.Default.Menu,
                    contentDescription = "menu")
            }
        }
    )
}

@Composable
fun Drawer(
    scope: CoroutineScope,
    scaffoldState: ScaffoldState,
    navController: NavController,
    menu_items:List<Routes>
){

    Column {
        Spacer(modifier = Modifier
            .fillMaxWidth()
        )

        menu_items.forEach{item->
            DrawerItem(item = item){
                navController.navigate(item.route){
                    launchSingleTop = true
                }
                scope.launch {
                    scaffoldState.drawerState.close()
                }
            }
        }
    }
}

@Composable
fun DrawerItem(
    item:Routes,
    onItemClick:(Routes)->Unit
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(item) }

    ) {
        Text(text = item.route)

    }
}

@Preview
@Composable
fun Preview(){
    insideMain()
}
