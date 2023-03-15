package com.example.pokedex.Entities;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class Pokedex {

    private static Pokedex sPokedex;
    private List<Pokemon> lPokemon;
    public static Pokedex getInstance(Context context) {
        if (sPokedex == null) {
            sPokedex = new Pokedex(context);
        }
        return sPokedex;
    }
    private Pokedex(Context context) {
        lPokemon = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Pokemon pokemon = new Pokemon();
            pokemon.setName("Pokemon #" + i);
            pokemon.setCapturat(i % 2 == 0);
            lPokemon.add(pokemon);
        }
    }
    public List<Pokemon> getPokemons() {
        return lPokemon;
    }
}
