/* Exercise 6: (1) Use RandomList with two more types in addition to the one shown in
main( ) */
package generics.Simple_generics.random_list;

import java.util.ArrayList;
import java.util.Random;

import type_information.pets.Checking_before_cast.pets_animals.IndividualPet;
import type_information.pets.Using_class_literals.Pets;

public class Exercise06<T> {
    private ArrayList<T> al = new ArrayList<T>();
    private Random rand = new Random(47);

    public void add(T iteam){
        al.add(iteam);
    }

    public T select(){
        return al.get(rand.nextInt(al.size()));
    }

    public static void main(String[] args) {
        Exercise06<String> ex = new Exercise06<String>();
        for(String s: "Hi, My name is Shakouat Hossen Sayed.".split(" "))
            ex.add(s);
    
        for(int i = 0; i < 11; i++)
            System.out.print(ex.select() + " ");
        
        System.out.println();
        Exercise06<Integer> exOne = new Exercise06<Integer>();
        for(int i = 0; i < 11; i++)
            exOne.add(i);

        for(int i = 0; i < 11; i++)
            System.out.print(exOne.select() + " ");
        System.out.println();

        Exercise06<IndividualPet> exTwo = new Exercise06<IndividualPet>();
        
        for(IndividualPet p: Pets.arrayList(10))
            exTwo.add(p);;

        for(int i = 0; i < 11; i++)
            System.out.print(exTwo.select() + ", ");
        System.out.println();
    }
}
