/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastjavaprogram;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class Dd1 {
    public static void main(String[] args) {
        Dd1 a = new Dd1();
        a.Ar();
        a.AR1();
        a.AR2();
        a.AR3();
    }

    public void Ar() {
        int overtime = 60;
        if (overtime <= 50) {
            int pay_amt = 1200;
            int medical = 1200;
            System.out.println("Pay amount: " + pay_amt + " Medical: " + medical);
        } else {
            int pay_amt = 2000;
            int medical = 1500;
            System.out.println("Pay amount: " + pay_amt + " Medical: " + medical);
        }
    }

    public void AR1() {
        int x, y;
        x = 5;
        y = 6;
        if (x > y) {
            System.out.println("X bigger then Y");
        } else if (x == y) {
            System.out.println("X equal to Y");
        } else {
            System.out.println("X smaller then Y");
        }
    }

    public void AR2() {
        int i = 3;
        if (i == 1) {
            System.out.println("Yes /i = 1");
        } else if (i == 2) {
            System.out.println("Yes /i = 2");
        } else if (i == 3) {
            System.out.println("Yes /i = 3");
        } else {
            System.out.println("I don't no");
        }
    }

    public void AR3() {
        String name = "sayed";
        if (name == "Sayed") {
            System.out.println("Wrong User Name");
        } else if (name == "sayed") {
            System.out.println("You loged in");
        } else {
            System.out.println("User name is enterd wrong");
        }
    }
}
