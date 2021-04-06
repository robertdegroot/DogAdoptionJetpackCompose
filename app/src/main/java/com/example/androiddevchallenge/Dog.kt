package com.example.androiddevchallenge

import androidx.annotation.DrawableRes

data class Dog(
    @DrawableRes val imageResource: Int,
    val name: String,
    val breed: String,
    val age: String,
    val colors: List<String>
)