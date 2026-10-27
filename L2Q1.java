/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2;

import java.util.Scanner;

public class L2Q1  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temp in Farenheit: ");
        
        double fah = sc.nextDouble();
        double cel = (fah-32)/1.8;
        
        System.out.println("Temperature in Celcius : %.2f%n" +cel);
        
        sc.close();
    }
}