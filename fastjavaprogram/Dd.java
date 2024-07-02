/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastjavaprogram;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class Dd {
    public static void main(String[] args) {
        int temp = 50;
        if (temp < 60) {
            System.out.println("It is cold outside");
        } else if ((temp > 60) && (temp < 80)) {
            System.out.println("It is outside warm");
        } else if ((temp < 80) && (100 > temp)) {
            System.out.println("It is very hard warm outside");
        } else {
            System.out.println("It is extremly hot outside");
        }
    }

    public void main1() {
        String day = "morning";
        switch (day) {
            case "morning" -> System.out.println("Good Morning");
            case "afternoon" -> System.out.println("Good Afternoon");
            case "Evening" -> System.out.println("Good Evening");
            default -> System.out.println("Good night");
        }
    }

}
