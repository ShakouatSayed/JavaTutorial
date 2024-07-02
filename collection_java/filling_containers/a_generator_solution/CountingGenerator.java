package collection_java.filling_containers.a_generator_solution;

import generics.generic_interfaces.coffee.Generator;

public class CountingGenerator{
    static char[] chars = ("abcdefghijklmnopqrstuvwxyz"+"ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
    public  static class Characters implements Generator<Character>{
        public Character next(){
            int index = -1;
            index = (index + 1) % chars.length;
            return chars[index++];
        }
    }
}

