/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._clase_01;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE-FICA 2023
 */
public class App
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //CABECERA
        //DECLARAR LAS VARIABLES Y SUS TIPOS
            int num1=0;
            int num2=0;
            int suma=0;
        //ENTRY DATA
            System.out.print("Input the value of num1: ");
            num1=sc.nextInt();
            System.out.print("Input the value of num2: ");
            num2=sc.nextInt();
        //PROCESS
            suma=num1+num2;
        //output
            System.out.print("The result is: " + num1 + " + " + num2 + " = " + suma );
    }
}
