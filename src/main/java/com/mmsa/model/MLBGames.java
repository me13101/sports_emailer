package com.mmsa.model;

import com.mmsa.controller.BoxscoreController;
import com.mmsa.controller.URLMapper;

public class MLBGames extends Object{

    public static Object getMLBGames(){
        String boxscore = BoxscoreController.getBoxScores(URLMapper.getGameURL("MLB"));
        Object reader = BoxscoreController.iterateBoxscore(boxscore, "init");
        Object league = BoxscoreController.iterateBoxscore(reader, "league");
        Object games = BoxscoreController.iterateBoxscore(league, "games");
        Object daysGame = BoxscoreController.iterateBoxscore(games, "game");
        return daysGame;
    }
}
