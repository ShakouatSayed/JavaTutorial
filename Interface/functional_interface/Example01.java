/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functional_interface;

public class Example01 {

    public static void main(String args[]) {
        new Thread(() -> {
            System.out.println("New Thread is Created. ");
        }).start();
    }
}
