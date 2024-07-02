/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_vs_inheritence;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
class A1 {

    int x;
    String name;

    void setA(int a, String name) {

        try {
            this.x = a;
            this.name = name;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void displaA() {
        System.out.print(x + "\t" + name + "\t");
    }
}

class B extends A1 {

    int bal;
    String details;

    void setB(int bal, String details, int x, String name) {
        try {
            setA(x, name);
            this.bal = bal;
            this.details = details;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void displayB() {
        displaA();
        System.out.print(bal + "\t" + details);

    }
}

public class Example03 {

    public static void main(String arg[]) {
        B OB1 = new B();
        OB1.setB(100000, "Employee", 1254, "Sayed");
        OB1.displayB();

    }
}
