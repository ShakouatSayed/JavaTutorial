/*
 * Thinking in Java.
 * Exercise Solution 12.
 * 
 * Exercise 12: (3) Use TypeCounter with the CoffeeGenerator.java class in the
 * Generics
 * chapter.
 */

package type_information.pets.Using_class_literals;

public class Exercise12{
    public static void main(String arg[]){
        TypeCounter tp = new TypeCounter(Coffee1.class);
        for(Coffee1 coffee1 : new CoffeeGenerator1(5)){
            System.out.println(coffee1.getClass().getSimpleName());
            tp.count(coffee1);
        }
        System.out.println(" ");
        System.out.println(tp);
    }
}
