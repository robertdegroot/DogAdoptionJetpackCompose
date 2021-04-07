package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.data.Dog

@Composable
fun DetailScreen(dog: Dog, navController: NavController?) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text("Details for ${dog.name}") },
            navigationIcon = {
                IconButton(onClick = { navController?.navigate(Screen.HOME.route) }) {
                    Icon(Icons.Filled.ArrowBack,"")
                }
            },
        )

        Surface(color = MaterialTheme.colors.background) {
            val image: Painter = painterResource(id = dog.imageResource)

            Column {
                Box {
                    Image(
                        painter = image,
                        contentDescription = dog.name,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxWidth()
                    )
                }

                Column(modifier = Modifier.padding(16.dp)) {
                    var colorString = ""
                    dog.colors.forEachIndexed { index, text ->
                        colorString += text

                        if (index < dog.colors.size - 1) {
                            colorString += ", "
                        }
                    }

                    Text(
                        dog.name,
                        style = MaterialTheme.typography.h3,
                        modifier = Modifier
                    )
                    Text("• ${dog.age} old")
                    Text("• Breed: ${dog.breed}")
                    Text("• Color(s): $colorString")
                    dog.description?.let {
                        Text(it,
                            modifier = Modifier
                                .padding(vertical = 8.dp)
                                .align(Alignment.Start)
                        )
                    }
                }
            }
        }
    }
}