package com.example.mojawizytowka

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.weight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    EkranZainteresowan()
                }
            }
        }
    }
}

@Composable
fun EkranZainteresowan() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Moje zainteresowania", fontSize = 28.sp)
        Text(
            text = "Lubię poznawać nowe technologie, tworzyć programy i rozwijać swoje umiejętności.",
            fontSize = 16.sp
        )
        Image(
            painter = painterResource(id = R.drawable.obrazek_technologia),
            contentDescription = "Ilustracja związana z technologią",
            modifier = Modifier
                .fillMaxWidth()
                .height(190.dp)
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .padding(8.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Umiejetnosc("Programowanie", Modifier.weight(1f))
            Umiejetnosc("Sieci komputerowe", Modifier.weight(1f))
        }
    }
}

@Composable
fun Umiejetnosc(nazwa: String, modifier: Modifier = Modifier) {
    Text(
        text = nazwa,
        modifier = modifier
            .background(MaterialTheme.colorScheme.primaryContainer)
            .padding(14.dp),
        fontSize = 15.sp
    )
}

@Preview(showBackground = true)
@Composable
fun PodgladZainteresowan() {
    MaterialTheme {
        EkranZainteresowan()
    }
}
