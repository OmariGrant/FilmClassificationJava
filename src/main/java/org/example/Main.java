package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int input = input();


        while (input < 1 || input >24){
            System.out.println("Invalid input - Please try again using 1-24");
            input = input();
        }

//        int input = 1;

        System.out.println(greeting(input));

    }

    protected static int input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Time in Hours (e.g 11 for 11am and 23 for 11pm)");
        int input = -1;

        try {
            input = scan.nextInt();

        } catch (InputMismatchException ime){
            System.out.println("Input Error, Please retry with an integer between 1-24.");
            input();
        }

        return input;
    }


    protected static String greeting(int input){
        
        String greeting = null;
        if(input >= 5 && input <= 12){
            greeting = ("morning");

        } else if (input > 12 && input <= 18){
            greeting = ("afternoon");
        } else {
            greeting = ("evening");
        }
        
        return greeting;
    }
}