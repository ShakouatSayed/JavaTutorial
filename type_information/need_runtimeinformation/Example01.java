package type_information.need_runtimeinformation;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    public void draw() {
        System.out.println(this + ".draw()");
    }
    public abstract String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class Rectangle extends Shape {
    public String toString() {
        return "Rectangle";
    }
}

public class Example01 {
    public static void main(String args[]) {
        List<Shape> li =  Arrays.asList(
            new Circle(), new Triangle(), new Rectangle()
        );
        for(Shape shape : li){
            shape.draw();
        }
    }
}
