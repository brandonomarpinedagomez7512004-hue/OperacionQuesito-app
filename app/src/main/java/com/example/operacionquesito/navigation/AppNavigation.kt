package com.example.operacionquesito.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.example.operacionquesito.screens.HomeScreen
import com.example.operacionquesito.screens.HistoriaScreen
import com.example.operacionquesito.screens.PersonajesScreen
import com.example.operacionquesito.screens.RankingScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {

        composable("home") {
            HomeScreen(
                onPersonajesClick = {
                    navController.navigate("personajes")
                },
                onHistoriaClick = {
                    navController.navigate("historia")
                },
                onRankingClick = {
                    navController.navigate("ranking")
                }
            )
        }

        composable("personajes") {
            PersonajesScreen(
                onVolverClick = {
                    navController.popBackStack()
                }
            )
        }

        composable("historia") {
            HistoriaScreen(
                onVolverClick = {
                    navController.popBackStack()
                }
            )
        }

        composable("ranking") {
            RankingScreen(
                onVolverClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}
