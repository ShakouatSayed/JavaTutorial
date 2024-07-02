package marker_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Customer {
    int roll_num;
    String name;
    String addres;

    public Customer(int roll_num, String name, String adders) {
        this.roll_num = roll_num;
        this.name = name;
        this.addres = adders;
    }

    // getter method
    public Integer getRollNum() {
        return roll_num;
    }

    // setter method
    public void setRollNum(int roll_n0) {
        this.roll_num = roll_n0;
    }

    // getter method
    public String getName() {
        return name;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }

    // getter method
    public String getAddress() {
        return addres;
    }

    // setter method
    public void setAddress(String adderss) {
        this.addres = adderss;
    }

    @Override
    public String toString() {
        return "Customer {" + name + " Roll Number: " + roll_num + " Address: " + addres + "}";
    }
}

class StuentCustomer implements Comparator<Customer> {
    public int compare(Customer StuentCustomer1, Customer StuentCustomer2) {
        int name_compare = StuentCustomer1.getName().compareTo(StuentCustomer2.getName());
        int roll_compare = StuentCustomer1.getRollNum().compareTo(StuentCustomer2.getRollNum());
        int address_compare = StuentCustomer1.getAddress().compareTo(StuentCustomer2.getAddress());
        if (name_compare == 0) {
            return name_compare;
        } else if (address_compare == 0) {
            return address_compare;
        } else {
            return roll_compare;
        }

    }
}

public class ExamplemarInt01 {
    public static void main(String args[]) {
        List<Customer> al = new ArrayList<>();
        Customer OB1 = new Customer(10, "Sayed", "Chakaria");
        Customer OB2 = new Customer(5, "Hossen", "Cox'Sbazar");
        Customer OB3 = new Customer(3, "Mostafa", "Chittagong");
        Customer OB4 = new Customer(1, "Reduan", "Khulna");
        Customer OB5 = new Customer(2, "Karim", "Bagherhat");
        Customer OB6 = new Customer(7, "Jafor", "Rashahi");

        al.add(OB1);
        al.add(OB6);
        al.add(OB2);
        al.add(OB3);
        al.add(OB4);
        al.add(OB5);

        Iterator<Customer> cusIterator = al.iterator();
        while (cusIterator.hasNext()) {
            System.out.println(cusIterator.next());
        }
        System.out.println("After Sorting: ");
        // After Sorting
        Collections.sort(al, new StuentCustomer());
        for (Customer customer : al) {
            System.out.println(customer);
        }
    }
}
