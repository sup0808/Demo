package com.demo.demojetpackcompose

import android.content.Context
import android.graphics.pdf.PdfDocument.Page
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.demo.demojetpackcompose.models.Quote
import com.google.gson.Gson

object DataManger{

    var currentPage = mutableStateOf(Pages.LISTING)

    var data = emptyArray<Quote>()
    var isDataLoaded = mutableStateOf(false)

    var currentQuote : Quote? = null

    fun loadQuoteFromFile(context : Context) {
        val inputStream = context.assets.open("quotes.json")
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer,Charsets.UTF_8)
        val gson = Gson()
        data= gson.fromJson(json, Array<Quote>::class.java)
        isDataLoaded.value = true
    }

    fun switchPage(quote: Quote?){
        if(currentPage.value == Pages.LISTING){
            currentPage.value = Pages.DETAIL
            currentQuote = quote
        } else{
            currentPage.value = Pages.LISTING
        }
    }
}

