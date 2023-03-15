package com.example.pokedex.Activities;

import androidx.fragment.app.Fragment;

import com.example.pokedex.Fragments.SingleFragmentActivity;

public class DetailActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new DetailFragment();
    }
}
