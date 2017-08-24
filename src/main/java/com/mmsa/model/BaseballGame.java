package com.mmsa.model;

import java.util.Map;

public class BaseballGame implements Game {
    Team home;
    Team away;
    Team winner;
    Team loser;
    Map score;
    Map gameMap;
    String date;
    String status;
    String homeHits;
    String homeSore;
    String homeErrors;
    String awayHits;
    String awaySore;
    String awayErrors;
    String inning;
    String inningHalf;
    String gameID;

    public BaseballGame() {}

    public BaseballGame(Team home, Team away, String date){
        this.home=home;
        this.away=away;
        this.date=date;
    }

    public String getAwayHits() {
        return awayHits;
    }

    public void setAwayHits(String awayHits) {
        this.awayHits = awayHits;
    }

    public String getAwaySore() {
        return awaySore;
    }

    public void setAwaySore(String awaySore) {
        this.awaySore = awaySore;
    }

    public String getAwayErrors() {
        return awayErrors;
    }

    public void setAwayErrors(String awayErrors) {
        this.awayErrors = awayErrors;
    }

    public String getHomeHits() {
        return homeHits;
    }

    public void setHomeHits(String homeHits) {
        this.homeHits = homeHits;
    }

    public String getHomeSore() {
        return homeSore;
    }

    public void setHomeSore(String homeSore) {
        this.homeSore = homeSore;
    }

    public String getHomeErrors() {
        return homeErrors;
    }

    public void setHomeErrors(String homeErrors) {
        this.homeErrors = homeErrors;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Team getHome() {
        return home;
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public Team getAway() {
        return away;
    }

    public void setAway(Team away) {
        this.away = away;
    }

    public Team getWinner() {
        return winner;
    }

    public void setWinner(Team winner) {

    }

    public void setInning(String inning){
        this.inning = inning;
    }

    public void setInningHalf(String inningHalf){
        this.inningHalf = inningHalf;
    }

    public String getInning(){
        return inning;
    }

    public String getInningHalf(){
        return inningHalf;
    }

    public void setWinner(BaseballTeam winner) {
        this.winner = winner;
    }

    public Team getLoser() {
        return loser;
    }

    public void setLoser(Team loser) {
        this.loser = loser;
    }

    public Map getScore() {
        return score;
    }

    public void setScore(Map score) {
        this.score = score;
    }

    public Map getGameMap() {
        return gameMap;
    }

    public void setGameMap(Map gameMap) {
        this.gameMap = gameMap;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setGameID(String gameID){
        this.gameID = gameID;
    }
    public String getGameID(){
        return gameID;
    }

}
