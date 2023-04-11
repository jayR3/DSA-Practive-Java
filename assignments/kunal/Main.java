package com.kunal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String fruit = in.next();
////        If a break statement is not there for each case, then the code will continue to execute and display all print statements
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruit");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("A round fruit");
//            case "Grape" -> System.out.println("small fruit");
//            default -> System.out.println("Please enter a valid fruit");
//        }
            int day = in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}