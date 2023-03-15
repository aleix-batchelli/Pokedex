package com.example.pokedex.Activities;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.pokedex.Entities.Pokemon;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonHolder> {

    private List<Pokemon> lPokemons;
    private Activity activity;
    public PokemonAdapter(List<Pokemon> lPokemons, Activity activity) {
        this.lPokemons = lPokemons;
        this.activity = activity;
    }

    @Override
    public PokemonHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(activity);
        return new PokemonHolder(layoutInflater, parent, activity);
    }

    @Override
    public void onBindViewHolder(PokemonHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return lPokemons.size();
    }
}
