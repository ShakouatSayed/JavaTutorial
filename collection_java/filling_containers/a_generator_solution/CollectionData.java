package collection_java.filling_containers.a_generator_solution;

import java.util.*;

import generics.generic_interfaces.coffee.Generator;

public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int quantity){
        for(int i = 0; i < quantity; i++)
            add(gen.next());
    }

    //create covarience method
    public static <T> CollectionData<T> list(Generator<T> gen, int quantity){
        return new CollectionData<>(gen, quantity);
    }
}
