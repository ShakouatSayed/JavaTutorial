/* Exercise 12: (1) Repeat the previous exercise using explicit type specification.  */


package generics.generic_methods.explicit_type_specification;

import java.util.*;
import generics.generic_methods.leveraging_type_argument_inference.Example01;
import type_information.pets.Checking_before_cast.pets_animals.*;

class AOne{public String toString(){return "A";}}
class BOne{public String toString(){return "B";}}
class COne extends BOne{public String toString(){return "C";}}

public class Exercise12 {
    static void f(Map<Person, List<? extends IndividualPet>> map){};
    
    public static void main(String[] args) {
        AOne a = new AOne();
        BOne b = new BOne();
        COne c = new COne();

        List<COne> lC = Example01.list();
        lC.add(new COne());
        System.out.println(lC);

        Map<AOne, List<? extends BOne>> aList = Example01.map();
        aList.put(a, lC);
        System.out.println(aList);

        LinkedList<BOne> lListB = Example01.lList();
        lListB.add(new BOne());
        System.out.println(lListB);

        Set<AOne> sA = Example01.set();
        sA.add(new AOne());
        System.out.println(sA);

        Queue<COne> qC = Example01.queue();
        qC.add(new COne());
        System.out.println(qC);

        f(Example01.<Person, List<? extends IndividualPet>>map());
    }
}

