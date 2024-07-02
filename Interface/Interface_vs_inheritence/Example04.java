/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_vs_inheritence;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
class A01 {

    int a;

    void setA(int x) {
        this.a = x;
    }
}

class B01 extends A01 {

    int b;
    int product;

    void setB(int b) {
        this.b = b;
    }

    void product() {
        product = a * b;
        System.out.println("This funtion mainly works for multiplication: " + product);
    }
}

public class Example04 {

    public static void main(String args[]) {
        B01 OB1 = new B01();
        OB1.setA(5);
        OB1.setB(10);
        OB1.product();
    }
}
