/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastjavaprogram;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class collected {
    public static void main(String args[]) {
        int a = 20, b = 30, c = 40;
        int status = -1;
        if (a > b && b > c) {
            status = 1;
        } else if (b > c) {
            status = 2;
        } else {
            status = 3;
        }
        switch (status) {
            case 1 -> System.out.println("A is gretest.");
            case 2 -> System.out.println("B is gretest.");
            case 3 -> System.out.println("c is gretest.");
            default -> System.out.println("There is nothing");
        }
    }
}
