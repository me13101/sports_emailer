package com.mmsa.model;

import java.util.Map;

/**
 * Created by micha on 6/7/2017.
 */
public class BaseballTeam implements Team{
    private Map teamMap;
    private String name;
    private String market;
    private String runs;
    private String hits;
    private String errors;
    private String wins;
    private String losses;
    private String status;

    public BaseballTeam() {}

    public BaseballTeam(Map teamMap, String name, String market) {
        this.market = market;
        this.name = name;
        this.teamMap = teamMap;
    }

    public String getRuns() {
        return runs;
    }

    public void setRuns(String runs) {
        this.runs = runs;
    }

    public String getHits() {
        return hits;
    }

    public void setHits(String hits) {
        this.hits = hits;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }

    public String getWins() {
        return wins;
    }

    public void setWins(String wins) {
        this.wins = wins;
    }

    public String getLosses() {
        return losses;
    }

    public String getStatus() {
        return status;
    }

    public void setLosses(String losses) {
        this.losses = losses;
    }

    public Map getTeamMap() {
        return teamMap;
    }

    public void setTeamMap(Map teamMap) {
        this.teamMap = teamMap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }


}
