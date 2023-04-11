package com.kunal;
// program to take a name as input and print a greeting message
import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = in.nextLine();
        System.out.println("Great to have you here" + " " + name+ "!" +  " " + "We are really excited to see you today. Please, let's know how we can assist you.");
    }
}
