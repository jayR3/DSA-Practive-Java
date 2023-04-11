package com.kunal;

// program to add bonus based on user salary
public class If_condition {
    public static void main(String[] args) {

        int salary = 25400;
//        if (salary > 10000) {
//            salary = salary + 2000;
//        }else{
//            salary = salary + 1000;
//        }

//        multiple if-else statement
        if (salary > 10000) {
            salary += 2000;
        } else if (salary > 20000) {
            salary += 3000;
        }else {
            salary += 1000;
    }
        System.out.println(salary);
    }
}
