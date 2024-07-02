package type_information.pets.Checking_before_cast;

import java.util.ArrayList;
import java.util.List;

import type_information.pets.Checking_before_cast.pets_animals.IndividualPet;

public class ForNameCreator extends PetCreator{
    private static List<Class<? extends IndividualPet>>types= new ArrayList<Class<? extends IndividualPet>>();
    //type you went to create randomley
    private static String[] types_name={
        "type_information.pets.Checking_before_cast.pets_animals.CatEgyptianMau",
        "type_information.pets.Checking_before_cast.pets_animals.Cat",
        "type_information.pets.Checking_before_cast.pets_animals.Ret",
        "type_information.pets.Checking_before_cast.pets_animals.Rodent",
        "type_information.pets.Checking_before_cast.pets_animals.Gerbil",
        "type_information.pets.Checking_before_cast.pets_animals.CatManxCymric",
        "type_information.pets.Checking_before_cast.pets_animals.CatManx",
        "type_information.pets.Checking_before_cast.pets_animals.Hamster",
        "type_information.pets.Checking_before_cast.pets_animals.Pugg",
        "type_information.pets.Checking_before_cast.pets_animals.Dog",
        "type_information.pets.Checking_before_cast.pets_animals.Mouse",
    };
    @SuppressWarnings("Unchecked")
    private static void loader(){
        try{
            for(String name:types_name){
                types.add((Class<? extends IndividualPet>)Class.forName(name));
            }
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    static {loader();}
    
    public List<Class<? extends IndividualPet>> types(){
        return types;
    }
}
