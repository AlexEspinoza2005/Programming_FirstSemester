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
            double base;
            double altura;
            double apotema=0;
            double ab=0;
            double pb=0;
            double al=0;
            double at=0;
            double v=0;
        //ENTRY DATA
            System.out.print("Enter the value of base: ");
            base=sc.nextDouble();
            System.out.print("Enter the value of altura: ");
            altura=sc.nextDouble();
            System.out.print("Enter the value of apotema: ");
            apotema=sc.nextDouble();

        //PROCESS
	pb = base*4;
	ab = (base)*base;
	al = (0.5*pb*apotema);
	at = (0.5*pb*apotema)+ab;
	v = (ab*altura)/3;    
        //output
            System.out.println("The result area is: " + at);
            System.out.println("The result perimetro is: " + v);
        
    }
}
