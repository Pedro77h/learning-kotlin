package com.example.pokedex.api.model

import com.example.pokedex.domain.PokemonType

// https://pokeapi.co/api/v2/pokemon/?limit=151

data class PokemonsApiResult(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<PokemonResult>
)


data class PokemonResult(
    val name: String,
    val url: String
)

data class PokemonApiResult(
    val id: Int,
    val name: String,
    val types: PokemonTypesSlot
)

data class PokemonTypesSlot(
    val slot: Int,
    val type: PokemonType,
)