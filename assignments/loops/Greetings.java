import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name please: ");
        String name = in.nextLine();

       String personalized = myGreet(name); //call the function with the parameter
        System.out.println(personalized);


    }
    static String myGreet(String name) { //created a function here with a parameter string name ...
        String greeting = "Hello " + name; // ...to return my name as the value...
        return greeting; //... stored in a variable called greeting.
    }
}
