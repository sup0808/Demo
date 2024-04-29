package com.demo.demojetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var count : MutableState<Int>  = remember {mutableStateOf(0)}
        Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
            Tetsing(count)
        }

        }
    }

    @Composable
    fun Tetsing(count: MutableState<Int>) {
        var count : MutableState<Int>  = remember {mutableStateOf(0)}
        Column(verticalArrangement = Arrangement.Center) {

                Log.d("Tagged", " Log duriong intial compistion") }
            Text(text ="Notification Counter --- "+count.value)
            Button(onClick = {
                count.value++;
            }) {
                Text(text ="Send Notification")
                Log.d("Tagged", " Button click "+count.value)
            }
        }


    }

    @Composable
    fun listViewItem(){
        var count : MutableState<Int>  = remember {mutableStateOf(0)}

        Row {
            Column(verticalArrangement = Arrangement.Center) {

                Log.d("Tagged", " Log duriong intial compistion") }
            Text(text ="Notification Counter --- "+count.value.toString())
            Button(onClick = {
                count.value++;
            }) {
                Text(text ="Send Notification"+count.toString())
                Log.d("Tagged", " Button click "+count.toString())
            }
        }
        }



    @Preview(showBackground = true, widthDp = 300, heightDp = 300)
    @Composable
    fun previewFunction() {
        Column(


            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("supriya")
            Text("mdmcm")

        }




}

