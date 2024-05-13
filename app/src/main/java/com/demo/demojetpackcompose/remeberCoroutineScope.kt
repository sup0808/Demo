package com.demo.demojetpackcompose

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun remeberCoroutineExample(){
    val counter = remember { mutableStateOf(  0 ) }

    var scope = rememberCoroutineScope()


    var text = "Counter is running ${counter.value}"
    if(counter.value == 10)
        text = "Counter stopped"
    Column() {
        Button(onClick={
            scope.launch {
                Log.d("LaunchedEffefectComposable","Started")
                try{

                    for (i in 1..10) {
                        counter.value++
                        delay(1000)

                    }

                } catch (e : Exception){
                    Log.d("LaunchedEffefectComposable","Error :: "+e.message.toString())
                }
            }
        }) {
            Text(text ="click timer")
        }
    }
    Text(
        text = counter.value.toString(),
        style = MaterialTheme.typography.h1
    )
}