import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Q: take input of two numbers and print the sum

        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        int num1, num2, sum;

        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        System.out.println("Then sum of the two numbers is: " + sum);
    }
}