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
fun Detective(openDrawer: () ->Unit, navController: NavHostController){
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
            text = "Pokémon: Detective Pikachu es una película de fantasía dirigida por Rob Letterman" +
                    " y escrita por Nicole Perlman y Letterman, basada en el videojuego del mismo nombre. " +
                    "La película es una empresa conjunta estadounidense y japonesa producida por Legendary " +
                    "Pictures, The Pokémon Company, Warner Bros. Pictures y Toho.",
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