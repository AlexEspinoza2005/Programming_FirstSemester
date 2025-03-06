package com.datatype;

public class Main {
    //Exercise 4: Display the result of an arithmetic operation. ((3+2)/(2*5))^2

    public static void main(String[] args) {
        double result;
        //Note: To avoid integer division in Java, add .0 to the numbers in the operation. 
        //      This ensures the division is done with decimal precision (double) instead of being truncated to 
        //      integers (int).
        result = Math.pow(((3.0+2.0)/(2.0*5.0)), 2);
        System.out.println("Result is: "+result);
    }
}