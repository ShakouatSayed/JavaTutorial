/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functional_interface;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class Example02 {

    public static void main(String args[]) {
        new Thread(() -> {
            System.out.println("Thread is creating new. ");
        }).start();
    }
}
