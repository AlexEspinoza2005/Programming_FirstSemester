package com.datatype;

import java.util.Scanner;

public class Main {

    //Exercise 5: Calculate the payment based on worked hours and hourly rate.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours;
        double hourlyRate;
        System.out.println("hours: ");
        hours = sc.nextInt();
        System.out.println("hourly Rate: ");
        hourlyRate = sc.nextDouble();

        System.out.println("Result: "+hourlyRate*hours);
        
    }
}