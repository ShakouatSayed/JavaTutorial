package generics.generic_methods.explicit_type_specification;

import java.util.*;
import type_information.pets.Checking_before_cast.pets_animals.*;

class A{public String toString(){return "A";}}
class B{public String toString(){return "B";}}
class C extends B{public String toString(){return "C";}}

public class Example01 {
    static void f(Map<Person, List<IndividualPet>> petPeople){};
    
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        System.out.println("Hi");
        f(generics.generic_methods.leveraging_type_argument_inference.Example01.<Person, List<IndividualPet>>map());
    }
}
