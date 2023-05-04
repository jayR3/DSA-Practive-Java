import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int ans = sum2(); // the function name: sum 2 is stored in a new variable "ans" via a function call
        System.out.println(ans); //we print the variable ans here which is the value that was returned
    }
        static int sum2 () { // sum2 is the name of the function
            Scanner in = new Scanner(System.in); // allows us to take an input
            System.out.println("Enter number 1: "); // allows us to print a prompt for the user to see

            int num1, num2, sum; // variables declaration

            num1 = in.nextInt(); // variables initialization
            System.out.println("Enter number 2: ");
            num2 = in.nextInt();
            sum = num1 + num2;

            return sum; // returns means the function will end here (this line of code)
        }
    }

