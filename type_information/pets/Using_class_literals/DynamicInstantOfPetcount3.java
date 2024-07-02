package type_information.pets.Using_class_literals;

import java.nio.channels.FileChannel.MapMode;
import java.util.LinkedHashMap;
import java.util.Map;

import type_information.pets.Checking_before_cast.PetCount;
import type_information.pets.Checking_before_cast.pets_animals.IndividualPet;

public class DynamicInstantOfPetcount3 {

    static class PetCounter extends LinkedHashMap<Class<? extends IndividualPet>, Integer> {
        public PetCounter() {
            //super(MapData.map(LiteralPetCreator.all_types, 0));
        }

        public void count(IndividualPet pet) {
            // class isInstantof eliminate
            for (Map.Entry<Class<? extends IndividualPet>, Integer> pair : entrySet())
                if (pair.getKey().isInstance(pet))
                    put(pair.getKey(), pair.getValue() + 1);

        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            for (Map.Entry<Class<? extends IndividualPet>, Integer> pair : entrySet()) {
                sb.append(pair.getKey().getSimpleName());
                sb.append("=");
                sb.append(pair.getValue());
                sb.append(",");
            }
            sb.delete(sb.length() - 2, sb.length());
            sb.append("}");
            return sb.toString();
        }
    }

    public static void main(String args[]) {
        PetCounter pc = new PetCounter();
        for (IndividualPet pet : Pets.createAarray(20)) {
            System.out.println(pet.getClass().getSimpleName() + "");
            pc.count(pet);
        }
        System.out.println();
        System.out.println(pc);
    }
}
