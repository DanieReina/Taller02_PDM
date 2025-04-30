package com.daniereina.DanielaManzanares_00051316.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.daniereina.DanielaManzanares_00051316.screens.home.RestaurantListScreen
import com.daniereina.DanielaManzanares_00051316.screens.menu.MenuScreen
import com.daniereina.DanielaManzanares_00051316.screens.orders.OrdersScreen
import com.daniereina.DanielaManzanares_00051316.screens.search.SearchScreen

@Composable
fun NavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = "restaurants",
        modifier = modifier
    ) {
        composable("restaurants") {
            RestaurantListScreen(navController)
        }
        composable("search") {
            SearchScreen()
        }
        composable("orders") {
            OrdersScreen()
        }
        composable("menu/{restaurantId}") { backStackEntry ->
            val id = backStackEntry.arguments?.getString("restaurantId")?.toIntOrNull()
            id?.let {
                MenuScreen(restaurantId = it, navController = navController)
            }
        }
    }
}
