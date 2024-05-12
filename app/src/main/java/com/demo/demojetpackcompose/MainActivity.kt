package com.demo.demojetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.demo.demojetpackcompose.screens.QuoteDetails
import com.demo.demojetpackcompose.screens.QuoteListItem
import com.demo.demojetpackcompose.screens.QuoteListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        DataManger.loadQuoteFromFile(this)
        System.out.println("Data loaded :: "+ DataManger.data.size)

        setContent {
            App()

        }
    }

    @Composable
    fun App(){
        if(DataManger.isDataLoaded.value){
        if(DataManger.currentPage.value == Pages.LISTING){
                QuoteListScreen(data = DataManger.data) {
                    DataManger.switchPage(it)
                }
            }
            else{
                DataManger.currentQuote?.let { QuoteDetails(quote = it) }
            }
        }
       else{
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize(1f)
            ){
                Text(text = "Loading....",
                style = MaterialTheme.typography.h6)
            }
        }
    }


}
enum class Pages{
    LISTING,
    DETAIL
}

