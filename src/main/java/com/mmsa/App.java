package com.mmsa;

import com.mmsa.controller.BoxscoreController;

public class App 
{
    public static void main( String[] args ){
        try {
            App app = new App();
            BoxscoreController bc = new BoxscoreController("nfl-ot2","caakc43q9qsg73fwubjf4m6r");
            String boxscore = bc.getBoxScores(bc.getBoxscoreURL());
            Object league = BoxscoreController.iterateBoxscore(boxscore, "league");
            Object games = BoxscoreController.iterateBoxscore(league, "games");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
