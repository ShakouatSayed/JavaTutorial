/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_class;

interface InterFA {

    final int a = 10;

    public void method1();
}

abstract class InterFB implements InterFA {

    public void method1() {
        System.out.println("This is the method1 of interfaceA class.");
    }
}

public class Example02 extends InterFB {
    public static void main(String args[]) {
        Example02 OB1 = new Example02();
        OB1.method1();
        System.out.println(a);
    }
}
