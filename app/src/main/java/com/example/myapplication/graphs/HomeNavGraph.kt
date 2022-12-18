package com.example.myapplication.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.ui.screens.FirstScreen
import com.example.myapplication.ui.screens.SecondScreen
import com.example.myapplication.ui.screens.ThirdScreen

@Composable
fun HomeNavGraph(navController: NavHostController){
    NavHost(navController = navController, route = Graph.HOME, startDestination = HomeNavGraph.SecondPage.route){
        composable(route = HomeNavGraph.FirstPage.route){
            FirstScreen()
        }
        composable(route = HomeNavGraph.SecondPage.route){
            SecondScreen()
        }
        composable(route = HomeNavGraph.ThirdPage.route){
            ThirdScreen(onClick = {})
        }
    }
}

sealed class HomeNavGraph(val route: String){
    object FirstPage: HomeNavGraph(route = "FIRST")
    object SecondPage: HomeNavGraph(route = "SECOND")
    object ThirdPage: HomeNavGraph(route = "THIRD")
}