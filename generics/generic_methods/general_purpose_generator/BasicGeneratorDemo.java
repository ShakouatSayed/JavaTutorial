package generics.generic_methods.general_purpose_generator;

import generics.generic_interfaces.coffee.Generator;

public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for(int i = 0; i <= 5; i++){
            System.out.println(gen.next() + " ");
        }
    }
}
