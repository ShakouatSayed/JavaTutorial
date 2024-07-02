package collection_java.filling_containers.a_generator_solution;

import java.util.*;

import generics.generic_interfaces.coffee.Generator;

class Government implements Generator<String>{
    String[] foundation = ("Hi, I'm in Government Authrize."+
    " I will do anything action in common public."+" I action in "+
    "the socity in bad people.").split(" ");
    private int index ;
    public String next(){return foundation[index++];}
}

public class CollectionDataTest {
    public static void main(String[] args) {
        
        Set<String> set = new LinkedHashSet<>(new CollectionData<String>(new Government(), 21));
        System.out.println(set);
        //usning the covarience method
        set.addAll(CollectionData.list(new Government(), 21));
        System.out.println(set);
    }
}
