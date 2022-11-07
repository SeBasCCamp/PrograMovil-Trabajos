package com.example.asignacion3.Pantallas

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.asignacion3.Routes

data class Paises(val nombre: String, val fundado: String, val routes: Routes)



private val listaPeliculas = listOf(
    Paises(nombre = "Uruguay", fundado = "1900",Routes.Pais),
    Paises(nombre = "Germany", fundado = "1900", Routes.Pais),
    Paises(nombre = "Spain", fundado = "1909", Routes.Pais),
    Paises(nombre = "Argentina", fundado = "1893", Routes.Pais),
    Paises(nombre = "Ghana", fundado = "1957", Routes.Pais),
    Paises(nombre = "Brazil", fundado = "1914", Routes.Pais),
)


@Composable
fun Equipos(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {

        Box(Modifier.fillMaxSize()) {
            LazyColumn(contentPadding = PaddingValues(16.dp), verticalArrangement = Arrangement.spacedBy(20.dp))
            {
                items(listaPeliculas){
                    Relleno(paises =it)
                }
            }
        }

        Column(Modifier.fillMaxSize()) {
            Box(modifier = Modifier.fillMaxSize()) {
                Button(
                    onClick = { navController.navigate(Routes.Equipos.route) },
                    shape = RoundedCornerShape(50.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .align(Alignment.BottomCenter)
                ) {
                    Text(text = "Ingresar")
                }
            }
            Box(modifier = Modifier.fillMaxSize()) {
                Button(
                    onClick = { navController.navigate(Routes.Equipos.route) },
                    shape = RoundedCornerShape(50.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .align(Alignment.BottomCenter)
                ) {
                    Text(text = "Ingresar")
                }
            }
        }
    }
}


@Composable
fun Relleno(paises:Paises){

    val navController = rememberNavController()

    Button(onClick = { navController.navigate(paises.routes.route)}) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceBetween,

                    ) {


                    Text(
                        text = paises.nombre,
                        style = TextStyle(fontSize = 20.sp),
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = paises.fundado,
                        style = TextStyle(
                            fontSize = 20.sp
                        )
                    )

                }
            }
        }
    }
}
