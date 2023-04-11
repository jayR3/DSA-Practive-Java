package com.kunal;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // Take input till user does not press x or X
        int ans = 0;

        while (true) {
            System.out.print("Please enter an operator: ");

            // take the operator as input
            char op = in.next().trim().charAt(0);

            // check for the operator
            if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%') {
                // take two numbers as input
                System.out.print("Please enter the two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if(num2 != 0) {
                        ans = num1 / num2;
                    }else{
                        System.out.println("Error");
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            }else {
                System.out.println("Please enter a valid operator");
            }
            System.out.println("The " + op + " of the two numbers is: " + ans);
            System.out.println();
        }
    }
}
