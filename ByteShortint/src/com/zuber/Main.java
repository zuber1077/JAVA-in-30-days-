package com.zuber;

public class Main {

    public static void main(String[] args) {

        //byte has a width of 8 ..-128
        byte myByteNumber = -120;

        //short ha a width of 16  ...32767
        short myShortNUmber = 3000;

        //int has a width of 32 ... -2_147_483_638 .. 2_147_483_637
        int myIntNUmber = 70000;

        //long has a width of 68
        long myLong = 50000L + 10L * (myByteNumber + myShortNUmber + myIntNUmber);
        short myShort  = (short) (1000 + 10 * (myByteNumber + myIntNUmber + myShortNUmber));;

        System.out.println("my long " + myLong);
        System.out.println("my short " + myShort);



    }
}
