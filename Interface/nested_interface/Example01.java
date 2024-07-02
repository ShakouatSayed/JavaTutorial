/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nested_interface;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
class InterfaceA {

    interface InterfaceB {

        void method1();
    }
}

class Interface01 implements InterfaceA.InterfaceB {

    public void method1() {
        System.out.println("This is the nested Interface. ");
    }
}

public class Example01 {

    public static void main(String args[]) {
        Interface01 OB1 = new Interface01();
        OB1.method1();
    }
}
