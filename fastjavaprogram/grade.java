/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastjavaprogram;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class grade {
    public static void main(String args[]) {
        int number = 10;
        String grade;
        if (number > 80) {
            grade = "A+";
        } else if (number > 70) {
            grade = "A";
        } else if (number > 60) {
            grade = "B";
        } else if (number > 50) {
            grade = "C";
        } else if (number > 40) {
            grade = "D";
        } else if (number > 33) {
            grade = "Pass";
        } else {
            grade = "Fail";
        }
        System.out.println("Your grade is: " + grade);
    }
}
