package com.zuber;

public class Main {

    public static void main(String[] args) {
//        int newScore = calculateScore("tim " , 500);
//        System.out.println("new score " + newScore);
       double centimeter =  calcFeetAndInchesToCentimetres(6,0);
        if(centimeter <0.0){
            System.out.println("invalid parmeter");
        }

        calcFeetAndInchesToCentimetres(1);

    }
//
//    public static int  calculateScore(String playerName, int score){
//        System.out.println(playerName +  score);
//        return score * 1000;
//    }


//        int inches = 2.54cm;
//        int foot = 12 inches;



    public static double calcFeetAndInchesToCentimetres(double feet, double inches){
       if((feet <0) || ((inches <0)) || ((inches >12))){
           System.out.println("invalid feet or inches");
           return -1;
       }

        double centimeter = (feet * 12) * 2.54;
        centimeter += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches " + centimeter + " cm");
        return centimeter;
    }

    public static double calcFeetAndInchesToCentimetres(double inches){
        if(inches <0){
            System.out.println("invalid inches");
            return -1;
        }

        double feet =(int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches ");
        return calcFeetAndInchesToCentimetres(feet,remainingInches);
    }



}
