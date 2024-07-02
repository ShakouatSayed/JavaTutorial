package collection_java.filling_containers.a_generator_solution;

import java.util.Random;
import generics.generic_interfaces.coffee.Generator;

public class RandomGenerator {
    public static class StringGenerator implements Generator<String>{
        private int length;
        private Random rand = new Random(3);
        public StringGenerator(int length){this.length = length;}

        public String next(){
            char[] buffer = new char[length];
            for(int i = 0; i < length; i++)
                buffer[i] = (char) ('a'+rand.nextInt(26));
            return new String(buffer);
        }
    }

    public static class IntegerGenerator implements Generator<Integer>{
        private Random rand = new Random();
        public Integer next(){
            return rand.nextInt(5555);
        }
    }
}
