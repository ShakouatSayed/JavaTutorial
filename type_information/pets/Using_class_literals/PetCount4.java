package type_information.pets.Using_class_literals;

import type_information.pets.Checking_before_cast.pets_animals.IndividualPet;

public class PetCount4 {
    public static void main(String args[]){
        CountingRecursively cr = new CountingRecursively(IndividualPet.class);
        for(IndividualPet pet : Pets.createAarray(20)){
            System.out.println(pet.getClass().getSimpleName()+" ");
            cr.count(pet);
        }
        System.out.println();
        System.out.println(cr);
    }
    
}
