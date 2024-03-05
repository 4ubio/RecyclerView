package com.example.recyclerview.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recyclerview.R

@Preview(showBackground = true)
@Composable
fun CardGame() {
    Card (modifier = Modifier.padding(8.dp)) {
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            //Imagen
            Image(
                painter = painterResource(id = R.drawable.pk_ss),
                contentDescription = "PK_SS",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(120.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column () {
                Text(
                    text = "Pokemon Soul Silver",
                    color = Color(0xFF000000),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 5.dp)
                )

                Spacer(modifier = Modifier.height(5.dp))

                GameData()

                Spacer(modifier = Modifier.height(5.dp))

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Color(0xFF009688)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Comprar")
                }
            }
        }
        //Nombre del juego
        //Consola y precio

        //Button
    }
}

