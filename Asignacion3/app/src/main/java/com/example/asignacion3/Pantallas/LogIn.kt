package com.example.asignacion3.LogIn

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.asignacion3.Routes
import com.example.asignacion3.ui.theme.Asignacion3Theme


@SuppressLint("UnrememberedMutableState")
@Composable
fun LoginPage(navController: NavHostController) {



    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        val username = remember { mutableStateOf(TextFieldValue()) }

        Text(text = "Cine Luna App", style = TextStyle(fontSize = 40.sp, fontFamily = FontFamily.Default),
            textAlign = TextAlign.Center  )

        Spacer(modifier = Modifier.height(285.dp))


        Text(text = "Ingrese su nombre: ")
        TextField(
            value = username.value,
            onValueChange = { username.value = it }
        )

        usuario.nombre = username.value.text

        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier.fillMaxSize()) {
            Button(
                onClick = { navController.navigate(Routes.inSideMain.route) },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .align(Alignment.BottomCenter)
            ) {
                Text(text = "Login")
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val navController = rememberNavController()
    LoginPage(navController = navController)
}