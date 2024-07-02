/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastjavaprogram;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class problem3 {
    public static void main(String args[]) {
        char w = 'a';
        String s;
        switch (w) {
            case 'a' -> {
                s = "Apple";
                System.out.println(s);
            }
            case 'b' -> {
                s = "ball";
                System.out.println(s);
            }
            case 'c' -> {
                s = "cat";
                System.out.println(s);
            }
            case 'd' -> {
                s = "dog";
                System.out.println(s);
            }
            default -> System.out.println("There is nothing.");
        }
    }
}
