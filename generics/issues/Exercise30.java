/* Exercise 30: (2) Create a Holder for each of the primitive wrapper types, and show that
autoboxing and autounboxing works for the set( ) and get( ) methods of each instance. */

package generics.issues;

import generics.Wildcards.Holders;

public class Exercise30 {
    public static void main(String[] args) {
        Holders<Character> charH = new Holders<Character>();
        Holders<Byte> byteH = new Holders<Byte>();
        Holders<Short> shortH = new Holders<Short>();
        Holders<Integer> integerH = new Holders<Integer>();
        Holders<Long> longH = new Holders<Long>();
        Holders<Float> floatH = new Holders<Float>();
        Holders<Double> doubleH = new Holders<Double>();

        charH.setHolders('a');

        byte b = 1;
        byteH.setHolders(b);

        short s = 2;
        shortH.setHolders(s);

        integerH.setHolders(4);

        long l = 4;
        longH.setHolders(l);

        float f = 5.0f;
        floatH.setHolders(f);

        double d = 6.0;
        doubleH.setHolders(d);

        @SuppressWarnings("rawtypes")

        Holders[] holders = new Holders[] { charH, byteH, shortH, integerH, longH, floatH, doubleH };

        System.out.println("Holders contain : ");
        for (Holders h : holders)
            System.out.print(h.getHolders().getClass().getSimpleName() + " : " + h.getHolders() + ", ");

        char cc = charH.getHolders();
        byte bb = byteH.getHolders();
        short ss = shortH.getHolders();
        int ii = integerH.getHolders();
        long ll = longH.getHolders();
        float ff = floatH.getHolders();
        double dd = doubleH.getHolders();

        System.out.println();
        System.out.println("char cc = charH.getHolders(), "+"cc = "+cc);
        System.out.println("byte bb = byteH.getHolders(), "+"bb ="+bb);
        System.out.println("short ss = shortH.getHolders(), "+"ss ="+ss);
        System.out.println("int ii = integersH.getHolders(), "+"ii ="+ii);
        System.out.println("long ll = longH.getHolders(), "+"ll ="+ll);
        System.out.println("float ff = floatH.getHolders(), "+"ff ="+ff);
        System.out.println("double dd = doubleH.getHolders(), "+"dd ="+dd);
    }
}

/*
 * Output:
 * Holders contain:
 * Character: a, Byte: 1, Short: 2, Integer: 3, Long: 4, Float: 5.0, Double:
 * 6.0,
 * 
 * char cc = charH.get(), cc = a
 * byte bb = byteH.get(), bb = 1
 * short ss = shortH.get(), ss = 2
 * int ii = intH.get(), ii = 3
 * long ll = longH.get(), ll = 4
 * float ff = floatH.get(), ff = 5.0
 * double dd = doubleH.get(), dd = 6.0
 */