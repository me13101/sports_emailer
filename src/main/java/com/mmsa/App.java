package com.mmsa;

import com.mmsa.controller.BoxscoreController;
import com.mmsa.controller.URLMapper;

public class App 
{
    public static void main( String[] args ){
        try {
            App app = new App();
//            BoxscoreController bc = new BoxscoreController("nfl-ot2","caakc43q9qsg73fwubjf4m6r");
            String boxscore = BoxscoreController.getBoxScores(URLMapper.getGameURL("MLB"));
            Object reader = BoxscoreController.iterateBoxscore(boxscore, "init");
            Object league = BoxscoreController.iterateBoxscore(reader, "league");
            Object games = BoxscoreController.iterateBoxscore(league, "games");
            Object daysGame = BoxscoreController.iterateBoxscore(games, "game");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
