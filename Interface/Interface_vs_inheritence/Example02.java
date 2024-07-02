package Interface_vs_inheritence;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SHAKOUAT HOSSEN
 */

class A {
    void animal() {
        System.out.println("This class is animal....");
    }
}

public class Example02 extends A {
    public static void main(String args[]) {
        A OB1 = new A();
        OB1.animal();
    }
}
