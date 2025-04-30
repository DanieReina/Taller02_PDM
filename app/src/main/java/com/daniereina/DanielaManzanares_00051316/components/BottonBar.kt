package com.daniereina.DanielaManzanares_00051316.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.compose.ui.graphics.Color
import com.daniereina.DanielaManzanares_00051316.ui.theme.PurpleCustom
import androidx.compose.ui.text.font.FontWeight

@Composable
fun BottonBar(navController: NavController) {
    val items = listOf(
        BottomNavItem("Restaurantes", "restaurants", Icons.Filled.Home),
        BottomNavItem("Buscar", "search", Icons.Filled.Search),
        BottomNavItem("Órdenes", "orders", Icons.Filled.ShoppingCart)
    )

    NavigationBar (
        containerColor = PurpleCustom
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = item.label) },
                label = {
                    Text(
                        text = item.label,
                        color = Color.White,
                        style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Medium)
                    )
                },
                selected = currentRoute == item.route,
                onClick = {
                    if (currentRoute != item.route) {
                        navController.navigate(item.route) {
                            popUpTo("restaurants") { inclusive = false }
                            launchSingleTop = true
                        }
                    }
                }
            )
        }
    }
}

data class BottomNavItem(
    val label: String,
    val route: String,
    val icon: androidx.compose.ui.graphics.vector.ImageVector
)
