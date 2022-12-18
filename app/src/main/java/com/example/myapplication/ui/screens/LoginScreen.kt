package com.example.myapplication.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.ui.components.DefaultButton
import com.example.myapplication.ui.components.OutlinedButton
import com.example.myapplication.ui.components.OutlinedEditText

@Composable
fun LoginContent(onClick: () -> Unit) {
    Column(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()
        .padding(horizontal = 20.dp),
    horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = null,
        modifier = Modifier.size(30.dp))
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedEditText(onClick = { /*TODO*/ }, value = "")
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedEditText(onClick = { /*TODO*/ }, value = "")
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Забыли пароль")
        Spacer(modifier = Modifier.height(20.dp))
        Row{
            Image(painter = painterResource(id = R.drawable.google), contentDescription = null)
            Spacer(modifier = Modifier.width(5.dp))
            Text(text = "Войти через Google")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(horizontalArrangement = Arrangement.Center){
            Image(painter = painterResource(id = R.drawable.google), contentDescription = null)
            Spacer(modifier = Modifier.width(5.dp))
            Text(text = "Войти через Google")
        }
        OutlinedButton(onClick = { onClick() }, text = "Вход")
        Spacer(modifier = Modifier.height(10.dp))
        DefaultButton(onClick = { onClick() }, text = "Регистрация")

    }

}