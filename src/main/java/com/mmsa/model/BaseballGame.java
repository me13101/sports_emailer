package com.mmsa.model;

import java.util.Date;
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

    public BaseballGame() {
    }
    public BaseballGame(Team home, Team away, String date){
        this.home=home;
        this.away=away;
        this.date=date;
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
}
