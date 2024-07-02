package fastjavaprogram;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//import com.mycompany.fastjavaprogram.TernaryOper;
import java.util.*;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class TernaryOper {

    public static void ternaryOp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight: ");
        int weight = sc.nextInt();
        boolean res = ((weight >= 60) && (weight <= 80)) ? true : false;
        System.out.println(res);
    }

    public static void ternaryOp1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        boolean res = ((age >= 30) && (age <= 50)) ? false : true;
        System.out.println(res);
        // return res;
    }

    public static void main(String[] args) {

        TernaryOper a = new TernaryOper();
        a.ternaryOp();
        a.ternaryOp1();

        // res = ternaryOp();
        // res1 = ternaryOp1();
        // System.out.println(res);
        // System.out.println(res1);
    }
}
