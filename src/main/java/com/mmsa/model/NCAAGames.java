package com.mmsa.model;

import com.mmsa.controller.BoxscoreController;
import com.mmsa.controller.URLMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NCAAGames extends Object{

    public static Object getNCAAGames(){

        String ncaaBoxscore = BoxscoreController.getBoxScores(URLMapper.getGameURL("NCAAFB"));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Object reader = BoxscoreController.iterateBoxscore(ncaaBoxscore, "init");
            Object ncaaGames = BoxscoreController.iterateBoxscore(reader, "games");

        return ncaaGames;
    }
}
