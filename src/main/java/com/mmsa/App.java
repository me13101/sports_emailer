package com.mmsa;

import com.mmsa.model.MLBGames;
import com.mmsa.model.NCAAGames;
import com.mmsa.model.NFLGames;

import java.util.HashMap;
import java.util.Map;

public class App 
{
    public static void main( String[] args ){
        try {
            App app = new App();
            Map sportMap = new HashMap<String, Object>();
            sportMap.put("mlbGames", MLBGames.getMLBGames());
            sportMap.put("ncaaGames", NCAAGames.getNCAAGames());
            sportMap.put("nflGames", NFLGames.getNFLGames());
            System.out.println(sportMap);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
