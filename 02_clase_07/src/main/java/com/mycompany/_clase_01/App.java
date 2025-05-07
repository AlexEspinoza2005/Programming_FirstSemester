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
            double h=0;
            double r=0;
            double v=0;
            double at=0;

        //ENTRY DATA
            System.out.print("Enter the value of altura: ");
            h=sc.nextDouble();
            System.out.print("Enter the value of radio: ");
            r=sc.nextDouble();            
        //PROCESS
        at = (2*3.14*r*h)+(2*3.14*r*r);
	v = at*h;
        //output
            System.out.println("The result volumen is: " + v);
            System.out.println("The result area is: " + at);
    }
}