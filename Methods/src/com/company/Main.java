package com.company;

public class Main {

    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 700, 3, 80);

        int score = calculateScore2(false, 1500, 6, 250);
        System.out.println("Your score: " + score);
        score = calculateScore2(true, 1500, 6, 250);
        System.out.println("Your score: " + score);

        displayHighScorePosition("Adam", calculateHighScore(1000));
        displayHighScorePosition("Bob", calculateHighScore(500));
        displayHighScorePosition("Percy", calculateHighScore(100));
        displayHighScorePosition("Csacsi", calculateHighScore(99));

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your score is " + finalScore);
        }
    }

    public static int calculateScore2(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted + bonus);
            System.out.println("The game is over");
            return finalScore;
        } else {
            System.out.println("The game is not over");
            return score;
        }
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the hight score table.");
    }

    public static int calculateHighScore(int score) {
//        if(score >= 1000)
//            return 1;
//        else if(score >= 500)
//            return 2;
//        else if(score >= 100)
//            return 3;
//
//        return 4;

        int position = 4;
        if (score >= 1000)
            position =  1;
        else if (score >= 500)
            position =  2;
        else if (score >= 100)
            position =  3;
        return position;
    }
}
