package com.mmsa.model;

/**
 * Created by micha on 4/10/2017.
 */
public abstract class Boxscore {
    BaseballGame baseballGame;

    public Boxscore(){

    }
    public Boxscore(BaseballGame baseballGame){
        this.baseballGame = baseballGame;
    }
}
