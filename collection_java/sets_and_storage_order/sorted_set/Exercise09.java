/* Exercise 9: (2) Use RandomGenerator.String to fill a TreeSet, but use alphabetic
ordering. Print the TreeSet to verify the sort order.  */

package collection_java.sets_and_storage_order.sorted_set;

import java.util.*;

import collection_java.filling_containers.a_generator_solution.RandomGenerator;
import generics.generic_interfaces.coffee.Generator;

public class Exercise09 {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        Generator<String> generator = new RandomGenerator.StringGenerator(3);
        for(int i = 0; i < 10; i++){
            strings.add(generator.next());
        }
        System.out.println("String Generator: " + strings);
    }
}
