package com.example.pokedex.Activities;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.pokedex.Entities.Pokemon;
import com.example.pokedex.R;

public class PokemonHolder extends RecyclerView.ViewHolder {

    private Pokemon pokemon;
    private TextView tvNom;
    private TextView tvAvistament;
    private ImageView ivCapturat;
    private Activity activity;


    public PokemonHolder(LayoutInflater inflater, ViewGroup parent, Activity
            activity) {
        super(inflater.inflate(R.layout.list_item_pokemon, parent, false));
        tvNom = (TextView) itemView.findViewById(R.id.nom_pokemon);
        tvAvistament = (TextView)itemView.findViewById(R.id.avistament_pokemon);
        ivCapturat = (ImageView)itemView.findViewById(R.id.ivCapturat);
        this.activity = activity;
}
