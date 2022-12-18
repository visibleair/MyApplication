package com.example.myapplication.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.ContentAlpha.medium
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardItem(
    countryText: Array<String>,
    onItemClick: (Array<String>) -> Unit
) {
    Box(

    ){
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .width(160.dp)
                .clickable { onItemClick(countryText) },
            elevation = 4.dp,
            shape = RoundedCornerShape(20.dp)
        ) {
            Column(
                Modifier
                    .padding(bottom = 20.dp)
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = com.example.myapplication.R.drawable.logo), contentDescription = "",
                    modifier = Modifier
                        .padding(10.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .fillMaxWidth()
                        .background(Color.Blue)
                        .aspectRatio(1f)
                        .padding(20.dp),
                    contentScale = ContentScale.Fit
                )
                Column(
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp)
                        .height(50.dp)
                ) {
                    Text(text = countryText[0],
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 14.sp
                    )
                    Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween) {
                        Row(modifier = Modifier.fillMaxHeight(),
                            verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "${countryText[3]} ₽",
                                textAlign = TextAlign.Center,
                            )
                        }

                        ServingCalculator()
                    }
                }
            }
        }
    }

}


@Composable
fun ServingCalculator() {
    var value by remember { mutableStateOf(0) }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
    ) {

        if(value>0){
            CircularButton(iconResource = com.example.myapplication.R.drawable.logo, elevation = null, color = Color.Blue) { value-- }
            Text(text = "$value")
        }
        CircularButton(iconResource = com.example.myapplication.R.drawable.logo, elevation = null, color = Color.Blue) { value++ }
    }
}


