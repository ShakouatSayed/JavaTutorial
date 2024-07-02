package generics.generic_methods.leveraging_type_argument_inference;

import java.util.*;

import type_information.pets.Checking_before_cast.pets_animals.*;

public class Example03 {
    //limits of Inference
    static void f(Map<Person, List<? extends IndividualPet>> petPeople){}
    public static void main(String[] args) {
        f(Example01.map());
    }
}
