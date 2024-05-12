package com.demo.demojetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.demo.demojetpackcompose.ui.theme.DemoJetpackComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
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

