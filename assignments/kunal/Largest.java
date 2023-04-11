package com.kunal;

import java.util.Scanner;

public class Largest {

    // program to find the largest of 3 numbers

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();

        System.out.print("Enter the second number: ");
        int b = in.nextInt();

        System.out.print("Enter the third number: ");
        int c = in.nextInt();

        // program to find the largest of three numbers
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }

//        Alternatively,

        int max = Math.max(c, Math.max(a, b));
        System.out.println("The maximum number among the three is: " + max);
    }
}
