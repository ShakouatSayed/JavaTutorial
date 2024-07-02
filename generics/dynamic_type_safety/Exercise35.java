
/* Exercise 35: (1) Modify CheckedList.java so that it uses the Coffee classes defined in
this chapter.  */

package generics.dynamic_type_safety;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import generics.generic_interfaces.coffee.Americano;
import generics.generic_interfaces.coffee.Cappuccino;
import generics.generic_interfaces.coffee.Coffee;

public class Exercise35 {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    static void oldStyleMethod(List probablyCoffee){
        probablyCoffee.add(new Cappuccino());
    }

    public static void main(String[] args) {
        List<Americano> americanos1 = new ArrayList<Americano>();
        oldStyleMethod(americanos1);
        
        List<Americano> americanos = Collections.checkedList(new ArrayList<Americano>(), Americano.class);
        try{oldStyleMethod(americanos);}catch(Exception e){System.out.println(e);}

        List<Coffee> coffees = Collections.checkedList(new ArrayList<Coffee>(), Coffee.class);
        coffees.add(new Americano());
        coffees.add(new Cappuccino());
    }
}
