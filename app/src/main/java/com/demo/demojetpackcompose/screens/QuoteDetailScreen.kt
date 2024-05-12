package com.demo.demojetpackcompose.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.demo.demojetpackcompose.DataManger
import com.demo.demojetpackcompose.models.Quote


@Composable
fun QuoteDetails(quote: Quote) {
    
    BackHandler() {
        DataManger.switchPage(null)
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFEEEEEE),
                        Color(0xFFE3E3E3)
                    )
                )
            )
    ) {
        Card(
            elevation = 8.dp,
            modifier = Modifier.padding(32.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(30.dp, 24.dp)
            ) {

                Image(imageVector = Icons.Filled.Favorite, contentDescription = "Quote Details")
                Text(
                    text = quote.text,
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp)
                )
                Text(
                    text = quote.author,
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp)
                )

            }
        }

    }

}
