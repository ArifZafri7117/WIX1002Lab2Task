/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

public class L2Q5 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10001);  // 0..10000 inclusive
        int temp = n, sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Number = " + n);
        System.out.println("Sum of digits = " + sum);
    }
}
