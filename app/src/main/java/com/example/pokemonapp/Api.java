package com.example.pokemonapp;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://pokeapi.co/api/v2/";
    @GET("pokemon?limit=10")
    Call<PokemonPojo> getPokemons();
}
