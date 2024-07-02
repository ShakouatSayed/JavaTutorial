/*
 * Thinking in Java
 * Exercise Solution 04:
 * Exercise 4: Modify the previous exercise so that it uses instanceof to check
 * the type
 * before performing the downcast.
 */

package type_information.need_runtimeinformation;

import java.util.Arrays;
import java.util.List;

abstract class Shape02{
    void draw(){
        System.out.println(this+".draw()");
    }
    abstract public String toString();
}

class Circle02 extends Shape02{
    public String toString(){
        return "Circle";
    }
}

class Triangle02 extends Shape02{
    public String toString(){
        return "Triangle";
    }
}

class Squear02 extends Shape02{
    public String toString(){
        return "Square";
    }
}

class Rhomboid02 extends Shape02{
    public String toString(){
        return "Rhomboid";
    }
}

public class Exercise04 {
    public static void main(String args[]){
        List<Shape02> shape_list = Arrays.asList(
            new Circle02(), new Triangle02(), new Rhomboid02(), new Squear02()
        );

        for(Shape02 shape02 : shape_list)
            shape02.draw();

        System.out.println("\nUpcusting the Shape02.");
        Rhomboid02 r = new Rhomboid02();
        Shape02 s = (Shape02)r;
        s.draw();

        System.out.println("\nCheck the Type.");
        if(s instanceof Squear02)
            ((Squear02)s).draw();
        else if(!(s instanceof Squear02))
            System.out.println("(Shape).r are not this type.\n");
    }
}
