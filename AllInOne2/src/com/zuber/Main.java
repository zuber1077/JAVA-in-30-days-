package com.zuber;

public class Main {

    public static void main(String[] args) {

        //(17)

            timer timerObject = new timer();
        System.out.println(timerObject.toMilitary());
        System.out.println(timerObject.toString());

            timerObject.setTime(15,23,34);
        System.out.println(timerObject.toMilitary());
        System.out.println(timerObject.toString());
    }
}
