package com.example.mojawizytowka.cwiczenia

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TaskManager() {
    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text("Zadania wykonane: 2")
        Text("Zaplanuj naukę")
        Text("Zrób ćwiczenia Kotlin")
        Text("Uruchom aplikację")
    }
}
