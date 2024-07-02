/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastjavaprogram;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class brake {
    public static void main(String args[]) {
        int i;
        for (i = 1; i <= 10; i++) {
            if (i >= 4) {
                System.out.println("Its works.");
                break;
            }
            System.out.println(i);
        }
    }
}
