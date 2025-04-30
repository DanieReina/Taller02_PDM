package com.daniereina.DanielaManzanares_00051316

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.daniereina.DanielaManzanares_00051316.components.BottonBar
import com.daniereina.DanielaManzanares_00051316.navigation.NavGraph
import com.daniereina.DanielaManzanares_00051316.ui.theme.FoodSpotByDanaresTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpotByDanaresTheme {
                FoodSpotApp()
            }
        }
    }
}

@Composable
fun FoodSpotApp() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottonBar(navController)
        }
    ) { innerPadding ->
        NavGraph(navController = navController, modifier = Modifier.padding(innerPadding))
    }
}
