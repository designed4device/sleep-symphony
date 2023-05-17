package dev.wellen.sleepsymphony.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.wellen.sleepsymphony.navigation.Route
import dev.wellen.sleepsymphony.navigation.navigate


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Symphonies(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "My Symphonies")
                },
                actions = {
                    IconButton(onClick = { navController.navigate(Route.Composer) }) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Compose new symphony"
                        )
                    }
                }
            )
        },
        modifier = Modifier.padding(all = 16.dp)
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            Text(
                text = "You haven't composed any symphonies yet, tap the \"+\" to start composing your first symphony.",
                textAlign = TextAlign.Center
            )
        }
    }
}