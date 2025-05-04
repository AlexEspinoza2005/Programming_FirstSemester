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
            double abi;
            double absu;
            double h=0;
            double a=0;
            double p1=0;
            double p2=0;
            double at=0;
            double al=0;
            double v=0;
        //ENTRY DATA
            System.out.print("Enter the value of base lower: ");
            abi=sc.nextDouble();
            System.out.print("Enter the value of superior: ");
            absu=sc.nextDouble();
            System.out.print("Enter the value of height: ");
            h=sc.nextDouble();
            System.out.print("Enter the value of apotema: ");
            a=sc.nextDouble();
             System.out.print("Enter the value of base lower: ");
            p1=sc.nextDouble();
            System.out.print("Enter the value of base height: ");
            p2=sc.nextDouble();            
        //PROCESS
            al = ((p1+p2)/2)*a;
            at = ((p1+p2)/2)*a+abi+absu;
            v = (h/3)*(abi+absu+((abi*absu)*0.5)) ;  
        //output
            System.out.println("The result perimetro is: " + v);
            System.out.println("The result lateral area is: " + al);   
            System.out.println("The result area is: " + at);
    }
}