package type_information.Class_literals;

import java.util.Random;

class Intiable01 {
    static final int static_final01 = 47;
    static final int static_final02 = Example01.rand.nextInt(1000);
    static {
        System.out.println("Initializing Intiable01.");
    }
}

class Intiable02 {
    static  int static_non_final01 = 247;
    static {
        System.out.println("Initializing Intiable02.");
    }
}

class Intiable03 {
    static  int static_non_final01 = 240;
    static {
        System.out.println("Initializing Intiable03.");
    }
}

public class Example01 {
    public static Random rand = new Random(47);
    public static void main(String args[]) throws Exception{
        System.out.println("After creating Intiable01 Ref.");
        Class intiable01 = Intiable01.class;
        Class intiable02 = Intiable01.class;
        System.out.println("Intiable01: "+intiable01.getName());
        System.out.println("Intiable01: "+intiable02.getClass()+"\n");

        System.out.println("After creating Intiable02 Ref.");
        System.out.println("Intiable02: "+Intiable02.static_non_final01+"\n");

        System.out.println("After creating Intiable03 Ref.");
        System.out.println("Intiable03: "+Intiable03.static_non_final01+"\n");
    }    
}
