package type_information.pets.Checking_before_cast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import type_information.pets.Checking_before_cast.pets_animals.IndividualPet;

public abstract class PetCreator{
    private Random rand = new Random(47);
    //list of different types pet create.
    public abstract List<Class<? extends IndividualPet>>types();
    public IndividualPet randomPet(){
        int n = rand.nextInt(types().size());
        try{
            return types().get(n).newInstance();
        }catch(InstantiationException e){
            throw new  RuntimeException(e);
        }catch (IllegalAccessException e){
            throw new RuntimeException(e);
        }
    }

    public IndividualPet[] createAarray(int size){
        IndividualPet[] new_array = new IndividualPet[size];
        for(int i = 0; i < size; i++)
            new_array[i] = randomPet();
        return new_array;
    }

    public ArrayList<IndividualPet> arryList(int size){
        ArrayList<IndividualPet> result = new ArrayList<IndividualPet>();
        Collections.addAll(result, createAarray(size));
        return result;
    }
}