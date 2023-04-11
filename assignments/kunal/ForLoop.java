package com.kunal;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

//        program to print 1 to n where n is the user input

        System.out.print("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int num = 1; num <= n; num++) {
            System.out.print(num + " ");
        }

//

    }
}
