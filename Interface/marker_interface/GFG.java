package marker_interface;

import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
/**
 *
 * @author SHAKOUAT HOSSEN
 */
class Student {

    int roll_no;
    String name, address;

    public Student(int roll_no, String name, String address) {
        this.roll_no = roll_no;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return "Roll no: " + roll_no + " Name: " + name + " Address: " + address;
    }
}

class SortByRoll implements Comparator<Student> {

    public int compare(Student a, Student b) {
        return a.roll_no - b.roll_no;
    }
}

class SortByName implements Comparator<Student> {

    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

class SortByAddress implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.address.compareTo(b.address);
    }
}

public class GFG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Student> arl = new ArrayList<>();

        arl.add(new Student(10, "Sayed", "Chakaria"));
        arl.add(new Student(5, "Hossen", "Cox'sBazar"));
        arl.add(new Student(6, "Mostafa", "Chittagong"));
        arl.add(new Student(15, "Hanif", "Dhaka"));
        // TODO code application logic here

        System.out.println("Unshorted");
        for (int i = 0; i < arl.size(); i++) {
            System.out.println(arl.get(i));
        }

        System.out.println("Sorted By roll ");

        Collections.sort(arl, new SortByRoll());

        for (int i = 0; i < arl.size(); i++) {
            System.out.println(arl.get(i));
        }

        System.out.println("Sort By Name: ");
        Collections.sort(arl, new SortByName());

        for (int i = 0; i < arl.size(); i++) {
            System.out.println(arl.get(i));
        }

        System.out.println("Sort by address. ");
        Collections.sort(arl, new SortByAddress());
        for (int i = 0; i < arl.size(); i++)
            System.out.println(arl.get(i));

        // System.out.println("Sayed");

    }
}
