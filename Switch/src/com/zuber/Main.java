package com.zuber;

public class Main {

    public static void main(String[] args) {

        int switchValue = 3;
        switch (switchValue) {
            case 1:
            case 2:
            case 3:
                System.out.println("it was " + switchValue);
                break;
        }

        char switchValues = 'q';
        switch (switchValues){
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("it was " + switchValues);
                break;
            default:
                System.out.println("non of them was found");
                break;
    }
        String month = "JUN";
        switch (month.toLowerCase()){
            case "jun":
                System.out.println("Jan");
                break;
            case "auguest":
                System.out.println("aug");
                break;
                default:
                    System.out.println("no idea");
                    break;
        }
    }

}
