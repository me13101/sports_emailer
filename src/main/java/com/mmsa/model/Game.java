package com.mmsa.model;

import java.util.Map;

public interface Game {
    public String getStatus();

    public void setStatus(String status);

    public Team getHome();

    public void setHome(Team home);

    public Team getAway();

    public void setAway(Team away);

    public Team getWinner();

    public void setWinner(Team winner);

    public Team getLoser();

    public void setLoser(Team loser);

    public Map getScore();

    public void setScore(Map score);

    public Map getGameMap();

    public void setGameMap(Map gameMap);

    public String getDate();

    public void setDate(String date);
}
