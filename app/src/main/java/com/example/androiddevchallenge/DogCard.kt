package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

@Composable
fun DogCard(dog: Dog) {
    Surface(
        shape = RoundedCornerShape(8.dp),
        elevation = 8.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth().clickable { onCardClicked(dog) }) {
            val image: Painter = painterResource(id = dog.imageResource)
            Image(
                painter = image,
                contentDescription = dog.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(144.dp)
            )

            Column(modifier = Modifier.padding(16.dp)) {
                var colorString = ""
                dog.colors.forEachIndexed { index, text ->
                    colorString += text

                    if (index < dog.colors.size - 1) {
                        colorString += ", "
                    }
                }


                Text(dog.name, style = MaterialTheme.typography.h4)
                Text("• ${dog.age}")
                Text("• ${dog.breed}")
                Text("• $colorString")
            }

        }
    }
}

fun onCardClicked(dog: Dog) {
    //TODO navigate to a detail screen
}

@Composable
@Preview
fun DefaultDogCard() {
    val defaultDog = Dog(
        R.drawable.labrador,
        "Charlie",
        "Labrador",
        "6 months",
        listOf("Black")
    )

    DogCard(defaultDog)
}
