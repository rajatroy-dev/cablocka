package `in`.rajatroy.cablocka.common

import `in`.rajatroy.cablocka.ui.screens.edit.EditScreen
import `in`.rajatroy.cablocka.ui.screens.home.HomeScreen
import `in`.rajatroy.cablocka.ui.screens.shared.NavigationItem
import `in`.rajatroy.cablocka.ui.screens.temp.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = NavigationItem.Home.route) {
        composable(NavigationItem.Home.route) {
            HomeScreen()
        }
        composable(NavigationItem.Music.route) {
            MusicScreen()
        }
        composable(NavigationItem.Movies.route) {
            MoviesScreen()
        }
        composable(NavigationItem.Books.route) {
            BooksScreen()
        }
        composable(NavigationItem.Profile.route) {
            ProfileScreen()
        }
        composable(NavigationItem.Edit.route) { backStackEntry ->
            val id = backStackEntry.arguments?.getString("id")
            requireNotNull(id) { "Id parameter wasn't found. Please make sure it's set!" }
            EditScreen(id)
        }
    }
}