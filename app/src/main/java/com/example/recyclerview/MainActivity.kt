package com.example.recyclerview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.recyclerview.ui.theme.RecyclerViewTheme
import com.example.recyclerview.viewmodels.GamesViewModel
import com.example.recyclerview.views.CardGame

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecyclerViewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainView()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainView() {
    val gamesViewModel = GamesViewModel()
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        //Llamar y mostrar la lista
        LazyColumn {
            items(gamesViewModel.getGameList()) {
                game ->
                //Dentro de los parentesis va la lista o arreglo de la lista
                //Dentro de las llaves seria la vista a repetir
                CardGame(game)
            }
        }
    }
}