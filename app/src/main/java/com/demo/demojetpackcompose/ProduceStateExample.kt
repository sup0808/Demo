package com.demo.demojetpackcompose

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import kotlinx.coroutines.delay

@Composable
fun ProduceStateExample() {
    val state = produceState(initialValue = 0 ){
        for (i in 1..10) {
            delay(1000)
            value++
        }
    }

    Text(
        text = state.value.toString(),
        style = MaterialTheme.typography.h1
    )
}