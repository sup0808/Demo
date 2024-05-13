package com.demo.demojetpackcompose

import android.util.Log
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import kotlinx.coroutines.delay

@Composable
fun LaunchedEffefectComposable(){
    val counter = remember {
        mutableStateOf(  0 )
    }

    LaunchedEffect(key1 = Unit ){
        Log.d("LaunchedEffefectComposable","Started")
        try{

                for (i in 1..10) {
                    delay(1000)
                   counter.value++
                }

        } catch (e : Exception){
            Log.d("LaunchedEffefectComposable","Error :: "+e.message.toString())
        }
    }

    var text = "Counter is running ${counter.value}"
    if(counter.value == 10)
        text = "Counter stopped"
    Text(
        text = text,
        style = MaterialTheme.typography.h1
    )
}