/*
 * Thinking in Java
 * Exercise Solution 07:
 * Exercise 7: Modify SweetShop.java so that each type of object creation is
 * controlled by a command-line argument. That is, if your command line is "Java
 * Sweetshop
 * Candy," then only the Candy object is created. Notice how you can control
 * which Class
 * objects are loaded via the commandline argument.
 */

package type_information.need_runtimeinformation;

class Candys {
    static  {
        System.out.println("Candy.\n");
    }
}

class Sweets {
    static {
        System.out.println("Sweet.\n");
    }
}

class Stawberry {
    static {
        System.out.println("Stawberry.\n");
    }
}

public class Exercise07 {
    public static void main(String args[]) {
        
        // System.out.println("Argument Count: "+args.length);
        // for(int i = 0; i < args.length; i++ ){
        //     System.out.println("Argument: "+i+"Argument Array: "+args[i]);
        // }

        // System.out.println("\nAfter Opening Fruit Shop.");
        // new Candys();

        if(args.length < 1){
            System.out.println("Uses the argument.");
            System.exit(0);
        }
        
        System.out.println("\nCreate a class for Argument.");
        Class c = null;
        try{
            c = Class.forName(args[0]);
        }catch(ClassNotFoundException e){
            System.out.println("Class could not found."+args[0]);
            System.exit(0);
        }

        // System.out.println("Cloesing Fruit Shop.");
        // new Stawberry();
    }
}
