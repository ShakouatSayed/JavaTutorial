/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastjavaprogram;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class Tycls_1 {
    public static void main(String args[]) {
        byte b;
        long l = 132;
        double d = 23.45;
        char c = 'c';
        // String s = "Shakouat Hossen Sayed";
        int i = 10;
        System.out.println("Conversition of Char to byte.");
        b = (byte) (char) c;
        System.out.println("b and c " + b + " " + c);
        System.out.println("Conversition of long to byte.");
        b = (byte) (long) l;
        System.out.println("b and l " + b + " " + l);
        System.out.println("Conversition of long to double.");
        d = (double) l;
        System.out.println("d and l " + d + " " + l);
        System.out.println("Conversition of int to long.");
        l = (long) i;
        System.out.println("b and c " + l + " " + i);
    }
}
