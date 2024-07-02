/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastjavaprogram;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class nasted_if {
    public static void main(String args[]) {
        int v1 = 3;
        switch (v1) {
            case 5 -> {
                if (v1 == 3) {
                    System.out.println("Hi, val1 is 5 and val2 is 3");
                } else {
                    System.out.println("Hi, val1 3 and value is other them 5");
                }
            }
            case 4 -> System.out.println("Value is 3");
            case 3 -> System.out.println("Hi, Value is 3");
            case 2, 1 -> System.out.println("Hi, Value is 1");
            case 0 -> {
                if (v1 == 3) {
                    System.out.println("Hi, Value is 3 and value is 3");
                } else {
                    System.out.println("Hi, This is are empty.");
                }
            }
            default -> System.out.println("There are nothing");
        }
    }
}
