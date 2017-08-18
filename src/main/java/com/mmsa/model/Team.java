package com.mmsa.model;

import java.util.Map;

/**
 * Created by micha on 8/18/2017.
 */
public interface Team {

    String getName();

    Map getTeamMap();

    String getMarket() ;

    String getWins() ;

    String getLosses();

    String getStatus();

    void setLosses(String losses);

    void setMarket(String market);

    void setName(String name);

    void setStatus(String status);

    void setTeamMap(Map teamMap);

    void setWins(String wins);
}
