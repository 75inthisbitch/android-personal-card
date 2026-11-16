package com.example.mojawizytowka.cwiczenia

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ComposeArticle() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Jetpack Compose", style = MaterialTheme.typography.headlineMedium)
        Text("Compose pozwala budować interfejs Androida za pomocą funkcji Kotlin.")
    }
}
