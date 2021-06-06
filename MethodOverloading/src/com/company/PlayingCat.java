package com.company;

public class PlayingCat {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer && temperature >= 25 && temperature <= 45)
            return true;
        else if(!summer && temperature >= 25 && temperature <= 35)
            return true;
        return false;
    }
}
