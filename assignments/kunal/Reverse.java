package com.kunal;

public class Reverse {
    // program to output the reverse of a given number
    public static void main(String[] args) {
        int n = 23597;
        int ans = 0; // initializing ans to be 0

        // using a while loop
        while (n > 0) {
            int rem = n % 10;
            n /= 10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans); // print the result
    }
}
