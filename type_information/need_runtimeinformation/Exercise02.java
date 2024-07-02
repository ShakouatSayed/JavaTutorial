
/*
 * Thinking in Java.
 * Exercise Solution 02:
 * Exercise 2: Incorporate a new kind of interface into ToyTest.java and verify
 * that it
 * is detected and displayed properly.
 */

package type_information.need_runtimeinformation;

interface HasBateris01{}
interface Waterproofs01{}
interface Shoots01{}
interface HasRun{}

class Toy01 {
   Toy01(){}
   Toy01(int i){}
}

class FancyToy01 extends Toy01 implements HasBateris01, Waterproofs01, Shoots01, HasRun{
    FancyToy01(){super(1);}
}

public class Exercise02 {
    static void printInfo01(Class cc){
        System.out.println("Get Name: "+cc.getName()+" Get Interface: [ "+cc.isInterface() + " ]" );
        System.out.println("Get Simple Name: "+cc.getSimpleName());
        System.out.println("Get Canonical Name: "+cc.getCanonicalName());
    }

    public static void main(String args[]) {
        Class c = null;
        try{
           c =  Class.forName("type_information.need_runtimeinformation.FancyToy01");
        }catch(ClassNotFoundException e){
            System.out.println("Class is not Found.");
            System.exit(1);
        }

        printInfo01(c);
        for(Class space : c.getInterfaces())
            printInfo01(space);

        Class up = c.getSuperclass();
        Object obj = null;

        try{
            obj = up.newInstance();
        }catch(InstantiationException e){
            System.out.println("Instantion Error.");
            System.exit(1);
        }catch(IllegalAccessException e){
            System.out.println("Can not Access.");
            System.exit(1);
        }

        printInfo01(obj.getClass());
    }
}
