package com.mmsa;

import com.mmsa.controller.BoxscoreController;
import com.mmsa.controller.URLMapper;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args ){
        try {
            App app = new App();
            String boxscore = BoxscoreController.getBoxScores(URLMapper.getGameURL("MLB"));
            Object reader = BoxscoreController.iterateBoxscore(boxscore, "init");
            Object league = BoxscoreController.iterateBoxscore(reader, "league");
            Object games = BoxscoreController.iterateBoxscore(league, "games");
            Object daysGame = BoxscoreController.iterateBoxscore(games, "game");
            Object gameID = BoxscoreController.iterateBoxscore(daysGame, "id");
            String gamepbp = BoxscoreController.getBoxScores(URLMapper.getPBPURL(gameID.toString()));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
