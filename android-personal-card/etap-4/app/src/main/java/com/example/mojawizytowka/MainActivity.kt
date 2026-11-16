package com.example.mojawizytowka

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
                    Wizytowka()
                }
            }
        }
    }
}

@Composable
fun Wizytowka() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.awatar),
            contentDescription = "Awatar",
            modifier = Modifier
                .size(112.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(18.dp))
        DaneOsoby()
        Spacer(modifier = Modifier.height(30.dp))
        DaneKontaktowe()
    }
}

@Composable
fun DaneOsoby() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Alex", fontSize = 32.sp, color = MaterialTheme.colorScheme.primary)
        Text(text = "Uczeń – technik informatyk", fontSize = 18.sp)
        Text(
            text = "Interesuję się programowaniem i nowymi technologiami.",
            fontSize = 15.sp
        )
    }
}

@Composable
fun DaneKontaktowe() {
    Column(
        modifier = Modifier
            .background(
                color = MaterialTheme.colorScheme.primaryContainer,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(18.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(text = "Kontakt", fontSize = 20.sp)
        Text(text = "E-mail: alex@example.com")
        Text(text = "Telefon: 000 000 000")
    }
}

@Preview(showBackground = true)
@Composable
fun PodgladWizytowki() {
    MaterialTheme {
        Wizytowka()
    }
}
