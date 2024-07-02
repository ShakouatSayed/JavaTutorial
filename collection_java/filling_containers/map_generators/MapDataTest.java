package collection_java.filling_containers.map_generators;

import java.util.Iterator;

import collection_java.filling_containers.a_generator_solution.CountingGenerator;
import collection_java.filling_containers.a_generator_solution.RandomGenerator;

import generics.generic_interfaces.coffee.Generator;

class Latters implements Generator<Pair<Integer, String>>, Iterable<Integer>{
    private int size = 9;
    private int number = 1;
    private char latter = 'A';
    public Pair<Integer, String> next(){
        return new Pair<Integer,String>(number++, " " +latter++);
    }
    

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public Integer next(){return number++;}
            public boolean hasNext(){return number < size;}
            public void remove(){
                throw new UnsupportedOperationException();
            }

        };
    }
}

/**
 * MapDataTest
 */
public class MapDataTest {

    public static void main(String[] args) {
        System.out.println(MapData.map(new Latters(), 11));
        System.out.println(MapData.map(new CountingGenerator.Characters(),new RandomGenerator.StringGenerator(3), 10));
        System.out.println(MapData.map(new CountingGenerator.Characters(), "pop", 3));
        System.out.println(MapData.map(new Latters(), new RandomGenerator.StringGenerator(3)));
        System.out.println(MapData.map(new Latters(), "Dod"));
    }
}
