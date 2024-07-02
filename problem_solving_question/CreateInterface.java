/*How to create Interface in java Program*/
package problem_solving_question;

/**
 * InnerCreateInterface
 */
/* interface InnerCreateInterface {
        int x = 22;
        public void detaliPerson();
}

abstract class InnerCreateInterfaceA implements InnerCreateInterface{
    public void detaliPerson(){
        System.out.println("Name: Shakouat Hossen Sayed.");
    }
}

/**
 * InnerCreateInterface_1
 */
/* class InnerCreateInterface_1 {
    public void detaliPerson(){
        System.out.println("Addres: Chakaria");
    }
    
}
public class CreateInterface extends InnerCreateInterfaceA {
    public static void main(String[] args) {
        System.out.println("Creating an interface.");
        CreateInterface create_interface = new CreateInterface();
        create_interface.detaliPerson();
        System.out.println("Age: "+x);

        InnerCreateInterface_1 interf = new InnerCreateInterface_1();
        interf.detaliPerson();
    }
} */

/**
 * CreateInterface
 */
/* interface Animal{
    //interface dose not have a body
    public void animalSound();    
    public void sleep();
}

class Pig implements Animal{

    //the body of animalSound() is provide here
    public void animalSound(){
        System.out.println("The Pig Says : wee wee");
    }

    public void sleep(){
        //the body sleep() is provide here
        System.out.println("Pig sleep sound is: "+"Zzz");
    }
}

class CreateInterface extends Pig{
    public static void main(String[] args) {
        Pig p = new Pig();
        p.animalSound();
        p.sleep();
    }
} */

/**
 * CreateInterface
 */
/* interface FirstInterface {
    public void myMethod();
}

interface SecondInterface{
    public void myAnotherMethod();
}

class DemoClass implements FirstInterface, SecondInterface{
    public void myMethod(){
        System.out.println("Write some txt...");
    }

    public void myAnotherMethod(){
        System.out.println("Write another some txt...");
    }
}

class CreateInterface{
    public static void main(String[] args) {
        System.out.println("Implement the interface.\n");
        DemoClass dc = new DemoClass();
        dc.myMethod();
        dc.myAnotherMethod();
    }
} */


 /**
  * CreateInterface
  */

/* interface Language{
    void getName(String name);
}

//class implement interface 

class ProgrammingLanguage implements Language{
    //implementaion of abstrac method 
    public void getName(String name){
        System.out.println("\nProgramming Language: "+name+"\n");
    }
}

class CreateInterface extends ProgrammingLanguage{
    public static void main(String[] args) {
        ProgrammingLanguage pl = new ProgrammingLanguage();
        pl.getName("Java");
    }
}

 */

 /**
  * CreateInterface
  */
/* interface Polygon {
    void getArea();

    //defult method 
    default void getSides(){
        System.out.println("I can get side of polygon");
    }
 }

 class Rectangle implements Polygon{
    public void getArea(){
        int length = 10;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("The area of the rectangle is "+area);
    }

    //override the getSides() method
    public void getSides(){
        System.out.println("Its have a four sides");
    }
 }

 //implement the interface
 class Square implements Polygon{
    public void getArea(){
        int length = 5;
        int result = length * length;
        System.out.println("Square length is "+result);
    }
 }

 class CreateInterface{
    public static void main(String[] args) {
        System.out.println("\nShow the differance polygons area of Rectangle: ");
        Rectangle r = new Rectangle();
        r.getArea();
        r.getSides();

        System.out.println("\nShow the differance polygons area of Square: ");
        Square s = new Square();
        s.getArea();
        s.getSides();
    }
 } */

 interface Emp1{
    public void display1();
 }

 interface Emp2{
    public void display2();
 }

 //this interface is extended both the above interfaces

 interface Emp3 extends Emp1, Emp2{}

 class Emp4 implements Emp3{
    public void display1(){
        System.out.println("The method is display 1");
    }

    public void display2(){
        System.out.println("The method is display 2");
    }
 }

 class CreateInterface{
    public static void main(String[] args) {
        Emp4 emp = new Emp4();
        emp.display1();
        emp.display2();
    }
 }