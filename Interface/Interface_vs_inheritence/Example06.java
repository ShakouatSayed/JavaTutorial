/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_vs_inheritence;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
class A3 {

    int x;

    void setA(int a) {
        x = a;
        System.out.println("X number is : " + a);
    }
}

class B3 extends A3 {

    int y;

    void setB(int b) {
        y = b;
        System.out.println("Y number is : " + b);
    }
}

class C3 extends A3 {

    int z;

    void setC(int c) {
        z = c;
        System.out.println("Z number is : " + c);
    }
}

public class Example06 {

    public static void main(String args[]) {
        B3 OB1 = new B3();
        OB1.setA(10);
        OB1.setB(20);

        C3 OB2 = new C3();
        OB2.setA(30);
        OB2.setC(40);
    }
}
