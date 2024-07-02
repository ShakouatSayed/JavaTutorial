/*
 * Thinking in Java.
 * Exercise Solution 02:
 * Exercise 2: Create a holder class that holds three objects of the same type,
 * along with
 * the methods to store and fetch those objects and a constructor to initialize
 * all three.
 */


package generics.Simple_generics;

class Robot{
    private String name;
    public Robot(String name){this.name = name;}
    public String toString(){
        return name;
    }
}

class Holders<T>{
    private T x, y, z;
    public Holders(T x, T y, T z){this.x = x;this.y = y; this.z = z;}
    public void set(T x, T y, T z){this.x = x;this.y = y; this.z = z;};
    public T getX(){return x;};
    public T getY(){return y;};
    public T getZ(){return z;};

    public String toString(){
        return x + ", " + y + ", " + z ;
    }
}

public class Exercise02 {
    public static void main(String args[]) {
       Holders<Robot> r = new Holders<Robot>(new Robot("Alex"), new Robot("Gender"), new Robot("Terminator"));
       System.out.println("Holding : "+r);
    }
}
