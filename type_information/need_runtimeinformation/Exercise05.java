/*
 * Thinking in Java
 * Exercise Solution 05:
 * 
 * Exercise 5: Implement a rotate(Shape) method in Shapes.java, such that it
 * checks to see if it is rotating a Circle (and, if so, doesn’t perform the
 * operation).
 */
 
package type_information.need_runtimeinformation;

import java.util.Arrays;
import java.util.List;

abstract class Shape03{
    void drow(){
        System.out.println(this+".drow()");
    }
    abstract public String toString();
}

class Circle03 extends Shape03{
    public String toString(){
        String s = "Circle";
        return s;
    }
}

class Square03 extends Shape03{
    public String toString(){
        String s = "Square";
        return s;
    }
}

class Triangle03 extends Shape03{
    public String toString(){
        String s = "Triangle";
        return s;
    }
}

public class Exercise05 {
    public static void rotate(Shape03 s){
        if(!(s instanceof Shape03)){
            System.out.println(s+" Rotate");
        }
    }
    public static void main(String args[]){

        //upcusting shape
        List<Shape03> shape_list = Arrays.asList(new Circle03(), new Square03(), new Triangle03());

        //downcusting specific shape
        for(Shape03 shape03 : shape_list)
        shape03.drow();
        System.out.println("\nRotated the Other Shape.\n");
        for(Shape03 shape03: shape_list)
            rotate(shape03);
    }
}

