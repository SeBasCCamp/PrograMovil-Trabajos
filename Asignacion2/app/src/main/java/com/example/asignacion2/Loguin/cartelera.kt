package com.example.asignacion2.Loguin
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/*
@Composable
fun Pregunta2(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()) {
        NavigationDrawer(navController)
    }
}
*/

data class Pelicula(val nombre: String, val hora: String)


private val listaPeliculas = listOf(
    Pelicula(nombre = "Dr Strange 2", hora = "15:00"),
    Pelicula(nombre = "Top Gun 2", hora = "17:00"),
    Pelicula(nombre = "Detective Pikachu", hora = "11:00")
)


@Composable
fun cartelera() {
    LazyColumn(contentPadding = PaddingValues(16.dp), verticalArrangement = Arrangement.spacedBy(20.dp))
    {
        items(listaPeliculas){

            CarteleraDiseño(pelicula =it)

        }
    }
}
@Composable
fun CarteleraDiseño(pelicula: Pelicula){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = pelicula.nombre,
                    style = TextStyle(
                        fontSize = 20.sp
                    ),

                )
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

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    cartelera()
}

