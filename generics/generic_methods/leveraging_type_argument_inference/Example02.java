package generics.generic_methods.leveraging_type_argument_inference;

import java.util.*;

import type_information.pets.Checking_before_cast.pets_animals.*;

public class Example02 {
    public static void main(String[] args) {
        Map<Person, List<? extends IndividualPet>> petPeople = Example01.map();
        List<Person> listPeople = Example01.list();
        LinkedList<Person> lListPeople = Example01.lList();
        Set<Person> setPeople = Example01.set();
        Queue<Person> queuePeople = Example01.queue();
        System.out.println(petPeople);
        System.out.println(lListPeople);
        System.out.println(setPeople);
        System.out.println(listPeople);
        System.out.println(queuePeople);

    }
}
