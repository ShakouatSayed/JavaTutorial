package type_information.pets.Using_class_literals;
import java.util.ArrayList;

import type_information.pets.Checking_before_cast.LiteralPetCreator;
import type_information.pets.Checking_before_cast.PetCreator;
import type_information.pets.Checking_before_cast.pets_animals.IndividualPet;

public class Pets {
    public static final PetCreator creator1 = new LiteralPetCreator();
    
    public static IndividualPet randomPet(){
        return creator1.randomPet();
    }

    public static IndividualPet[] createAarray(int size){
        return creator1.createAarray(size);
    }

    public static ArrayList<IndividualPet> arrayList(int size){
        return creator1.arryList(size);
    }
}
