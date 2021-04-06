package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R

class DogData {
    fun getAllDogs(): List<Dog> {
        val charlie = Dog(
            1,
            R.drawable.labrador,
            "Charlie",
            "Labrador",
            "2 months",
            listOf("Black"),
            null
        )

        val rex = Dog(
            2,
            R.drawable.german_shepherd,
            "Rex",
            "German Shepherd",
            "5 months",
            listOf("Brown", "Black"),
            "A strongly built, relatively long-bodied dog, the German shepherd stands 22 to 26 inches (56 to 66 cm) and weighs 75 to 95 pounds (34 to 43 kg). Its coat is of coarse, medium-long outer hair and shorter, dense inner hair and ranges from white or pale gray to black and is often gray and black or black and tan."
        )

        val max = Dog(
            3,
            R.drawable.golden_retriever,
            "Max",
            "Golden Retriever",
            "2 months",
            listOf("Golden"),
            null
        )

        val jackie = Dog(
            4,
            R.drawable.jack_russel,
            "Jackie",
            "Jack Russel",
            "4 months",
            listOf("Brown", "White"),
            null
        )

        val cooper = Dog(
            5,
            R.drawable.beagle,
            "Cooper",
            "Beagle",
            "6 years",
            listOf("White", "Brown", "Black"),
            null
        )

        val herbert = Dog(
            6,
            R.drawable.pug,
            "Herbert",
            "Pug",
            "1 year",
            listOf("Brown", "Black"),
            null
        )

        val luna = Dog(
            7,
            R.drawable.australian_shepherd,
            "Luna",
            "Australian Shepherd",
            "4 years",
            listOf("White", "Brown", "Black"),
            null
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
}