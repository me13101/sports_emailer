package com.mmsa.model;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by micha on 4/10/2017.
 */
public abstract class Boxscore {
    Game game;

    public Boxscore(){

    }
    public Boxscore(Game game){
        this.game = game;
    }
}
