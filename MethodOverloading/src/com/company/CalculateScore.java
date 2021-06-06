package com.company;

public class CalculateScore {
    public static void calculateScore(String name, int score){
        System.out.println(name + "scored " + score + " points.");
    }

    public static void calculateScore(int score){
        System.out.println("Unnamed scored " + score + " points.");
    }
}
