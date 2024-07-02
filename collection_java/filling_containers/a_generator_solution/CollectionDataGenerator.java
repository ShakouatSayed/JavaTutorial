package collection_java.filling_containers.a_generator_solution;

import java.util.ArrayList;
/**
 * CollectionDataGenerator
 */
public class CollectionDataGenerator {
    public static void main(String[] args) {
        System.out.println(new ArrayList<String>(CollectionData.list(new RandomGenerator.StringGenerator(10), 15)));
        System.out.println(new ArrayList<Integer>(CollectionData.list(new RandomGenerator.IntegerGenerator(), 15)));
    }

}