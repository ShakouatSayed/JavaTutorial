package type_information.pets.Checking_before_cast;
import java.util.HashMap;
import type_information.pets.Checking_before_cast.pets_animals.*;

public class PetCount {
    static class PetCounter extends HashMap<String, Integer> {
        public void count(String type) {
            Integer quantity = get(type);
            if (quantity == null)
                put(type, 1);
            else
                put(type, quantity + 1);
        }
    }

    public static void petCounts(PetCreator creator) {
        PetCounter petCount = new PetCounter();
        for (IndividualPet pet : creator.createAarray(20)) {
            System.out.println(pet.getClass().getSimpleName() + " ");
            if (pet instanceof IndividualPet)
                petCount.count("pet");
            if (pet instanceof Dog)
                petCount.count("Dog");
            if (pet instanceof Mutt)
                petCount.count("Mutt");
            if (pet instanceof Pugg)
                petCount.count("Pugg");
            if (pet instanceof Cat)
                petCount.count("Cat");
            if (pet instanceof CatEgyptianMau)
                petCount.count("CatEgyptianMau");
            if (pet instanceof CatManx)
                petCount.count("CatManx");
            if (pet instanceof CatManxCymric)
                petCount.count("CatManxCymric");
            if (pet instanceof Rodent)
                petCount.count("Rodent");
            if(pet instanceof Gerbil)
                petCount.count("Gerbil");
            if (pet instanceof Ret)
                petCount.count("Ret");
            if (pet instanceof Mouse)
                petCount.count("Mouse");
            if (pet instanceof Hamster)
                petCount.count("Hamster");
        }
        System.out.println(" ");
        System.out.println(petCount);
    }

    public static void main(String args[]){
        petCounts(new ForNameCreator());
    }
}
