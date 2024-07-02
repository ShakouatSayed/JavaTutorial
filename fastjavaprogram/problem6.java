/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastjavaprogram;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class problem6 {
    public static void main(String args[]) {
        int num = 70, b;
        String s = "A";
        switch (s) {
            case "A" -> System.out.println("This studest number is 80 to 100.");
            case "B" -> System.out.println("This studest number is 70 to 79.");
            case "C" -> System.out.println("This studest number is 60 to 69.");
            case "F" -> System.out.println("This studest number is 00 to 59.");
            default -> System.out.println("There is no grade.");
        }
    }
}
