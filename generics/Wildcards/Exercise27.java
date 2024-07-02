
/* Exercise 27: (2) Show that covariance doesn’t work with Lists, using Numbers and
Integers, then introduce wildcards.  */

package generics.Wildcards;

import java.util.*;

public class Exercise27 {

    @SuppressWarnings("removal")
    public static void main(String[] args) {
        
        List<? extends Number> numbers = new ArrayList<Integer>() ;
        numbers.add(null);
        Number n = numbers.get(0);
        System.out.println(n);


        Integer[] i = new Integer[5];

        i[0] = new Integer(1);
        i[1] = new Integer(2);
        i[2] = new Integer(3);
        i[3] = new Integer(4);
        i[4] = new Integer(5);
        
        for(Number number : i)
            System.out.print(number+" ");

    }
}
