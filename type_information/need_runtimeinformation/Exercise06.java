/*
 * Thinking in Java.
 * Exercise Solution 06:
 * 
 * Exercise 6: Modify Shapes.java so that it can "highlight" (set a flag in) all
 * shapes of
 * a particular type. The toString( ) method for each derived Shape should
 * indicate whether
 * that Shape is "highlighted."
 */

package type_information.need_runtimeinformation;

import java.util.Arrays;
import java.util.List;

abstract class Shapes01{
    void drow(){
        System.out.println(this+".drow");
    }

    abstract public String toString();
}

class Circles01 extends Shapes01{
    boolean flag = true;
    public String toString(){
        return (flag ?"H ": " Uhh ")+" Highlite "+" Circle";
    }
}

class Triangels01 extends Shapes01{
    boolean flag = true;
    public String toString(){
        return (flag ?"H ": " Uhh ")+" Highlite "+" Triangle";
    }
}

class Squars01 extends Shapes01{
    boolean flag = true;
    public String toString(){
        return (flag ?"H ": " Uhh ")+" Highlite "+" Square01";
    }
}

public class Exercise06 {
    public static void flag(Shapes01 s){
        if(s instanceof Triangels01)
            ((Triangels01)s).flag= true;
            System.out.println(s+"\nUse the flag.");
    }
    public static void main(String args[]){
        List<Shapes01> shapes_list = Arrays.asList(new Circles01(), new Squars01(), new Triangels01());
        System.out.println("\nUPcusting : \n");

        for(Shapes01 shapes01 : shapes_list){
            flag(shapes01);
            System.out.println(shapes01+"\n"); 
        }   
    }
}
