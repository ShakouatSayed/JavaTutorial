/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_vs_inheritence;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
class A2 {

    int X;

    void setA(int x) {
        X = x;
    }
}

class B2 extends A2 {

    int Y;

    void setB(int y) {
        Y = y;
    }
}

class C2 extends B2 {

    int product;

    void setC() {
        product = X - Y;
        System.out.println("C2 class of method of setC mainly works for Substractions.: " + product);
    }
}

public class Example05 {

    public static void main(String args[]) {
        C2 OB1 = new C2();
        OB1.setA(43);
        OB1.setB(21);
        OB1.setC();
    }
}
