package type_information.pets.Checking_before_cast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import type_information.pets.Checking_before_cast.pets_animals.*;

public class LiteralPetCreator extends PetCreator {
    @SuppressWarnings("Unchecked")
    public static final List<Class<? extends IndividualPet>> all_types = Collections.unmodifiableList(Arrays.asList(IndividualPet.class, Dog.class,Cat.class, Pugg.class, Mutt.class,CatEgyptianMau.class, CatManx.class, CatManxCymric.class, Ret.class, Mouse.class, Rodent.class, Gerbil.class));
    public static final List<Class<? extends IndividualPet>> new_types = all_types.subList(all_types.indexOf(Mutt.class), all_types.size());
    public  List<Class<? extends IndividualPet>> types(){
        return new_types;
    }

    public static void main(String args[]){
        System.out.println(new_types);
    }
}
