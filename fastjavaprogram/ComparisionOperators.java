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
public class ComparisionOperators {
    // start main function
    public static void main(String args[]) {
        // declear variable
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        // user input
        out.println("Enter Your Number a: ");
        a = sc.nextInt();
        out.println("Enter Your Number b: ");
        b = sc.nextInt();
        // now we show that comparision operator
        // is equal to comparision operator
        out.println(a == b);
        // is not equal
        out.println(a != b);
        // is greater than
        out.println(a > b);
        // is less than
        out.println(a < b);
        // is greter than or equal to
        out.println(a >= b);
        // is less than or equal to
        out.println(a <= b);
    }
}
/* Thanks for watching */