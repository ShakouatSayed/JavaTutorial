/*
 * Thinking in Java.
 * Exercise Solution 13.
 * 
 * Exercise 13: (3) Use TypeCounter with the RegisteredFactories.java example in
 * this
 * chapter.
 */

package type_information.registered_factories;

import java.util.ArrayList;
import java.util.List;

import type_information.pets.Using_class_literals.CountingRecursively;

public class Exercise13{
    public static void main(String args[]){
        CountingRecursively cr  = new CountingRecursively(Part.class);
        List<Part> list_part = new ArrayList<Part>();
        for(int i = 0; i < 10; i++){
            list_part.add(Part.createRandom());
        }
        for(Part part : list_part){
            System.out.println(part.getClass().getSimpleName());
            cr.count(part);
        }
        System.out.println(" ");
        System.out.println(cr);
    }
}