package com.example.superheroes.model

import com.example.superheroes.R

object SuperHeroeRepository {
    val heroes = listOf(
        SuperHeroe(
            nombre = R.string.hero1,
            descripcion = R.string.description1,
            imageResourceId = R.drawable.android_superhero1
        ),
        SuperHeroe(
            nombre = R.string.hero2,
            descripcion = R.string.description2,
            imageResourceId = R.drawable.android_superhero2
        ),
        SuperHeroe(
            nombre = R.string.hero3,
            descripcion = R.string.description3,
            imageResourceId = R.drawable.android_superhero3
        ),
        SuperHeroe(
            nombre = R.string.hero4,
            descripcion = R.string.description4,
            imageResourceId = R.drawable.android_superhero4
        ),
        SuperHeroe(
            nombre = R.string.hero5,
            descripcion = R.string.description5,
            imageResourceId = R.drawable.android_superhero5
        ),
        SuperHeroe(
            nombre = R.string.hero6,
            descripcion = R.string.description6,
            imageResourceId = R.drawable.android_superhero6
        )
    )
}