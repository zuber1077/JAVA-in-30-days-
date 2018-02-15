package com.zuber;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 200;
        int bones = 10;

//
       int highScore = calculateScore(true,800,1000,10);
        System.out.println("high score " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
            displayHighScorePosition("aymen", highScorePosition);
            highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("ansar", highScorePosition);
            highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("salm", highScorePosition);
            highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("zuber", highScorePosition);



    }

    public static void displayHighScorePosition(String playerName,int highScorePosition){
        System.out.println(playerName + " managed to get the " + highScorePosition + " on the score position");
    }


    public static  int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }else if(playerScore >= 500 && playerScore < 1000){
            return 2;
        }else if(playerScore >= 100 && playerScore <  500){
            return 3;
        }else{
            return 4;
        }
    }



    public static  int calculateScore(boolean gameOver,int score,int levelCompleted,int bones){
        if(gameOver){
            int finalScore = score + (levelCompleted * bones);
            return finalScore;
        }
        return -1;
    }
}
