package com.zuber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //(1)
        double sy ;
        sy = 8.8;

        //System.out.print(" i need " + sy + " numbers" );

            //   ****************X****************    //

        //(2)
        Scanner keybord  = new Scanner(System.in);
        //System.out.println(keybord.nextLine());

        //   ****************X****************    //

        //..(3)
//        double fnum, snum, answer;
//        System.out.println("eneter fisrt num: ");
//        fnum = keybord.nextDouble();
//        System.out.println("enter second num: ");
//        snum = keybord.nextDouble();
//        answer = fnum + snum;
//        System.out.println(answer);

        //   ****************X****************    //
        //(4)
        //int counter = 20;

//            while (counter <= 30){
//                System.out.println(counter);
//                counter++;
//            }

        //   ****************X****************    //
        //(5)
//            newClass newClassObject = new newClass();
//            newClassObject.message();


        //   ****************X****************    //
        //(6)
//           Scanner input = new Scanner(System.in);
//            newClass newClassObject = new newClass();
//
//        System.out.println("enter your name: ");
//        String name = input.nextLine();
//
//        System.out.println("enter your age: ");
//        String age = input.nextLine();
//
//        newClassObject.age(age,name);

        //   ****************X****************    //
        //(7)
       int age = 50;

        //System.out.println(age > 50 ? "old" : "young");



        //   ****************X****************    //
        //(8)
        for(int counter=7;counter<=65;counter+=3){
//            System.out.println(counter);
        }

        //   ****************X****************    //
        //(9/compound interest formula)
            double amount;
            double principal = 1347.38;
            double rate = 0.01;

            for(int day=1;day<= 30;day++){
                amount=principal*Math.pow(1 + rate, day);
//                System.out.println(day + " " + amount);
            }
        //   ****************X****************    //
        //(10)
//        int counter = 40;
//
//        do{
//            System.out.println(counter); counter++;
//
//        }while(counter <= 10);

        //   ****************X****************    //
        //(8/Math.class.method)

//        System.out.println(Math.abs(-26.7));
//        System.out.println(Math.ceil(8.4));
//        System.out.println(Math.floor(8.4));
//        System.out.println(Math.max(5.8,9.9));
//        System.out.println(Math.min(5.8,9.9));
//        System.out.println(Math.pow(8,4));
//        System.out.println(Math.sqrt(52));


        //   ****************X****************    //
        //(11)

//        Random dice = new Random();
//        int numbers;
//
//            for (int counter=1; counter<=10;counter++){
//                numbers = 5+dice.nextInt(8);
//                System.out.println(numbers + " ");
//            }

        //   ****************X****************    //
        //(12)
//        int namee[]={10,12,23,34,45,36};
//        int sum=0;
////        System.out.println(name[3]);
//        System.out.println("Index\tValue");
//
//        for(int counter=0;counter<namee.length;counter++){
//            System.out.println(counter +"\t" + namee[counter]);
//            sum+=namee[counter];
//        }
//
//        System.out.println("z sum of z array is " + sum);

        //   ****************X****************    //
        //(13)
//        Random rand = new Random();
//        int freq[]=new int[7];
//
//        for(int roll=1;roll<1000;roll++){
//            ++freq[1+rand.nextInt(6)];
//
//            System.out.println("Face\tFrequency");
//
//            for(int face=1;face<freq.length;face++){
//                System.out.println(face +"\t"+ freq[face]);
//            }
//        }

        //   ****************X****************    //
        //(14)
//
//        int names[]={5,6,7,8,9};
//        change(names);
//
//        for(int x:names)
//            System.out.println(x);



        //   ****************X****************    //
        //(15)

//        int firstarray[][]={{8,9,10,11},{12,13,14,15}};
//        int secondarrat[][]={{30,31,32,33},{43},{4,5,6,}};
//
//        System.out.println("this is the first arrat");
//        display(firstarray);
//        System.out.println("this is teh seconf array");
//        display(secondarrat);

        //   ****************X****************    //
        //(16)

        System.out.println(average(34,34,3434,343,434,34,33));


    }
    //(14)
//    public static void change(int x[]){
//        for(int counter=0;counter<x.length;counter++)
//            x[counter]+=5;

    //(15)
//        public static void display(int x[][]){
//            for(int row=0;row<x.length;row++){
//                for (int column=0;column<x[row].length;column++){
//                    System.out.print(x[row][column]+"\t");
//                }
//                System.out.println();
//            }
//    }

    //(16)
    public static int average(int...numbers){
        int total=0;
        for(int x:numbers)
            total +=x;

        return total/numbers.length;
    }


}
