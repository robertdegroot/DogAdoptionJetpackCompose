package com.example.androiddevchallenge

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.data.DogData

@Composable
fun HomeScreen(navController: NavController?) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text("Dog adoption list") },
        )

        Surface(color = MaterialTheme.colors.background) {
            DogList(DogData().getAllDogs(), navController)
        }
    }
}

@Composable
fun DogList(dogs: List<Dog>, navController: NavController?) {
    LazyColumn {
        items(dogs) {
            DogCard(it, navController)
        }
    }
}
