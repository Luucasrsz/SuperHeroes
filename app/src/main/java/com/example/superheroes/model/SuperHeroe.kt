package com.example.superheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class SuperHeroe(
    @StringRes val nombre: Int,
    @StringRes val descripcion: Int,
    @DrawableRes val imageResourceId: Int
)
