package com.javaLearning;

public class Main {

    public static void main(String[] args) {


        boolean gameOver = true;
        int score = 3000;
        int levelCompleted = 4;
        int bonus = 500;


      /*  if ((score < 5000) && (score > 4000)){
            System.out.println("your score is less then 5000 and greater then 4000");
        }else if ((score <4000) && (score> 2000)){
            System.out.println("your score is less then 4000 and greater then 2000");
        }else {
            System.out.println("invalid score");
        }
*/


        if (gameOver){
            int finalScore = score + (levelCompleted* bonus);
            System.out.println("your final score is " + finalScore);
        }else {
            System.out.println("you are out from the game");
        }

        {
            String name = "kaushik";
        }



        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver){
            int finalScore = score + (levelCompleted* bonus);
            System.out.println("your final score is " + finalScore);
        }else {
            System.out.println("you are out from the game");
        }



        // challenge
        // create out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // but make sure the first printout above still displays as well


        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;
        if (newGameOver){
            int newFinalScore = newScore + (newLevelCompleted* newBonus);
            System.out.println("your final score is " + newFinalScore);
        }else {
            System.out.println("you are out from the game");
        }


    }


}
