/* How Static block working in java Program */
package problem_solving_question;
import java.lang.*;
/* 
public class StaticBlockWorking {
    static{
        System.out.println("Static block is execute before main method.");
    }
    public static void main(String[] args) {
        System.out.println("How to work in static block ..");
    }
}
 */
//static block Application .... we need to open program in specific window 

/**
 * StaticBlockWorking
 */
public class StaticBlockWorking {

    static{
        String OS = System.getenv("OS");
        if(OS.equals("Windows NT") != true)
            System.exit(1);
    }
    public static void main(String[] args) {
        System.out.println("We are using Window_NT operating system.");
    }
}
