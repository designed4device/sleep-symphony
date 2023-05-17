package dev.wellen.sleepsymphony.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavDeepLink
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

sealed class Route(val value: String) {
    object Symphonies: Route("my-symphonies")
    object Composer: Route("composer")
    object MovementEditor: Route("movement-editor")
}

@Composable
fun NavHost(
    navController: NavHostController,
    startDestination: Route,
    builder: NavGraphBuilder.() -> Unit
) {
    androidx.navigation.compose.NavHost(navController = navController, startDestination = startDestination.value, builder = builder)
}

fun NavGraphBuilder.composable(
    route: Route,
    arguments: List<NamedNavArgument> = emptyList(),
    deepLinks: List<NavDeepLink> = emptyList(),
    content: @Composable (NavBackStackEntry) -> Unit
) {
    composable(route.value, arguments, deepLinks, content)
}

fun NavController.navigate(route: Route) {
    navigate(route.value)
}