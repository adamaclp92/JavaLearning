package com.company;

public class SecondsAndMinutes {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(int minutes, int seconds){
        if(minutes >= 0 && (seconds >= 0 && seconds <= 59)){
            int hours = minutes / 60;
            int remainMinutes = minutes % 60;
            String stringHours = String.valueOf(hours);
            String stringRemainMinutes = String.valueOf(remainMinutes);
            String stringSeconds = String.valueOf(seconds);

            if(hours < 10) {
              stringHours = "0" + hours;
            }

            if(remainMinutes < 10) {
                stringRemainMinutes = "0" + remainMinutes;
            }

            if(seconds < 10) {
                stringSeconds = "0" + seconds;
            }


            return stringHours + ":" + stringRemainMinutes + ":" + stringSeconds;
        }
        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(int seconds){
        if(seconds >= 0){
            int minutes = seconds / 60;
            int remainSeconds = seconds % 60;

            return getDurationString(minutes, remainSeconds);
        }
        return INVALID_VALUE_MESSAGE;
    }
}
