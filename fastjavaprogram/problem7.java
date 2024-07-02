/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastjavaprogram;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class problem7 {
    public static void main(String args[]) {
        int a = 20, b = 18, c = 25;
        if (a > b && a > c) {
            System.out.println("The largest value is: " + a);
        } else if (b > a && b > c) {
            System.out.println("The largest value is: " + b);
        } else if (c > a && c > b) {
            System.out.println("The largest value is: " + c);
        }
    }
}
