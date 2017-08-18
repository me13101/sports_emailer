package com.mmsa.model;

import java.util.Map;

public class BaseballGame implements Game {
    BaseballTeam home;
    BaseballTeam away;
    BaseballTeam winner;
    BaseballTeam loser;
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

    public BaseballGame() {}

    public BaseballGame(BaseballTeam home, BaseballTeam away, String date){
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

    public BaseballTeam getHome() {
        return home;
    }

    public void setHome(BaseballTeam home) {
        this.home = home;
    }

    public BaseballTeam getAway() {
        return away;
    }

    public void setAway(BaseballTeam away) {
        this.away = away;
    }

    public BaseballTeam getWinner() {
        return winner;
    }

    public void setWinner(BaseballTeam winner) {
        this.winner = winner;
    }

    public BaseballTeam getLoser() {
        return loser;
    }

    public void setLoser(BaseballTeam loser) {
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
}
