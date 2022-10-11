package com.example.asignacion2.Loguin
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.asignacion2.Routes
import pe.edu.ulima.listadosapp.GestorPeliculas
import java.util.Objects


/*
@Composable
fun Pregunta2(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()) {
        NavigationDrawer(navController)
    }
}
*/

data class Pelicula(val nombre: String, val hora: String, val routes: Routes)



private val listaPeliculas = listOf(
    Pelicula(nombre = "Dr Strange 2", hora = "15:00", Routes.resumenDrStrange),
    Pelicula(nombre = "Top Gun 2", hora = "17:00", Routes.resumenTopGun),
    Pelicula(nombre = "Detective Pikachu", hora = "11:00", Routes.resumenDetective)
)


@Composable

fun cartelera(openDrawer: () ->Unit) {

    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(
            title = "Cartelera",
            buttonIcon = Icons.Filled.Menu,
            onButtonClicked = { openDrawer() }
        )
        Box(Modifier.fillMaxSize()) {
            LazyColumn(contentPadding = PaddingValues(16.dp), verticalArrangement = Arrangement.spacedBy(20.dp))
            {
                items(listaPeliculas){
                    CarteleraDiseño(pelicula =it)
                }
            }
        }
    }
}

@Composable
fun CarteleraDiseño(pelicula: Pelicula) {

    val navController = rememberNavController()

    Button(onClick = { navController.navigate(pelicula.routes.hashCode())}) {
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
                        text = pelicula.nombre,
                        style = TextStyle(fontSize = 20.sp),
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = pelicula.hora,
                        style = TextStyle(
                            fontSize = 20.sp
                        )
                    )

                }
            }
        }
    }

}



/*
@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    val navController = rememberNavController()
    cartelera(navController = navController)
}
*/
