package generics.anonymous_inner_classes;
import java.util.*;

import generics.generic_interfaces.coffee.Generator;
import generics.generic_methods.generic_method_use_with_Generators.Generators;

class Customer{
    private static long count = 0;
    private final long id = count++;

    public String toString(){
        return "Customer " + id;
    }

    // A method to produce Generator objects: 
    public static Generator<Customer> generator(){
        return new Generator<Customer>() {
            public Customer next(){
                return new Customer();
            }
        };
    }
}

class Seller{
    private static long count = 1;
    private final long id = count++;

    public String toString(){
        return "Seller " + id;
    }

    //A method generator object 
    public static Generator<Seller> generator(){
        return new Generator<Seller>() {
            public Seller next(){
                return new Seller();
            }
        };
    }
}

public class BankSeller {
    public static void serve(Seller s, Customer c){
        System.out.println(s + " serves " + c);
    }

    public static void main(String[] args) {
        Random rand = new Random();

        Queue<Customer> line = new LinkedList<Customer>();
        Generators.fill(Customer.generator(), line,  17);

        List<Seller> sellers = new ArrayList<Seller>();
        Generators.fill(Seller.generator(), sellers,  4);

        for(Customer c : line)
            serve(sellers.get(rand.nextInt(sellers.size())), c);
    }
}
