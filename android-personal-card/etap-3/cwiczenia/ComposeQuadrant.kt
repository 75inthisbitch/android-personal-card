package com.example.mojawizytowka.cwiczenia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.weight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ComposeQuadrant() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            Quadrant("Tekst", "Wyświetla informacje", Modifier.weight(1f), Color(0xFFEADDFF))
            Quadrant("Obraz", "Pokazuje grafikę", Modifier.weight(1f), Color(0xFFD0BCFF))
        }
        Row(modifier = Modifier.weight(1f)) {
            Quadrant("Wiersz", "Układa elementy obok siebie", Modifier.weight(1f), Color(0xFFB4D0F0))
            Quadrant("Kolumna", "Układa elementy pionowo", Modifier.weight(1f), Color(0xFFC8E6C9))
        }
    }
}

@Composable
private fun Quadrant(title: String, description: String, modifier: Modifier, color: Color) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(title)
        Text(description)
    }
}
