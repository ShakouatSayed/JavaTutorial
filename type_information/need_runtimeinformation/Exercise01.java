/*
 * Thinking in Java.
 * Exercise Solution 01:
 * Exercise 1: In ToyTest.java, comment out Toy’s default constructor and
 * explain
 * what happens.
 */

package type_information.need_runtimeinformation;

interface HasBeterie{}
interface Waterproofs{}
interface Shoot{}

class Toys{
   // Toys(){}
    Toys(int i){}
}

class FancyToy extends Toys implements HasBeterie, Waterproofs, Shoot{
    FancyToy(){super(1);}
}

public class Exercise01 {
    static void printInfos(Class cc){
        System.out.println("Get Name: "+cc.getName()+" Get Interface: ["+cc.isInterface()+"]");
        System.out.println("Get Simple Name: "+cc.getSimpleName());
        System.out.println("Get Conincal Name: "+cc.getCanonicalName());
    }
    public static void main(String args[]) {

        Class c = null;
        try{
            Class.forName("type_information.need_runtimeinformation.FancyToy");
        }catch(ClassNotFoundException e){
            System.out.println("Class not found.");
            System.exit(1);
        }

        printInfos(c);
        for(Class space : c.getInterfaces())
            printInfos(space);
        
        Class up = c.getSuperclass();
        Object obj = null;

        try{
            obj = up.newInstance();
        }catch(InstantiationException e){
            System.out.println("Can not instant.");
            System.exit(1);
        }catch(IllegalAccessException e){
            System.out.println("Can not access.");
            System.exit(1);
        }

        printInfos(obj.getClass());
    }
}
