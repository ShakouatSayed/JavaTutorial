/*
 * Thinking in Java.
 * Exercise Solution 11.
 * 
 * Exercise 11: (2) Add Gerbil to the typeinfo.pets library and modify all the examples in
 * this chapter to adapt to this new class.
 */

package type_information.pets.Using_class_literals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import type_information.pets.Checking_before_cast.Individual;

class Pet extends Individual {
    public Pet(String name) {super(name);}
    public Pet() {super();}
}

class Dog1 extends Pet {
    public Dog1(String name) {super(name);}
    public Dog1() {super();}
}

class Gerbil extends Dog1 {
    public Gerbil(String name) {super(name);}
    public Gerbil() {super();}
}

abstract class PetCreator1 {
    private Random rand = new Random(47);
    
    public abstract List<Class<? extends Pet>> type1();

    public Pet randomPet1() {
        int num = rand.nextInt(type1().size());
        try {
            return type1().get(num).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public Pet[] createArray1(int size) {
        Pet[] pet = new Pet[size];
        for (int i = 0; i < size; i++)
            pet[i] = randomPet1();
        return pet;
    }

    public ArrayList<Pet> arrayList1(int size) {
        ArrayList<Pet> result = new ArrayList<Pet>();
        Collections.addAll(result, createArray1(size));
        return result;
    }
}

class FornameCreator1 extends PetCreator1 {
    private static List<Class<? extends Pet>> type1 = new ArrayList<Class<? extends Pet>>();
    private static String[] type_name = {
            "type_information.pets.Using_class_literals.Pet",
            "type_information.pets.Using_class_literals.Dog1",
            "type_information.pets.Using_class_literals.Gerbil",
    };

    @SuppressWarnings("Unchecked")
    private static void loader1() {
        try {
            for (String name : type_name)
                type1.add((Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader1();
    }

    public List<Class<? extends Pet>> type1() {
        return type1;
    }
}

public class Exercise11 {
    static class PetCounter1 extends HashMap<String, Integer> {
        public void counts(String type) {
            Integer quantity = get(type);
            if (quantity == null)
                put(type, 1);
            else
                put(type, quantity + 1);
        }
    }

    public static void petCount1(PetCreator1 petCreator1) {
        PetCounter1 petCounter1 = new PetCounter1();
        for (Pet pet : petCreator1.createArray1(20)) {
            System.out.println(pet.getClass().getSimpleName());
            if (pet instanceof Pet)
                petCounter1.counts("Pet");
            if (pet instanceof Dog1)
                petCounter1.counts("Dog1");
            if (pet instanceof Gerbil)
                petCounter1.counts("Gerbil");
        }
        System.out.println(" ");
        System.out.println(petCounter1);
    }

    public static void main(String args[]) {
        petCount1(new FornameCreator1());
    }
}
