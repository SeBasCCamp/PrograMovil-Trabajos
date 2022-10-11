package com.example.asignacion2.Loguin


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.asignacion2.Routes

@Composable
fun TopGun(openDrawer: () ->Unit, navController: NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Text(
            text = "Doctor Strange 2",
            style = TextStyle(
                fontSize = 20.sp
            ),
            fontWeight = FontWeight.ExtraBold
        )
        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = null,
            modifier = Modifier.size(50.dp)
        )
        Text(
            text = "\"Top Gun: Maverick se lleva a cabo 35 años después de los eventos de la película \" +\n" +
                    "            \"original y muestra al legendario piloto Pete 'Maverick' Mitchell (Tom Cruise), como\" +\n" +
                    "            \" capitán y nuevo instructor de vuelo de la academia de pilotos de combate Top Gun en\" +\n" +
                    "            \" California. Allí guía ahora a los nuevos pilotos de combate, hombres y mujeres.\" +\n" +
                    "            \" Entre ellos está el teniente Bradley Bradshaw (Milles Teller), el hijo de Goose, \" +\n" +
                    "            \"su antiguo compañero que falleció en un accidente de vuelo durante el entrenamiento \" +\n" +
                    "            \"de pilotos, que busca convertirse ahora en un aviador mucho mejor de lo que su padre era.\"",
            style = TextStyle(
                fontSize = 20.sp
            ),
        )
    }
    Box(modifier = Modifier.fillMaxSize()) {

        Button(
            onClick = { navController.navigate(DrawerScreens.cartelera.route)},
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