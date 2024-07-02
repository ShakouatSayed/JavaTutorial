package generics.generic_methods.leveraging_type_argument_inference;

import java.util.*;
import type_information.pets.Checking_before_cast.pets_animals.*;

public class Example01 {
    Map<Person, List<? extends IndividualPet>> petPeople = new HashMap<Person, List<? extends IndividualPet>>();

    public static <K, V> Map<K, V> map(){return new HashMap<K, V>();}
    public static <T, U> List<T> list(){return new ArrayList<T>();}
    public static <T> LinkedList<T> lList(){return new LinkedList<T>();}
    public static <T> Set<T> set(){return new HashSet<T>();}
    public static <T> Queue<T> queue(){return new LinkedList<T>();}

    public static void main(String[] args) {
        Map<String, List<String>> sLs = Example01.map();
        List<String> l = Example01.list();
        LinkedList<String> lL = Example01.lList();
        Set<String> s = Example01.set();
        Queue<String> q = Example01.queue();

        System.out.println(sLs.size());
        System.out.println(l.size());
        System.out.println(lL);
        System.out.println(s);
        System.out.println(q);
    }
}
