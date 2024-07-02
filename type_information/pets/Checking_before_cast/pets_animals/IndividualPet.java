package type_information.pets.Checking_before_cast.pets_animals;


import type_information.pets.Checking_before_cast.Individual;

public class IndividualPet extends Individual{
    public IndividualPet(String name){super(name);};
    public IndividualPet(){super();}
    public void speak(){System.out.println("Litle Pet say something...!");}
}