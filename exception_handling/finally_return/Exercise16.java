/*
 Thinking in Java.
 Exercise Solution 16: 
 
 Exercise 16: Modify reusing/CADSystem.java to demonstrate that returning
 from the middle of a try-finally will still perform proper cleanup. 
 */

package exception_handling.finally_return;

class Shape {
    Shape(int i) {
        System.out.println("Shape constractor.");
    }

    void dispose() {
        System.out.println("Write a Shape Class in method is dispose().");
    }
}

class CricleO1 extends Shape {
    CricleO1(int i) {
        super(i);
        System.out.println("This is Circle Constractor.");
    }

    void dispose() {
        System.out.println("In the write of Cricle class in despose method.");
        super.dispose();
    }

}

class Trinangle extends Shape {
    Trinangle(int i) {
        super(i);
        System.out.println("This is Trinangle Constractor.");
    }

    void dispose() {
        System.out.println("In the write of Trinangle class in despose method.");
        super.dispose();
    }

}

class Line extends Shape {
    private int start, end;

    Line(int start, int end) {

        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Line Constractor: " + start + " End is: " + end);
    }

    void dispose() {
        System.out.println("In the write of Line class in despose method.");
        super.dispose();
    }

}

class CDASystem extends Shape {
    private CricleO1 c;
    private Trinangle t;
    private Line line[] = new Line[3];

    CDASystem(int i) {
        super(i + 1);
        c = new CricleO1(1);
        t = new Trinangle(1);
        for (int j = 0; j < line.length; j++)
            line[j] = new Line(j, j * j);
        System.out.println("Conbined Constractor.");
    }

    void dispose() {
        c.dispose();
        t.dispose();
        for (int i = line.length - 1; i >= 0; i--)
            line[i].dispose();
        ;
        super.dispose();
    }
}

public class Exercise16 {

    public static void main(String args[]) {
        try {
            CDASystem cda = new CDASystem(1);
            return;
        } finally {
            System.out.println("The finally block is running...!");
        }
    }
}
