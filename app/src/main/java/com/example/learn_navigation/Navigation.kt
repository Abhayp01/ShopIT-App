package com.example.learn_navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import java.nio.file.WatchEvent.Modifier

@ExperimentalFoundationApi
@Composable
fun Navigation(){
    val navController= rememberNavController()
    NavHost(navController = navController,
    startDestination = Screen.Home.rout
    ){
         composable(
             route=Screen.Home.rout
         ){
             HomeScreen(navController = navController)
         }
        composable(
            route=Screen.LaptopScreen.rout
        ){
            LaptopScreen(navController = navController)
        }
        composable(
            route=Screen.DesktopScreen.rout
        ){
            DesktopScreen(navController = navController)
        }
        composable(
            route=Screen.SoftwareScreen.rout
        ){
            SoftwareScreen(navController = navController)
        }
        composable(
            route=Screen.About.rout
        ){
            About(navController = navController)
        }
    }
}