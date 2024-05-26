package com.demo.demojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()

        }
    }

    @Composable
    fun App() {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "registartion") {
            composable(route = "registartion") {
                registarationScreen(navController)
            }
            composable(route = "login") {
                loginScreen()
            }
            composable(route = "main") {
                mainScreen()
            }
            // Add more destinations similarly.
        }
    }


    @Composable
    fun registarationScreen(navController: NavHostController) {
        Text(text = "Registration", style = MaterialTheme.typography.h1,
            modifier = Modifier.clickable {
                navController.navigate("main")
            })
    }

    @Composable
    fun loginScreen() {
        Text(text = "Login", style = MaterialTheme.typography.h1)
    }

    @Composable
    fun mainScreen() {
        Text(text = "Main", style = MaterialTheme.typography.h1)
    }

}





