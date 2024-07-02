/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastjavaprogram;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class test {
    public static void main(String args[]) {
        char c = 'A';
        switch (c) {
            case 'A' -> System.out.println("Excelient");
            case 'B', 'C' -> System.out.println("Good Result");
            case 'D' -> System.out.println("You result not bed");
            case 'F', 'G' -> System.out.println("You are fail");
            default -> System.out.println("You are Hard work");
        }
        System.out.println("You grade is: " + c);
    }
}
