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
public class solv_1 {
    public static void main(String args[]) {
        solv_1 a = new solv_1();
        a.main0();
        a.main1();
    }

    public void main0() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the gender: ");
        String gender = sc.nextLine();
        switch (gender) {
            case "male" -> System.out.println("He is a male.");
            case "female" -> System.out.println("She is a female.");
            default -> System.out.println("Nothing elase.");
        }
    }

    public void main1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        // String gender = sc.nextLine();

        int age = sc.nextInt();
        if (age < 13) {
            System.out.println("This Student are under the 13.");
        } else {
            System.out.println("This Student are age up to 13.");
        }
    }
}
