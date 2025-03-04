package com.datatype;
import java.util.Scanner;
public class Main {
    //Exercise 3: Ask the user for their name and display "Hello, <name>!".
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Name: ");
        name=sc.nextLine();
        System.out.println("Name is: "+name);
    }
}