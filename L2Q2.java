/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import java.util.Scanner;

public class L2Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Price of the car (P): ");
        double p = in.nextDouble();
        System.out.print("Down payment (D): ");
        double d = in.nextDouble();
        System.out.print("Interest rate in % (R): ");
        double r = in.nextDouble();
        System.out.print("Loan duration in years (Y): ");
        double y = in.nextDouble();

        double m = (p - d) * (1 + r * y / 100) / (y * 12);
        System.out.printf("Monthly payment = %.2f%n", m);
    }
}
