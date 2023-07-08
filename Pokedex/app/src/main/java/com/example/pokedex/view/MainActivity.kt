package com.example.pokedex.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.domain.Pokemon
import com.example.pokedex.domain.PokemonType

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val charmander = Pokemon(
            "https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png",
            4,
            "Charmander",
            listOf(
                PokemonType("Fire")
            )
        )

        val pokemons = listOf<Pokemon>(
            charmander, charmander, charmander, charmander
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rvPokemons);

        recyclerView.layoutManager = LinearLayoutManager(this);
        recyclerView.adapter = PokemonAdapter(pokemons);

    }
}
