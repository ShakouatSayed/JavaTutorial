package generics.building_complex_models;

import java.util.*;
import generics.generic_interfaces.coffee.Generator;
import generics.generic_methods.generic_method_use_with_Generators.Generators;

class Product{
    private final int id ;
    private  String description;
    private double price;

    public Product(int id2, String descrip, double price){
        id = id2;
        description = descrip;
        this.price = price;
        System.out.println(toString());
    }

    public String toString(){
        return id + ", " + description + " Price : " +" $ "+ price;
    }

    public void priceChange(double change){
        price += change;
    }

    public static Generator<Product> generator = new Generator<Product>() {
        Random rand = new Random();
        public Product next(){
            return new Product(rand.nextInt(100), "Test", Math.round(rand.nextDouble()* 1000.0) + 0.99);
        }
    };
}

class Self extends ArrayList<Product>{
    public Self(int nProduct){
        Generators.fill( Product.generator, this, nProduct);
    }
}

class Aisle extends ArrayList<Self> {
    public Aisle(int nSelfs, int nProduct){
        for(int i = 0; i < nSelfs; i++){
            add(new Self(nProduct));
        }
    }
}

class CheckoutStand{}
class Office{};

public class Store extends ArrayList<Aisle> {
    //private ArrayList<CheckoutStand> checkOuts = new ArrayList<CheckoutStand>();
    //private Office office = new Office();

    public Store(int nAisle, int nSelfs, int nProduct){
        for(int i = 0; i < nAisle; i++){
            add(new Aisle(nSelfs, nProduct));
        }
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        for(Aisle a: this){
            for(Self s : a){
                for(Product p : s){
                    result.append(p);
                    result.append("\n");
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Store(14, 5, 10));
    }
}
