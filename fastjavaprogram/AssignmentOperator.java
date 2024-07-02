/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastjavaprogram;

import static java.lang.System.*;
import java.util.*;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class AssignmentOperator {
    public static void main(String args[]) {
        String a, b, c;
        int d, e, sum, sub, mul, div, mod;
        Scanner sc = new Scanner(System.in);
        out.println("Enter a number");
        d = sc.nextInt();
        out.println("Enter a number");
        e = sc.nextInt();

        a = "Hello";
        out.println(a);
        b = "World";
        a = "Hello";
        a = "World 1";
        out.println(a);
        b = "Hello";
        a = "World";
        c = a += b;
        out.println(c);
        // out.println(a +" "+ b);
        // int c, d, e;
        // 10 + 2 = 12
        out.println(d += e);
        // d = 12 - 2 = 10;
        out.println(d -= e);
        // d = 10 * 2 = 20
        out.println(d *= e);
        // d = 20 / 2 = 10
        out.println(d /= e);
        // d = 10 % 2 = 0
        out.println(d %= e);
        // this is assignment operator
    }
}
