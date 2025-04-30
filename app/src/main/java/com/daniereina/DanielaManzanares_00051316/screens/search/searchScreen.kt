package com.daniereina.DanielaManzanares_00051316.screens.search

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Pantalla de búsqueda") })
        }
    ) { innerPadding ->
        Text(
            text = "Pantalla de búsqueda",
            modifier = Modifier.padding(innerPadding).padding(16.dp)
        )
    }
}
