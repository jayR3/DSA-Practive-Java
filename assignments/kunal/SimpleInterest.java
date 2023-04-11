package com.kunal;

import java.util.Scanner;

// program to calculate the simple interest based on principal, rate and time
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the Principal: ");
        int principal = in.nextInt();

        System.out.print("Please enter the Rate in %: ");
        double rate = in.nextDouble();

        System.out.print("Please enter the Time in years: ");
        float time = in.nextFloat();

        double simple_interest = (principal * rate * time)/100;
        System.out.println("The simple interest for when principal = " + principal + ", rate = " + rate + " " + "and time = " + time + " " + "is: " + simple_interest);
    }
}
