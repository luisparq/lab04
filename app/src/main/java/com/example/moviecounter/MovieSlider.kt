package com.example.moviecounter

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt

@Composable
fun MovieSlider(modifier: Modifier = Modifier) {
    var rating by remember { mutableFloatStateOf(5f) }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(text = "Calificación: ${rating.roundToInt()}/10")

        Slider(
            value = rating,
            onValueChange = { rating = it },
            valueRange = 0f..10f,
            steps = 9
        )
    }
}