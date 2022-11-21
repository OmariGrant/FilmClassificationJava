package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter int");
//        int input = scan.nextInt();
        int input = 1;

        System.out.println(greeting(input));

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