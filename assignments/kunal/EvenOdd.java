package com.kunal;

import java.util.Scanner;

// Take a number from the user and print if it's even or odd
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.print("Please input a number: ");
        int number = in.nextInt();
        if (number % 2 == 0) {
            System.out.println("This is an even number");
        }else{
            System.out.println("This is an odd number");
        }
    }
}
