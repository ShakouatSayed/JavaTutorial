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

class swit_in {
    public void main() {
        System.out.println("sayed");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("This is not a number");
                break;
        }
    }

    public void main1() {
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("a = 1");
                break;
            case 2:
                System.out.println("a = 2");
                break;
            default:
                System.out.println("There is no number in this case.");
                break;
        }
    }
}

class swit_in1 extends swit_in {
    public void main2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Colour name: ");
        String s = sc.nextLine();

        switch (s) {
            case "Red":
                System.out.println("This is red.");
                break;
            case "Orang":
                System.out.println("This is blue.");
                break;
            case "Green":
                System.out.println("This is Green");
                break;
            case "Grey":
                System.out.println("This is gray colour.");
                break;
            case "White":
                System.out.println("This is White.");
                break;
            case "Black":
                System.out.println("This is Black.");
                break;
            default:
                System.out.println("There is no color in the choich.");
                break;

        }
    }
}

public class swit_c extends swit_in1 {
    public static void main(String[] args) {
        swit_in a = new swit_in();
        // a.main();
        a.main1();
        swit_in1 b = new swit_in1();
        b.main2();
    }
}