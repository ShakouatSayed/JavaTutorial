/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastjavaprogram;

import java.util.Scanner;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class problem8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charcheter: ");

        String x = sc.nextLine();
        switch (x) {
            case "a" -> System.out.println("Apple");
            case "b" -> System.out.println("Apple");
            case "c" -> System.out.println("Apple");
            default -> System.out.println("Not Found.");
        }
    }
}
