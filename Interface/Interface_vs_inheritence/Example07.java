/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_vs_inheritence;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
interface InterF01 {

    void method01();
}

interface InterF02 {

    void method02();
}

public class Example07 implements InterF01, InterF02 {

    public void method01() {
        System.out.println("This is the method01 of Example 07.");
    }

    public void method02() {
        System.out.println("This is the method02 of Example 07.");
    }

    public static void main(String args[]) {
        Example07 OB1 = new Example07();
        OB1.method01();
        OB1.method02();
    }
}
