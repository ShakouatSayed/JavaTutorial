/* Exercise 41: (1) Modify Fill2.java to use the classes in typeinfo.pets instead of the
Coffee classes.  */

package generics.compensating_for_the_lack_latent_typing.simulating_latent_typing_with_adapters;

import java.util.*;

import generics.generic_interfaces.coffee.Generator;
import type_information.pets.Checking_before_cast.pets_animals.*;

interface AddableOne<T> {void add(T t);}

class FillThree{
    //classToken Version
    public static <T> void fill(AddableOne<T> addableOne, Class<? extends T> classToken, int size){
        for(int i = 0; i < size; i++)
            try{
                addableOne.add(classToken.newInstance());
            }catch(Exception e){
                throw new RuntimeException(e);
            }
    }

    //generator version
    public static <T> void fill(AddableOne<T> addableOne, Generator<T> generator, int size){
        for(int i = 0; i < size; i++){
            addableOne.add(generator.next());
        }
    }
}

class AddableCollectionAdaptorOne<T> implements AddableOne<T>{
    private Collection<T> c;
    public AddableCollectionAdaptorOne(Collection<T> c){this.c = c;}
    public void add(T iteam){c.add(iteam);}
}

class AdaptorOne{
    public static <T> AddableOne<T> collectionAdaptor(Collection<T> c){
        return new AddableCollectionAdaptorOne<T>(c);
    }
}

class AddalbeSimpleQueueOne<T> extends SimpleQueue<T> implements AddableOne<T> {
    public void add(T iteam){super.add(iteam);}
}


public class Exercise41 {
    public static void main(String[] args) {
        List<IndividualPet> individualPetsList = new ArrayList<>();

        //adapt a collection
        FillThree.fill(new AddableCollectionAdaptorOne<IndividualPet>(individualPetsList), Cat.class, 3);
        //hyper method cupture type
        FillThree.fill(AdaptorOne.collectionAdaptor(individualPetsList), Dog.class, 2);

        for(IndividualPet i : individualPetsList)
            System.out.println(i.getClass().getSimpleName());

        System.out.println("---------------");

        //use an adapted class
        AddalbeSimpleQueueOne<IndividualPet> individuaQueue = new AddalbeSimpleQueueOne<>();
        FillThree.fill(individuaQueue, Mouse.class, 3);
        FillThree.fill(individuaQueue, Ret.class, 2);

        for(IndividualPet i : individuaQueue)
            System.out.println(i.getClass().getSimpleName());
    }
}
