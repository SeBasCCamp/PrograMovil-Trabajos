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
fun Strange2(openDrawer: () ->Unit, navController: NavHostController){
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
            text = "Doctor Strange en el Multiverso de la Locura (en inglés: Doctor Strange in the Multiverse of Madness) es una película de superhéroes estadounidense basada en el personaje Doctor Strange, de Marvel Comics. Producida por Marvel Studios y distribuida por Walt Disney Studios Motion Pictures, es la secuela de Doctor Strange (2016) y la película número 28 del Universo cinematográfico de Marvel (UCM). La película está dirigida por Sam Raimi, escrita por Michael Waldron, y está protagonizada por Benedict Cumberbatch como Stephen Strange, junto a Elizabeth Olsen, Chiwetel Ejiofor, Benedict Wong, Xochitl Gomez, Michael Stuhlbarg y Rachel McAdams. En la película, Strange viaja a través del multiverso para proteger a América Chávez (Gómez), una adolescente capaz de abrir portales en forma de estrella a distintos universos, de Wanda Maximoff (Olsen).",
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

