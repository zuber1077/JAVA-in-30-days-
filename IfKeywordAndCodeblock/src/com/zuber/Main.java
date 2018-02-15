package com.zuber;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelComplete = 8;
        int bones = 200;

//        calculate(true,10000,levelComplete,bones);

//        calculate(true,2000,80,30);

//        displalyHighScorePosition(true,1000,levelComplete,bones);
//        displalyHighScorePosition(true,1000,20,10);
//
//        calculateHighScorePosition(true,1500,200,500);
//        calculateHighScorePosition(true,900,200,500);
//        calculateHighScorePosition(true,400,200,500);
//        calculateHighScorePosition(true,50,200,500);

        //challenge
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("zuber", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("aymen", highScorePosition);



    }

    //methods

    public static int calculate(boolean gameOver,int score, int levelComplete, int bones){

        if(gameOver = true){
            int levelCom = score + (levelComplete * bones);
            levelCom += 1000;
            System.out.println("this is final 1" + levelCom);
            return levelCom;
        }else{
            return -1;
        }
    }

//    public static void displalyHighScorePosition(boolean gameOver,int score, int levelComplete,int bones ){
//
//        if(gameOver = true){
//            int scorePosition = score + (levelComplete * bones);
//            scorePosition += 1000;
//            System.out.println(" manage to get to position " + scorePosition + " on the hight score table");
//        }else{
//        }
//
//    }
//
//    public static int calculateHighScorePosition(boolean gameOver,int score, int levelComplete ,int bones){
//        if(score > 1000){
//            int calculateHigh = score + (levelComplete * bones);
//            System.out.println("final 1 " + calculateHigh);
//            return calculateHigh;
//        }else if(score > 500 && score < 1000){
//            int calculateHigh = score + (levelComplete * bones);
//            System.out.println("final 2 " + calculateHigh);
//            return calculateHigh;
//        }else if(score > 100 &&  score < 500){
//            int calculateHigh = score + (levelComplete * bones);
//            System.out.println("final 3 " + calculateHigh);
//            return calculateHigh;
//        }else{
//            return -1;
//        }
//
//

    //challenge





        public static void displayHighScorePosition(String playerName, int highScorePosition){
            System.out.println(playerName + " manage to get to position  " + highScorePosition + " on th ehigh score table ");
        }

        public static int calculateHighScorePosition(int playerScore){
            if(playerScore > 1000){
                return 1;
            }else if(playerScore > 500 && playerScore <1000){
                return 2;
            }else if(playerScore > 100 &&  playerScore < 500){
                return 3;
            }else{
                return 4;
            }
        }

}

