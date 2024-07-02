/*
 * Thinking in Java.
 * Exercis Solution 03:
 * 
 * Exercise 3: Add Rhomboid to Shapes.java. Create a Rhomboid, upcast it to a
 * Shape, then downcast it back to a Rhomboid. Try downcasting to a Circle and
 * see what
 * happens.
 * 
 */

package type_information.need_runtimeinformation;

import java.util.Arrays;
import java.util.List;

abstract class Shape01{
    void draw(){
        System.out.println(this+".draw()");
    }

    abstract public String toString();
}

class Circle01 extends Shape01{
    public String toString(){
        return "Circle";
    }
}

class Triangle01 extends Shape01{
    public String toString(){
        return "Triangle";
    }
}


class Squear01 extends Shape01{
    public String toString(){
        return "Squear";
    }
}

class Rhomboid extends Shape01{
    public String toString(){
        return "Rhomboid";
    }
}

public class Exercise03 {
    public static void main(String args[]) {
        //upcusting 

        List<Shape01> shape_list = Arrays.asList(
            new Circle01(), new Triangle01(), new Squear01(), new Rhomboid()
        );

        //downcusting the back to the specific shape.
        for(Shape01 shape : shape_list)
            shape.draw();

        //another example 
        System.out.println("\nRhomboid another method of downcusting.");
        Rhomboid r = new Rhomboid();
        ((Shape01)r).draw();

        //inconvertible type
        //((Circle01)r).draw();


        //upcusting
        System.out.println("\nUpcusting.");
        Shape01 sh = new Rhomboid();
        sh.draw();

        //downCusting
        System.out.println("\nDowncusting.");
        Rhomboid rh = (Rhomboid)sh;
        rh.draw();


    }
}
