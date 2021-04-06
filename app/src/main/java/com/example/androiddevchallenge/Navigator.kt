package com.example.androiddevchallenge

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.data.Dog
import com.google.gson.Gson

@Composable
fun Navigator() {
    val navController = rememberNavController()

    NavHost(
        navController = navController, startDestination = Screen.HOME.route,
        builder = {
            composable(Screen.HOME.route) { HomeScreen(navController = navController) }
            composable(
                "${Screen.DETAIL_SCREEN.route}/{dog}",
                arguments = listOf(
                    navArgument("dog") {
                        type = NavType.StringType
                    }
                )
            ) { backStackEntry ->
                backStackEntry.arguments?.getString("dog")?.let { json ->
                    val dog = Gson().fromJson(json, Dog::class.java)
                    DetailScreen(dog = dog, navController = navController)
                }
            }
        }
    )
}
