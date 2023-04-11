package com.loops;

import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        // program to calculate the area of a circle

        System.out.print("Please enter the radius of the circle: ");
        Scanner in = new Scanner(System.in);

        float π = 22 / 7f;
        float r = in.nextFloat();

        float Area = (float) (π * Math.pow(r, 2));
        System.out.println("The area of the circle with radius " + r + " is: "+ Area);

    }
}
