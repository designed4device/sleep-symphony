package dev.wellen.sleepsymphony.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import dev.wellen.sleepsymphony.ui.screen.*

@Composable
fun MainNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Route.Symphonies
    ) {
        composable(Route.Symphonies) {
            Symphonies(navController = navController)
        }
        composable(Route.Composer) {
            Composer(navController = navController)
        }
        composable(Route.MovementEditor) {
            MovementEditor(navController = navController)
        }
    }
}