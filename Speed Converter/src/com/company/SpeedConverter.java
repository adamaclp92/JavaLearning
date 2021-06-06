package com.company;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        //1 mile 1.609 km
        long milesPerHour = -1;
        if(kilometersPerHour >= 0)
        {
            milesPerHour = Math.round(kilometersPerHour / 1.609);
            return milesPerHour;
        }
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(milesPerHour == -1)
            System.out.println("Invalid value");
        else
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}
