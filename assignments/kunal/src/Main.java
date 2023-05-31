public class Main {
    public static void main(String[] args) {
        // Q: store a roll no
        int a = 19;

        //syntax
        //datatype[] variable name = new datatype [size];
        // store 5 roll numbers:

//        int[] roll_no = new int[5];
//        // Alternatively,
//        int[] roll_no2 = {4, 5,23, 7, 8};

        /*
        points to note:
        1. the datatype int at the beginning of code @line 12 determines the type of data stored in the array
        2. All datatype must be the same. you can't have a mixture of two or more datatype inputs inside the brackets @line 12
        3. taking line 10 as example, int is the datatype, roll_no is the reference variable,
        new int[5] is creating the object in heap memory
         */

        int[] ros; // declaration of arrays. ros is the reference variable getting defined in the stack
        ros = new int[5]; // initialization here, object is being created in the heap memory

//  objects including array objects are stored in heap
//   heap objects are not continuous
//        array objects may not be continous. It depends on the JVM
    }
}