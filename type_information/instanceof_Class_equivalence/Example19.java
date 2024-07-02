/*
 * Thinking in Java.
 * Exercise Solution 19:
 * 
 * Exercise 19: (4) In ToyTest.java, use reflection to create a Toy object using
 * the nondefault constructor.
 */

package type_information.instanceof_Class_equivalence;

import java.lang.reflect.InvocationTargetException;

interface HasBeteries1{};
interface Waterproof1{};
interface Shoots1{};

class Toy1{
    public Toy1(int i){System.out.println("Costructor Toy("+ i +")");};
}

class FancyToy1 extends Toy1 implements HasBeteries1, Waterproof1, Shoots1{
    public FancyToy1(){super(1);};
}

public class Example19{
    static void printInfo1(Class c){
        System.out.println("Get Name: "+c.getName()+"Get Interface: "+"["+c.isInterface()+"]");
        System.out.println("Get Simple Name: "+c.getSimpleName());
        System.out.println("Get Canonical Name: "+c.getCanonicalName());
    }
    public static void main(String args[]){
        Class c1 = null;
        try{
           Toy1.class.getDeclaredConstructor(int.class).newInstance(1);
        }catch(InstantiationException e){
            throw new RuntimeException(e);
        }catch(IllegalAccessException e){
            throw new RuntimeException(e);
        }catch(InvocationTargetException e){
            throw new RuntimeException(e);
        }catch(NoSuchMethodException e){
            throw new RuntimeException(e);
        }
    }
 }



