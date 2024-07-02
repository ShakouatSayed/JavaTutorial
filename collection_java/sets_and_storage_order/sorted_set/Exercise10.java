/* Exercise 10: (7) Using a LinkedList as your underlying implementation, define your
own SortedSet. */

package collection_java.sets_and_storage_order.sorted_set;

import java.util.*;
import collection_java.filling_containers.a_generator_solution.RandomGenerator;
import collection_java.filling_containers.using_abstract_classes.Exercise05;
import exception_handling.exception_specification.Exercise08;
import generics.Simple_generics.A_tuple_library.Exercise03;
import generics.generic_interfaces.coffee.Generator;
import type_information.need_runtimeinformation.Exercise04;

class SortedSets<T> extends LinkedList<T> {
    public int compare(T t1, T t2) {
        int numSubtract = t1.hashCode() - t2.hashCode();
        return numSubtract < 0 ? -1 : (numSubtract < 0 ? 0 : 1);
    }

    public boolean add(T t) {
        if (!this.contains(t)) {
            Iterator<T> iterator = this.iterator();
            int index = 0;
            while (iterator.hasNext()) {
                if (compare(iterator.next(), t) < 1)
                    index++;
            }
            add(index, t);
            return true;
        }
        return false;
    }
}

public class Exercise10 {
    public static void main(String[] args) {
        Random rand = new Random();
        SortedSets<Integer> sortedSets = new SortedSets<>();
        for (int i = 0; i < 10; i++) {
            sortedSets.add(rand.nextInt(30));
            
        }
        System.out.println(sortedSets);
        SortedSets<String> strings = new SortedSets<>();
        Generator<String> generator = new RandomGenerator.StringGenerator(3);
        for (int i = 0; i < 10; i++) {
            strings.add(generator.next());
            
        }
        System.out.println(strings);

        SortedSets<Object> classes = new SortedSets<>();
        classes.add(new Exercise10());
        classes.add(new Exercise09());
        classes.add(new Exercise08());
        classes.add(new Exercise05());
        classes.add(new Exercise04());
        classes.add(new Exercise03());
        System.out.println(classes);
    }
}
