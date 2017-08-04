package com.mmsa.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LinkedTreeMap;

import org.json.JSONObject;
import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.mmsa.model.Game;
import com.mmsa.model.Team;

/**
 * Created by micha on 6/29/2017.
 */
public class BoxscoreController {

    static String host = "api.sportradar.us/";
    static String protocol = "https://";
    static String level_version = "mlb-t6";
    static String key = "3xbzsfssc3e275uy9r33pvm4";

    public static Object getBoxJsonObject(String json){
        try {
            JSONObject reader = new JSONObject(json);
            return reader;

//            Gson g = new Gson();
//            Object obj = g.fromJson(json, Object.class);
//            return obj;
        }catch (JsonSyntaxException jse) {
            throw new RuntimeException(jse);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public static URL getBoxscoreURL(){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String date = sdf.format(new Date());
            return new URL(protocol + host + level_version + "/games/" + date + "/boxscore.json?api_key=" + key);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public static String getBoxScores(URL url){

        try {
            URLConnection connection = url.openConnection();
            Object o = connection.getContent();
            BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)o));
            return reader.readLine();
        } catch (Exception ioe) {
            throw new RuntimeException(ioe);
        }
    }

    public static Object iterateBoxscore(Object boxscore, String key){
        if(boxscore instanceof JSONObject){
            Object reader = ((JSONObject)boxscore).get("key");
            return reader;
        }else if(boxscore instanceof LinkedTreeMap){
            Object reader = ((Map)boxscore).get("key");
            return reader;
        }else {
            JSONObject reader = new JSONObject(boxscore);
            return reader;
        }
    }

    public static List getLeague(Object obj){
        List leagueList = new ArrayList<Game>();
        try {
            LinkedTreeMap map = (LinkedTreeMap)obj;
            LinkedTreeMap leagueMap = (LinkedTreeMap)map.get("league");
            leagueList.add(leagueMap);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return leagueList;
    }

    public static List getGames(Object obj){
        List gameList = new ArrayList<Game>();
        try {
            LinkedTreeMap map = (LinkedTreeMap)obj;
            LinkedTreeMap gamesMap = (LinkedTreeMap)map.get("league");
            ArrayList<LinkedTreeMap> games = (ArrayList<LinkedTreeMap>)gamesMap.get("games");
            gameList = parseGameMap(games);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return gameList;
    }

    public static List parseGameMap(List gameMap){
        List newGameList = new ArrayList<Object>();
        for (Object o: gameMap){
            Game newGame = new Game();
            newGame.setGameMap((Map)((Map)o).get("game"));
            newGameList.add(newGame);
        }
        return newGameList;
    }

    public static Team getTeam(Map gameMap, String key){
        Team team = new Team();
        Map m = (Map)gameMap.get(key);
        team.setMarket(m.get("market").toString());
        team.setName(m.get("name").toString());
        team.setErrors(m.get("errors").toString());
        team.setWins(m.get("win").toString());
        team.setLosses(m.get("loss").toString());
        team.setHits(m.get("hits").toString());
        team.setRuns(m.get("runs").toString());
        team.setTeamMap(m);

        return team;
    }

    public static String getStatus(Map gameMap, String key){
        return gameMap.get(key).toString();
    }

    private static Team getWinner(Team a, Team b){
        if(Double.parseDouble(a.getRuns()) > Double.parseDouble(b.getRuns())){
            return a;
        }
        else {
            return b;
        }
    }

    private static Team getLoser(Team a, Team b){
        if(Double.parseDouble(a.getRuns()) < Double.parseDouble(b.getRuns())){
            return a;
        }
        else {
            return b;
        }
    }

    public static Game getWinnerLoser(Game game){
        Team winner = getWinner(game.getHome(), game.getAway());
        Team loser = getLoser(game.getHome(), game.getAway());
        game.setWinner(winner);
        game.setLoser(loser);
        return game;
    }
 /*   public static Team getDate(Map gameMap, String key){
        Team team = new Team();
        Map m = (Map)gameMap.get(key);

        team.setMarket(m.get("market").toString());
        team.setName(m.get("name").toString());
        team.setTeamMap(m);

        return team;
    }*/
}
