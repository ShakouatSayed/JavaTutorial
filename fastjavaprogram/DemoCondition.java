/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastjavaprogram;

import static java.lang.System.*;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class DemoCondition {
    public static void main(String[] args) {
        int v1 = 2, v2 = 4, result;
        boolean someCondition = true;
        if ((v1 == 2) && (v1 < 4))
            out.println("The condition is and operation: " + v1);
        if ((v2 != v1) || (v2 > v1)) {
            out.println("the first condition is v2 not equel to v1 or v2 greter then v1: " + v2);
            if (v2 > v1) {
                out.println("The secont condition is v2 greter then v1: " + v1);
            }
        }
        result = someCondition ? v1 : v2;
        out.println("This is ternary operator the someCondition is true print v1 if false v2  " + result);
    }
}
