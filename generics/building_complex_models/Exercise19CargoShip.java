/* Exercise 19: (2) Following the form of Store.java, build a model of a containerized
cargo ship.  */


package generics.building_complex_models;
import java.util.*;

import generics.generic_interfaces.coffee.Generator;
import generics.generic_methods.generic_method_use_with_Generators.Generators;

class CargoShipProduct{
    private final int id ;
    private String description;
    private String destination;
    private double price;

    public CargoShipProduct(int id2, String description, String destination,   double price){
        id = id2;
        this.description = description;
        this.destination = destination;
        this.price = price;

        System.out.println(toString());
    } 

    public String toString(){
        return id + ", " + description +" price : " + price +" Destination : "+ destination;
    }

    public void priceChange(int change){
        price += change;
    }

    public static Generator<CargoShipProduct> generator = new Generator<CargoShipProduct>() {
        Random rand = new Random();
        public CargoShipProduct next(){
            return new CargoShipProduct(rand.nextInt(100), "test"," Chittagon Port", Math.round(rand.nextDouble()*1000.0)+0.99);
        }
    };
}

class Owner extends ArrayList<CargoShipProduct>{
    public Owner(int nCargoShipProduct){
        Generators.fill(CargoShipProduct.generator, this, nCargoShipProduct);
    }
}

class OwnerAisle extends ArrayList<Owner>{
    public OwnerAisle(int nOnwer, int nCargoShipProduct){
        for(int i = 0; i <= nOnwer; i++){
            add(new Owner(nCargoShipProduct));
        }
    }
} 

class Deak extends ArrayList<OwnerAisle>{
    public Deak(int deakOwner, int nDeakOwerProduct, int quantity){
        for(int i = 0; i <= deakOwner; i++){
            add(new OwnerAisle(nDeakOwerProduct, quantity));
        }
    }
}

class Apple {}
class Orange{}

public class Exercise19CargoShip extends ArrayList<Deak>{

    public Exercise19CargoShip(int nOnwer, int nOnwerAlisle, int nCargoShipProduct, int deak){
        for(int i = 0; i < nOnwer; i++)
            add(new Deak(nOnwerAlisle, nCargoShipProduct, deak));
    }

    public String toString(){
        StringBuilder result = new StringBuilder();

        for(Deak d: this){
            for(OwnerAisle oA : d){
                for(Owner o : oA ){
                    for(CargoShipProduct cSP : o){
                        result.append(cSP);
                        result.append("\n");
                    }
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Exercise19CargoShip(14, 5, 10, 2));
    }
}
