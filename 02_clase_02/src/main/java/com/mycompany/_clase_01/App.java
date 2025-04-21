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
            double lado1=0;
            double lado2=0;
            double area=0;
            double perimetro=0;
        //ENTRY DATA
            System.out.print("Enter the value of site 1: ");
            lado1=sc.nextDouble();
            System.out.print("Enter the value of site 2: ");
            lado2=sc.nextDouble();
        //PROCESS
            area=lado1*lado2;
            perimetro=(2*lado1)+(2*lado2);
        //output
            System.out.println("The result area is: " + area);
            System.out.println("The result perimetro is: " + perimetro);

    }
}
