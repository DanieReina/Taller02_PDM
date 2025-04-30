package com.daniereina.DanielaManzanares_00051316.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.daniereina.DanielaManzanares_00051316.data.fakeRestaurants
import com.daniereina.DanielaManzanares_00051316.model.Restaurant
import com.daniereina.DanielaManzanares_00051316.components.RestaurantCard
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.daniereina.DanielaManzanares_00051316.components.DishCard


@Composable
fun RestaurantListScreen(navController: NavController) {
    val categoryMap = fakeRestaurants
        .flatMap { it.categories.map { cat -> cat to it } }
        .groupBy({ it.first }, { it.second })

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        categoryMap.forEach { (category, restaurants) ->
            item {
                Text(
                    text = category,
                    style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
            item {
                LazyRow {
                    items(restaurants.distinctBy { it.id }) { restaurant ->
                        RestaurantCard(restaurant = restaurant) {
                            navController.navigate("menu/${restaurant.id}")
                        }
                    }
                }
                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }
}

@Composable
fun RestaurantCard(restaurant: Restaurant, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .width(200.dp)
            .padding(end = 8.dp),
        onClick = onClick
    ) {
        Column {
            Image(
                painter = rememberAsyncImagePainter(restaurant.imageUrl),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
            )
            Text(
                text = restaurant.name,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}
