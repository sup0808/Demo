package com.demo.demojetpackcompose.screens

import android.graphics.Paint.Style
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.demo.demojetpackcompose.models.Quote

//@Preview
@Composable
fun QuoteListItem(quote: Quote, onClick : (quote : Quote) -> Unit) {

    Card(
        elevation = 4.dp,
        modifier = Modifier.padding(8.dp)
            .clickable { onClick(quote) },
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Image(
                imageVector = Icons.Filled.Close,
                colorFilter = ColorFilter.tint(Color.White),
                alignment = Alignment.TopStart,
                contentDescription = "Quote Description",
                modifier = Modifier
                    .size(40.dp)
                    .rotate(180F)
                    .background(Color.Blue)

            )
            Spacer(modifier = Modifier.padding(8.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = quote.text,
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp)
                )

                Box(
                    modifier = Modifier
                        .background(Color(0xFFEEEEEE))
                        .fillMaxWidth(.4f)
                        .height(1.dp)
                )
                Text(
                    text = quote.author,
                    style = MaterialTheme.typography.body2,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp)
                )
            }

        }

    }
}

