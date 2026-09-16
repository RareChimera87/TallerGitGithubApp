package com.example.tallergithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tallergithubapp.ui.theme.TallerGithubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TallerGithubAppTheme {

                    TrabajoHoy()

            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun TrabajoHoy() {
    Column (modifier=Modifier
        .background(Color.White)
        .fillMaxSize(),
        //verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Spacer(modifier = Modifier.height(30.dp))
        Image(
            painter =
                painterResource(R.drawable.yo),
            contentDescription = "Foto de perfil",
            modifier = Modifier.height(120.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(25.dp))
        Text(
            text = "Santiago Reina",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color.Black
        )
        Text(
            text = "Estudiante Ing. Sistemas",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            color = Color.Blue
        )
        Spacer(modifier = Modifier.height(25.dp))
        HorizontalDivider()
        Column(modifier=Modifier
            .padding(10.dp)
            .fillMaxWidth(),
            //verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.Start


        ) {
            Text(
                text = "EDAD",
                fontSize = 20.sp,
                color = Color.Gray,
                modifier = Modifier
                    .padding(vertical = 5.dp)
            )
            Text(
                text = "19",
                fontSize = 20.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(vertical = 5.dp)
            )
            Text(
                text = "Correo",
                fontSize = 20.sp,
                color = Color.Gray,
                modifier = Modifier
                    .padding(vertical = 5.dp)
            )
            Text(
                text = "sreina63@unab.edu.co",
                fontSize = 20.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(vertical = 5.dp)
            )
            Text(
                text = "Ciudad",
                fontSize = 20.sp,
                color = Color.Gray,
                modifier = Modifier
                    .padding(vertical = 5.dp)
            )
            Text(
                text = "Bucaramanga, Colombia",
                fontSize = 20.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(vertical = 5.dp)
            )
        }
        HorizontalDivider()
        Column(modifier=Modifier
            .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Sobre mi materia favorita",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(vertical = 5.dp)
            )
            Text(
                text = "Me apasiona el Desarrollo de Aplicaciones Moviles porque permite transformar ideas en herramientas tangibles que las personas usan a diario. Me encanta el reto de diseñar interfaces intuitivas.",
                fontSize = 20.sp,
                color = Color.Black,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding( 5.dp)
            )
        }

        Spacer(modifier = Modifier.height(90.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue
            ),
        ) {
            Text(
                text = "Contactar Conmigo",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,

            )
        }


    }

}

