package generics.issues;

import java.util.Random;
import generics.generic_interfaces.coffee.Generator;

/**
 * PrimitiveGenericType
 */
    class RandomStringGenerator implements Generator<String>{
        private  static final String s = "sayed";
        private Random rand = new Random();
        private int length;

        public RandomStringGenerator(int length){this.length = length;}

        @Override
        public String next(){
            StringBuilder stringBuilder  = new StringBuilder();
            for(int i = 0; i < length; i++)
                stringBuilder.append(s.charAt(rand.nextInt(s.length())));
            return s.toString();
        }
    }

    class RandomIntegerGenerator implements Generator<Integer>{
        private Random rand = new Random();
        @Override
        public Integer next(){
            
            return rand.nextInt(10);
        }
    } 

public class PrimitiveGenericType {

    public static void main(String[] args) {
        String[] strings = FArray.fill(new String[10], new RandomStringGenerator(10));
        for(String s : strings)
            System.out.println(s);
        Integer[] integers = FArray.fill(new Integer[10], new RandomIntegerGenerator());
        for(Integer i : integers)
            System.out.println(i);
    }
}