package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.graphs.RootNavigationGraph
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            RootNavigationGraph(navController = rememberNavController())
        }
    }

    val Array = ArrayList<Array<String>>()
    fun getListOfProducts(): ArrayList<Array<String>> {
        for (i in 1..2) {
            Array.add(arrayOf("Американо", "Описание", "120"))
            Array.add(arrayOf("Капучино", "Описание", "120"))
            Array.add(arrayOf("Айс Капучино", "Описание", "120"))
            Array.add(arrayOf("Латте", "Описание", "120"))
            Array.add(arrayOf("Айс Латте", "Описание", "125"))
            Array.add(arrayOf("Раф", "Описание", "121"))
            Array.add(arrayOf("Айс Раф", "Описание", "130"))
            Array.add(arrayOf("Флэт Уайт", "Описание", "141"))
            Array.add(arrayOf("Двойной эспрессо", "Описание", "120"))
            Array.add(arrayOf("Какао", "Описание", "120"))
            Array.add(arrayOf("Горячий шоколад", "Описание", "75"))

        }
        val countryListWithEmojis = ArrayList<Array<String>>()
        for (j in 0 until Array.size) {
            countryListWithEmojis.add(arrayOf(Array[j][0], Array[j][1], j.toString(), Array[j][2]))
        }
        return countryListWithEmojis
    }
}

