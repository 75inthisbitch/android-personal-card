package com.example.mojawizytowka

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    EkranKlasy()
                }
            }
        }
    }
}

@Composable
fun EkranKlasy() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Moja klasa", fontSize = 30.sp)
        Informacja(text = "Szkoła: SCI Szczecin")
        Informacja(text = "Klasa: IV technikum")
        Informacja(text = "Kierunek: technik informatyk. Uczę się programowania, baz danych i sieci komputerowych.")
    }
}

@Composable
fun Informacja(text: String) {
    Text(text = text, fontSize = 18.sp)
}

@Preview(showBackground = true)
@Composable
fun PodgladKlasy() {
    MaterialTheme {
        EkranKlasy()
    }
}
