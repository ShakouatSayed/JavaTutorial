package generics.dynamic_type_safety;

import java.util.*;

import type_information.pets.Checking_before_cast.pets_animals.*;

/**
 * ChackedList
 */
public class ChackedList {

    @SuppressWarnings("unchecked")
    static void oldStyleMethod(List probablyDog){
        probablyDog.add(new Cat());
    }

    public static void main(String[] args) {
        List<Dog> dogs1 = new ArrayList<Dog>();
        oldStyleMethod(dogs1);

        List<Dog> dogs2 = Collections.checkedList(new ArrayList<Dog>(), Dog.class);

        try{oldStyleMethod(dogs2);}catch(Exception e){System.out.println(e);}

        List<IndividualPet> pets = Collections.checkedList(new ArrayList<IndividualPet>(), IndividualPet.class);
        pets.add(new Dog());
        pets.add(new Cat());
    }
}