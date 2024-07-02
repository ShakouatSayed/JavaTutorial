/* 
Exercise 40: (3) Add a speak( ) method to all the pets in typeinfo.pets. Modify
Apply.java to call the speak( ) method for a heterogeneous collection of Pet.  */

package generics.compensating_for_the_lack_latent_typing.applying_method_a_sequence;

import java.lang.reflect.*;
import java.util.*;

import type_information.pets.Checking_before_cast.pets_animals.*;
import type_information.pets.Using_class_literals.Pets;

/**
 * Exercise40
 */

class ApplyOne {
    public static <T, S extends Iterable<? extends T>> void apply(S seq, Method f, Object... args) {
        try {
            for (T t : seq)
                f.invoke(t, args);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class FieldListOne<T> extends ArrayList<T> {
    public FieldListOne(Class<? extends T> type, int size) {
        try {
            for (int i = 0; i < 5; i++) {
                add(type.newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

public class Exercise40 {
    public static void main(String[] args)throws Exception {
        List<IndividualPet> petList = Pets.arrayList(5);
        System.out.println("Random pets: "+petList);
        ApplyOne.apply(petList, IndividualPet.class.getMethod("speak"));
        ApplyOne.apply(new FieldListOne<Dog>(Dog.class, 5), Dog.class.getMethod("speak"));
    }
}