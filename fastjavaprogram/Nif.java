/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastjavaprogram;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class Nif {
    public static void main(String[] arg) {
        Nif a = new Nif();
        // a.main1();
        a.main4();
    }

    public void main1() {
        int n = 4;
        if (n <= 50) {
            if (n == 3) {
                System.out.println("The value is 3");
            }
            if (n == 4) {
                System.out.println("The value is 4");
            }
            if (n == 7) {
                System.out.println("The value is 7");
            }
        }
    }

    public void main2() {
        int a = 13;
        int b = 44;
        int c = 142;
        if (a < b) {
            if (c > b) {
                System.out.println("A greter than b");
            }
        }
    }

    public void main3() {
        int a, b;
        a = 144;
        b = 142;
        int c = 50;
        if ((a > b) && (b < a)) {
            System.out.println("a are the gretest");
        } else if ((c < a) && (a > c)) {
            System.out.println("c are the smallest");
        } else {
            System.out.println("b are the gretest");
        }
    }

    public void main4() {
        if (8 <= 7) {
            System.out.println("Hello world");
        } else if (9 == 9) {
            System.out.println("Hello Robert");
        } else {
            System.out.println("Hello Youtube");
        }
    }
}
