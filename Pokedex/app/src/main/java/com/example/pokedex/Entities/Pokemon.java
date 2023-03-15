package com.example.pokedex.Entities;

public class Pokemon {

    private String name;
    private boolean capturat;
    private String data_avistament;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCapturat() {
        return capturat;
    }

    public void setCapturat(boolean capturat) {
        this.capturat = capturat;
    }

    public String getData_avistament() {
        return data_avistament;
    }

    public void setData_avistament(String data_avistament) {
        this.data_avistament = data_avistament;
    }
}
