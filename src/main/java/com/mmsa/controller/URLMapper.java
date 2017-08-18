package com.mmsa.controller;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class URLMapper {
    static final String host = "api.sportradar.us/";
    static final String protocol = "https://";
    static final String mlbKey = "3xbzsfssc3e275uy9r33pvm4";
    static final String mlbLevelVersion = "mlb-t6";
    static final String nflKey = "caakc43q9qsg73fwubjf4m6r";
    static final String nflLevelVersion = "nfl-ot2";

    public static String getMLBFORMAT(String date){
        return protocol + host + mlbLevelVersion + "/games/" + date + "/boxscore.json?api_key=" + mlbKey;
    }

    public static String getNFLFORMAT(String date){
        return protocol + host + nflLevelVersion + "/games/" + date + "/boxscore.json?api_key=" + nflKey;
    }

    public static URL getGameURL(String format){
        if (format == "MLB") {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                String date = sdf.format(new Date());
                return new URL(getMLBFORMAT(date));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        else if (format == "NFL") {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                String date = sdf.format(new Date());
                return new URL(getNFLFORMAT(date));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}
