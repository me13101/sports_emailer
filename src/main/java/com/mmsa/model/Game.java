package com.mmsa.model;

import java.util.Map;

public interface Game {
    public String getStatus();

    public void setStatus(String status);

    public BaseballTeam getHome();

    public void setHome(BaseballTeam home);

    public BaseballTeam getAway();

    public void setAway(BaseballTeam away);

    public BaseballTeam getWinner();

    public void setWinner(BaseballTeam winner);

    public BaseballTeam getLoser();

    public void setLoser(BaseballTeam loser);

    public Map getScore();

    public void setScore(Map score);

    public Map getGameMap();

    public void setGameMap(Map gameMap);

    public String getDate();

    public void setDate(String date);
}
