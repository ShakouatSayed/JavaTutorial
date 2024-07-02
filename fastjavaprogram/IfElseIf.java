/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastjavaprogram;

import java.util.*;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class IfElseIf {
    public static void main(String[] args) {
        IfElseIf If = new IfElseIf();
        // If.If();
        // If.If1();
        // If.If2();
        If.If3();

    }

    public void If() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the one Number: ");
        int a, b;
        a = sc.nextInt();
        System.out.println("Enter the two number: ");
        b = sc.nextInt();
        if (a > b) {
            System.out.println("Welcome Dhaka");
        }
        System.out.println("Welcome America");
    }

    public void If1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the one Number: ");
        int a, b;
        a = sc.nextInt();
        System.out.println("Enter the two number: ");
        b = sc.nextInt();
        if (a == 5) {
            System.out.println("Welcome Dhaka");
        }
        if (b == 6) {
            System.out.println("Welcome America");
        }
        System.out.println("Do this either way......");
    }

    public void If2() {
        Scanner sc = new Scanner(System.in);
        char a = 'c';
        char b = 'x';
        // System.out.println("Enter the one Charectare: ");
        // String a, b;
        // a = sc.next();
        // System.out.println("Enter the two Charectare: ");
        // b = sc.next();
        if (b == a) {
            System.out.println("A smaller them b");
        }
    }

    public void If3() {
        Scanner sc = new Scanner(System.in);
        // char a = 'c';
        // char b = 'x';
        int i;
        double d;
        String a, b, c, e;

        // user input in integer and number
        System.out.println("Enter the frist integer number: ");
        i = sc.nextInt();
        System.out.println("Enter the Second double number: ");
        d = sc.nextDouble();

        // user input a strings
        System.out.println("Enter the one Charectare: ");
        c = sc.nextLine();
        a = sc.nextLine();
        System.out.println("Enter the two Charectare: ");
        e = sc.nextLine();
        b = sc.nextLine();
        if (b == null ? a != null : !b.equals(a)) {
            System.out.println("The frist integer number is: " + i);
            System.out.println("The Second double number is: " + i);

            // concatinate the string
            System.out.println("The string is: " + a + e);
        }
        // System.out.println(c+e);
    }
}
