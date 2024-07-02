
package type_information.Generic_class_references;


interface HasBeteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
    Toy(){}
    Toy(int i){}
}

class FancyToys extends Toy implements HasBeteries, Waterproof,Shoots{
    FancyToys (){super(1);}
} 

public class Example03Copy{
    static void printInfo(Class cc){
        System.out.println("Get Name: "+cc.getName()+" Get Insterface: ["+cc.isInterface()+"]");
        System.out.println("Get Simple Name: "+cc.getSimpleName());
        System.out.println("Get Conincal Name: "+cc.getCanonicalName());
    }

    public static void main(String args[]){

        Class c = null;
        try{
            c = Class.forName("type_information.need_runtimeinformation.FancyToys");
        }catch(ClassNotFoundException e){
            System.out.println("Class not found..");
            System.exit(1);
        }

        printInfo(c);
        for (Class space : c.getInterfaces())
            printInfo(space);
            
 
        Class up = c.getSuperclass();
        Object obj = null;

        try{
           obj = up.newInstance();
        }catch(InstantiationException e){
            System.out.println("Can not Instantiat.");
            System.exit(1);
        }catch(IllegalAccessException e){
            System.out.println("Illegal Access Exception.");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
