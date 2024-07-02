/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastjavaprogram;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
class Vhical {
    public static int speed = 10;

    public static void Brand() {
        System.out.println("We provide international brand");
    }
}

class Vhical1 extends Vhical {
    public static String brand = "BMW";

    public static void Brand() {
        System.out.println("We provide international brand is: " + brand);
    }
}

class AR4 extends Vhical1 {
    public void ColorDetac() {
        String color = "orange";
        switch (color) {
            case "purple" -> System.out.println("Purple conveys royalty, nobility & wisdom");
            case "orange" -> System.out.println("Orange conveys energy, warmth and flamboyancy");
            case "blue" -> {
                System.out.println("Blue conveys peace, tranquility and security");
            }
            case "gray" -> System.out.println("Gray conveys roylty, pace and wisdom ");
            default -> {
                System.out.println("I don't no what that color conveys, sorry");
            }
        }
    }
}

class AR5 extends AR4 {
    char size = 'l';

    public void Char() {
        switch (size) {
            case 'l' -> System.out.println("Large");
            case 'm' -> System.out.println("Medium");
            default -> System.out.println("Small");
        }
    }
}

class AR6 extends AR5 {
    public void random_num() {
        char RandomNumber = '4';
        switch (RandomNumber) {
            case '1' -> System.out.println("The number is 1");
            case '2' -> System.out.println("The number is 2");
            case '3' -> System.out.println("The number is 3");
            default -> System.out.println("The number is 4");
        }
    }

    public void ic() {
        int number = 5;
        char letter = 'L';
        if ((number == 5) && (letter == 'L')) {
            System.out.println("Both the number and the letter matched");
        } else {
            System.out.println("Something did not match!");
        }
    }

    public void ics() {
        int number = 5;
        char letter = 'S';
        String Word = "Chakaria";
        if ((number == 5) && (letter == 'S') && ("Chakaria".equals(Word))) {
            System.out.println("Both the Number, Letter, and Word are matched");
        } else {
            System.out.println("Something did not match!");
        }
    }
}

public class Inheri1 extends AR6 {
    public static void main(String[] args) {
        System.out.println(speed);
        System.out.println(brand);
        Brand();
        AR4 a = new AR4();
        a.ColorDetac();
        AR5 b = new AR5();
        b.Char();
        System.out.println("The value is: " + b.size);
        AR6 c = new AR6();
        c.random_num();
        c.ic();
        c.ics();
    }
}
