package com.kunal;

import java.util.Scanner;

public class CountNum {

    // program to count number of occurrence of a given number in a set of numbers

        public static void main(String[] args) {
        System.out.print("Please enter the number: ");
        Scanner in = new Scanner(System.in); // this Scanner class us to take an input from the keyboard

        int n = in.nextInt(); // this actually takes the input

        int count = 0;
        while (n > 0) {  // using while loop
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
