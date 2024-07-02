/*
 * Thinking in Java.
 * Exercise Solution 16:
 * 
 * Exercise 16: (4) Modify the Coffee hierarchy in the Generics chapter to use
 * Registered
 * Factories.
 */

package type_information.registered_factories;

public class Exercise16_01 {
    public static void main(String args[]){
        for(int i = 0; i < 10; i++){
            System.out.println(CoffeeFactory.createRandom2());
        }
    }
}
