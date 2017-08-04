package com.mmsa;

import java.util.List;
import java.util.Map;
import com.mmsa.controller.BoxscoreController;
import com.mmsa.model.Game;
import com.mmsa.model.Team;
import org.apache.camel.ProducerTemplate;
import com.mmsa.view.AsciiView;

import javax.swing.*;

public class App 
{
    public static void main( String[] args ){
        try {
            App app = new App();
            String boxscore = BoxscoreController.getBoxScores(BoxscoreController.getBoxscoreURL());
            Object league = BoxscoreController.iterateBoxscore(boxscore, "league");
            Object games = BoxscoreController.iterateBoxscore(league, "games");
//            List<Map> league = BoxscoreController.getLeague(o);
//            List<Game> games = BoxscoreController.getGames(o);
//            for(Game game: games){
//                game.setDate(league.get(0).get("date").toString());
//                game.setHome(BoxscoreController.getTeam(game.getGameMap(),"home"));
//                game.setAway(BoxscoreController.getTeam(game.getGameMap(),"away"));
//                game.setStatus(BoxscoreController.getStatus(game.getGameMap(),"status"));
//                BoxscoreController.getWinnerLoser(game);
//                AsciiView.printBoxScore(game);
//            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
