package com.mmsa.view;

import com.mmsa.controller.BoxscoreController;
import com.mmsa.model.Game;
import com.mmsa.model.Team;

public class AsciiView {

    public static void printBoxScore(Game game) {
        String homeScore, awayScore, homeHits, awayHits, homeErrors, awayErrors, date, status;

        String home = game.getAway().getMarket() + " " + game.getAway().getName();
        String away = game.getHome().getMarket() + " " + game.getHome().getName();
        int teamLength = 22;
        home = formatString(home, teamLength);
        away = formatString(away, teamLength);

        int runsLength = 4;
        homeScore = formatString(game.getHome().getRuns(),runsLength);
        homeHits = formatString(game.getHome().getHits(), runsLength);
        awayScore = formatString(game.getAway().getRuns(), runsLength);
        awayHits = formatString(game.getAway().getHits(), runsLength);

        int errorsLength = 6;
        homeErrors = formatString(game.getHome().getErrors(), errorsLength);
        awayErrors = formatString(game.getAway().getErrors(), errorsLength);

        int dateLength = 39;
        date = formatString(game.getDate(), dateLength);

        int statusLength = 12;
        status = formatString(game.getStatus(), statusLength);

        System.out.println(status+"|Team                  |Runs|Hits|Errors|" +
                "\n|    Away   |" + home +"|"+homeScore+"|"+homeHits+"|"+homeErrors+"|"+
                "\n|    Home   |" + away +"|"+awayScore+"|"+awayHits+"|"+awayErrors+"|"+
                "\n|    Date   |"+date+"|\n");


    }

    public static String formatString(String str, int length){
        while (str.length() < length) {
            str += " ";
        }
        return str;
    }

}
