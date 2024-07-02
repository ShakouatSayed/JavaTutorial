/*
 * Thinking in Java.
 * Exercise Solution 01:
 * 
 * Exercise 1: Use Holders with the typeinfo.pets library to show that a Holders
 * that is specified to hold a base type can also hold a derived type.
 */


package generics.Simple_generics;

import type_information.pets.Checking_before_cast.pets_animals.*;


public class Exercise01<T> {
    private T t;
    public Exercise01(T t){this.t = t;}
    public void set(T t){this.t = t;}
    public T get(){return t;}
    public static void main(String[] args) {
        IndividualPet iP = new IndividualPet();
        Exercise01<IndividualPet> ex = new Exercise01<IndividualPet>(iP);
        IndividualPet a = ex.get();

        ex.set(new IndividualPet("Many Pet under list."));
        System.out.println(ex.get());

        ex.set(new Dog("Tunder"));
        System.out.println(ex.get());

        ex.set(new Rodent("Alex"));
        System.out.println(ex.get());

        ex.set(new Gerbil("Gebriel"));
        System.out.println(ex.get());
    }
}