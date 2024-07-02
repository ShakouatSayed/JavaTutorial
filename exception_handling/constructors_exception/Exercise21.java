/*
 * Thinking in Java.
 * Exercise Solution 21:
 * 
 * Exercise 21: Demonstrate that a derived-class constructor cannot catch exceptions
 * thrown by its base-class constructor.
 * 
 */

package exception_handling.constructors_exception;

class ConstructionExecption01 extends Exception {
}

class NeedCleanUp01 {
    public NeedCleanUp01() throws ConstructionExecption01 {
        throw new ConstructionExecption01();
    }
}

class NeedCleanUp02 extends NeedCleanUp01 {
    public NeedCleanUp02() throws ConstructionExecption01 {
        super();
    }
}

public class Exercise21 {
    public static void main(String args[]) {
        try {
            NeedCleanUp01 n1 = new NeedCleanUp01();
        } catch (ConstructionExecption01 e) {
            System.out.println("Base Class constractor is constractor.");

        }
    }
}