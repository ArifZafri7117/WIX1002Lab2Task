/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter text:");
        String text = in.nextLine();
        
        System.out.println("Enter number:");
        double num = in.nextDouble();
        
        System.out.printf("1. %s%n", text);
        
        System.out.printf("2. %d%n", (int)num);
        
        System.out.printf("3. %.2f%n", num);
        
        System.out.printf("4. %S%n", text);
        
        System.out.printf("5. |%-5d|%n", (int)num);
        
        System.out.printf("6. |%5d|%n", (int)num);
        
        System.out.printf("7. |%6.2f|%n", num);
        
        System.out.printf("8. %s%.2f%n", text, num);
        
        System.out.printf("9. %+f%n", num);
        
        System.out.println("10." + num);
        
        in.close();
    }
}

