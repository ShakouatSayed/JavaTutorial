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
public class ModulusOperator {
    public static void main(String[] args) {
        float v1, v2;
        int mod, div;
        Scanner sc = new Scanner(System.in);
        out.println("Enter your first value: ");
        v1 = sc.nextFloat();
        out.println("Enter your Second value: ");
        v2 = sc.nextFloat();
        mod = (int) (v1 % v2);
        out.println("v1  modulus v2: " + mod);
        div = (int) (v1 / v2);
        out.println("v1  divided v2: " + div);
    }
}
