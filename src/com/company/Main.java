package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter the size of an array between numbers 1 and 3000");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        //Adding user input to an array
        int[] arr = new int[input];
        //Iterating array
        for (int i = 1; i < arr.length; i++) {
            //Condition to check if array number is divisible by 3 and 5 (15 because it`s first number divisible by both)
            if ((i % 15) == 0) {
                System.out.println("FIZZBUZZ");

                //Check if it`s divisible by 3
            } else if ((i % 3) == 0) {
                System.out.println("FIZZ");

                //Check if it`s divisible by 5
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");

                //Print other values of an array
            } else {
                System.out.println(String.valueOf(i));
            }
        }

    }

}


//    You are given a list of integers of given size N (where 0<N<=3k). Print all the numbers in a given list ,only for numbers that divisible by 3 instead of their value print "FIZZ",
//        for numbers who are divisible by 5 print "BUZZ", and for numbers who are both divisible by 3 an 5 - "FIZZ BUZZ". e.g. INPUT 1 3 4 5 15 OUTPUT 1 FIZZ 4 BUZZ FIZZBUZZ