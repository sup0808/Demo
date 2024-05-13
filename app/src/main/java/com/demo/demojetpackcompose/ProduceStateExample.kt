package com.demo.demojetpackcompose

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import kotlinx.coroutines.delay

@Composable
fun ProduceStateExample() {
    val state = remember { mutableStateOf(0) }
    LaunchedEffect(key1 = Unit) {
        for (i in 1..10) {
            delay(1000)
            state.value++
        }
    }

    Text(
        text = state.value.toString(),
        style = MaterialTheme.typography.h1
    )
}