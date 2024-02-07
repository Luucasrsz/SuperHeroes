package com.example.superheroes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent


import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview

import com.example.superheroes.model.SuperHeroeRepository.heroes
import com.example.superheroes.ui.theme.SuperheroesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperheroesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HeroeApp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeroeApp() {
    Scaffold(topBar = {
        HeroeTopAppBar()
    }) { it ->
        LazyColumn(
            contentPadding = it
        ) {
            items(heroes) {
                CartaHeroe(
                    heroe = it,
                    modifier = Modifier
                )
            }
        }
    }


}

@Preview(showBackground = true)
@Composable
fun HeroesPreview() {
    SuperheroesTheme(darkTheme = false) {
        HeroeApp()
    }
}

@Preview(showBackground = true)
@Composable
fun HeroesOscuroPreview() {
    SuperheroesTheme(darkTheme = true) {
        HeroeApp()
    }
}