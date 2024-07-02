/*
 * Thinking in Java.
 * Exercise Solution 19:
 * 
 * Exercise 20: (5) Look up the interface for java.lang.Class in the JDK
 * documentation
 * from http://java.sun.com. Write a program that takes the name of a class as a
 * command-line
 * argument, then uses the Class methods to dump all the information available
 * for that class.
 * Test your program with a standard library class and a class you create.
 */

package type_information.instanceof_Class_equivalence;

public class Example20{
    private static String usage = "Usarg: "+
                                  "\nShowMethod qulified.class.name"+
                                  "\nshow information about chosen class.";
    public static void main(String args[]){
        if(args.length < 1){
            System.out.println(usage);
            System.exit(0);
        }

        Class<?> c = null;
        try{
            c = Class.forName(args[0]);
        }catch(ClassNotFoundException e){
            System.out.println("Class is not found.");
        }

        System.out.println("desiredAssertionStatus() : \n"+c.desiredAssertionStatus()+"\n");

    }
}