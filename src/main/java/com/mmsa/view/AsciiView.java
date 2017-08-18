package com.mmsa.view;

import com.mmsa.model.BaseballGame;

public class AsciiView {

   /* public static void printBoxScore(BaseballGame baseballGame) {
        String homeScore, awayScore, homeHits, awayHits, homeErrors, awayErrors, date, status;

        String home = baseballGame.getAway().getMarket() + " " + baseballGame.getAway().getName();
        String away = baseballGame.getHome().getMarket() + " " + baseballGame.getHome().getName();
        int teamLength = 22;
        home = formatString(home, teamLength);
        away = formatString(away, teamLength);

        int runsLength = 4;
        homeScore = formatString(baseballGame.getHome().getRuns(),runsLength);
        homeHits = formatString(baseballGame.getHome().getHits(), runsLength);
        awayScore = formatString(baseballGame.getAway().getRuns(), runsLength);
        awayHits = formatString(baseballGame.getAway().getHits(), runsLength);

        int errorsLength = 6;
        homeErrors = formatString(baseballGame.getHome().getErrors(), errorsLength);
        awayErrors = formatString(baseballGame.getAway().getErrors(), errorsLength);

        int dateLength = 39;
        date = formatString(baseballGame.getDate(), dateLength);

        int statusLength = 12;
        status = formatString(baseballGame.getStatus(), statusLength);

        System.out.println(status+"|BaseballTeam                  |Runs|Hits|Errors|" +
                "\n|    Away   |" + home +"|"+homeScore+"|"+homeHits+"|"+homeErrors+"|"+
                "\n|    Home   |" + away +"|"+awayScore+"|"+awayHits+"|"+awayErrors+"|"+
                "\n|    Date   |"+date+"|\n");


    }*/

    public static String formatString(String str, int length){
        while (str.length() < length) {
            str += " ";
        }
        return str;
    }

}
