package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes

data class Dog(
    val id: Int,
    @DrawableRes val imageResource: Int,
    val name: String,
    val breed: String,
    val age: String,
    val colors: List<String>,
    val description: String?
)