package com.demo.demojetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.*

import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.demo.demojetpackcompose.ui.theme.DemoJetpackComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Counter()
        }
    }



    //Side Effect Demo
    @Composable
    fun Counter() {
        // Define a state variable for the count
        val count = remember { mutableStateOf(0) }

        // Use SideEffect to log the current value of count
        SideEffect {
            // Called on every recomposition
            Log.d("Count is ::: ${count.value}","" )
        }

        Column {
            Button(onClick = { count.value++ }) {
                Text("Increase Count")
            }

            // With every state update, text is changed and recomposition is triggered
            Text("Counter ${count.value}")
        }
    }

    fun fetchCategories() : List<String> {
        return listOf("One", "Two", "Third")
    }



    @Composable
    fun App(){
        //LocalContext.current.applicationContext
        var theme = remember {
            mutableStateOf(false)
        }

        DemoJetpackComposeTheme(theme.value) {
            Column(
                Modifier.background(MaterialTheme.colors.background)
            ) {
                Text(text = "Supriya Gupta Wed Arvind Gupta",
                    style = MaterialTheme.typography.h1)
                
                Button(onClick =
                {
                    theme.value = !theme.value
                } ) {
                    Text(text ="Change Theme")
                }
            }
          
        }

    }


}

