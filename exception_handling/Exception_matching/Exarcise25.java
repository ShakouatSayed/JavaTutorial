/*
 * Thinking in Java.
 * Exercise Solution 25:
 * 
 * Exercise 25: Create a three-level hierarchy of exceptions. Now create a
 * base-class A
 * with a method that throws an exception at the base of your hierarchy. Inherit
 * B from A and
 * override the method so it throws an exception at level two of your hierarchy.
 * Repeat by
 * inheriting class C from B. In main(), create a C and upcast it to A, then
 * call the method.
 */

package exception_handling.Exception_matching;

class AOne extends Exception {
}

class BTwo extends AOne {
}

class CThree extends BTwo {
}

class A01 {
    public void f() throws AOne {
        throw new AOne();
    }
}

class B01 extends A01 {
    public void f() throws BTwo {
        throw new BTwo();
    }
}

class C01 extends B01 {
    public void f() throws CThree {
        throw new CThree();
    }
}

public class Exarcise25 {
    public static void main(String args[]) throws BTwo {
        A01 a = new C01();
        try {
            throw new AOne();
        } catch (AOne e) {
            System.out.println("Caught A01.....!");
        }

        try {
            throw new BTwo();
        } catch (BTwo e) {
            System.out.println("Caught B01.....!");
        }

        try {
            throw new CThree();
        } catch (CThree e) {
            System.out.println("Caught C01.....!");
        }

        try {
            a.f();
        } catch (CThree e) {
            System.out.println("C One...!");
        } catch (BTwo e) {
            System.out.println("B One...!");
        } catch (AOne e) {
            System.out.println("A One...!");
        }

        try {
            throw new BTwo();
        } catch (CThree e) {
            System.out.println("C Three.");
        } catch (BTwo e) {
            System.out.println("B Two.");
        } catch (AOne e) {
            System.out.println("A One.");
        }
    }
}