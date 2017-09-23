package com.mmsa.controller;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class URLMapper {
    static final String host = "api.sportradar.us/";
    static final String protocol = "https://";
    static final String mlbKey = "mp5jdk2gpvws2nu9337tvc3p";
    static final String mlbLevelVersion = "mlb-t6";
    static final String nflKey = "caakc43q9qsg73fwubjf4m6r";
    static final String nflLevelVersion = "nfl-ot2";
    static final String ncaaFBKey = "rj4c434zjxw6hgmcdn4jfcxe";
    static final String ncaaFBVersion = "ncaafb-t1";

    public static String getMLBFORMAT(String date){
        return protocol + host + mlbLevelVersion + "/games/" + date + "/boxscore.json?api_key=" + mlbKey;
    }

    public static String getMLBPBPFORMAT(String gameID){
        return protocol + host + mlbLevelVersion + "/games/" + gameID + "/pbp.json?api_key=" + mlbKey;
    }

    public static String getNFLFORMAT(String date){
        return protocol + host + nflLevelVersion + "/games/" + date + "/boxscore.json?api_key=" + nflKey;
    }

    public static String getNCAAFBFORMAT(String date){
        return protocol + host +ncaaFBVersion+"/2017/REG/4/schedule.json?api_key="+ncaaFBKey;
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
        else if (format == "NCAAFB") {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                String date = sdf.format(new Date());
                return new URL(getNCAAFBFORMAT(date));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    public static URL getPBPURL(String gameID){
        try {
            return new URL(getMLBPBPFORMAT(gameID));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
