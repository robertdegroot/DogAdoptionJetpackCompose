/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
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
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.ui.theme.MyTheme

object MainDestinations {

    const val MAIN_SCREEN = "mainscreen"
    const val DETAIL_SCREEN = "detailscreen"

}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize()) {
                TopAppBar(title = {
                    Text("Dog adoption list")
                })

                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    Surface(color = MaterialTheme.colors.background) {
        DogList(getDogs())
    }
}

@Composable
fun DogList(dogs: List<Dog>) {
    LazyColumn {
        items(dogs) {
            DogCard(it)
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        MyApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        MyApp()
    }
}

fun getDogs(): List<Dog> {
    val charlie = Dog(
        R.drawable.labrador,
        "Charlie",
        "Labrador",
        "2 months",
        listOf("Black")
    )

    val rex = Dog(
        R.drawable.german_shepherd,
        "Rex",
        "German Shepherd",
        "5 months",
        listOf("Brown", "Black")
    )

    val max = Dog(
        R.drawable.golden_retriever,
        "Max",
        "Golden Retriever",
        "2 months",
        listOf("Golden")
    )

    val jackie = Dog(
        R.drawable.jack_russel,
        "Jackie",
        "Jack Russel",
        "4 months",
        listOf("Brown", "White")
    )

    val cooper = Dog(
        R.drawable.beagle,
        "Cooper",
        "Beagle",
        "6 years",
        listOf("White", "Brown", "Black")
    )

    val herbert = Dog(
        R.drawable.pug,
        "Herbert",
        "Pug",
        "1 year",
        listOf("Brown", "Black")
    )

    val luna = Dog(
        R.drawable.australian_shepherd,
        "Luna",
        "Australian Shepherd",
        "4 years",
        listOf("White", "Brown", "Black")
    )

    return listOf(
        rex,
        max,
        luna,
        charlie,
        jackie,
        cooper,
        herbert
    )
}
