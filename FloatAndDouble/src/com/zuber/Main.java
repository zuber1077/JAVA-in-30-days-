package com.zuber;

public class Main {

    public static void main(String[] args) {

        // width of int = 32 (4 byte)
        int myINt = 5 / 3;

        // width of float = 32 ( 4 byte)
        float myFloat=  5f / 3;
        //width of double  = 64 (8 byte)
        double myDubble = 5d / 3;

        System.out.println("myINt" + myINt);
        System.out.println("myFloat" + myFloat);
        System.out.println("myDubble" + myDubble);

        //-----------------x----------------------//

        float  kiloGram = 0.45359237f;
        double pound =  200;

        System.out.println(pound * kiloGram);


    }
}
