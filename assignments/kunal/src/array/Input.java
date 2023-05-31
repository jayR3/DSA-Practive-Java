package array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // arrays of primitives
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;


        // input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        for (int num : arr) { // here num represent the element of the array, it can be rep with any variable
//            System.out.print(num + " "); //for every element in the array, print the element
//        }
//        System.out.println(arr[5]); // index out of bound error

        // arrays of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
           str[i] = in.next();

        }
        // modify

        str[1] = "kunal";
        System.out.println(Arrays.toString(str));
    }
}
