/*
 * Thinking in Java.
 * Solution Exercise 19.
 * 
 * Exercise 19: Repair the problem in LostMessage.java by guarding the call
 * in the
 * finally clause.
 * 
 */

package exception_handling.pitfull_lost_exception;

class VIPMException extends Exception {
    public String toString() {
        return "This Exception is very Important.";
    }
}

class AnotherException extends Exception {
    public String toString() {
        return "The next Exception is the running.";
    }
}

class AnotherTwoException extends Exception {
    public String toString() {
        return "The Two Exception is the running.";
    }
}

public class Exercise19 {
    public void f() throws VIPMException {
        throw new VIPMException();
    }

    public void despose() throws AnotherException {
        throw new AnotherException();
    }

    public void a() throws AnotherTwoException {
        throw new AnotherTwoException();
    }

    public static void main(String[] args) {
        Exercise19 ex = new Exercise19();
        try {
            try {
                ex.f();
                try {
                    ex.a();
                } catch (AnotherTwoException e) {
                    System.out.println("Caught Exception One....!");
                    e.printStackTrace();
                }
            } catch (VIPMException e) {
                System.out.println("Caought Exception Two...!");
                e.printStackTrace();
            }

        } finally {
            try {
                ex.despose();
            } catch (AnotherException e) {
                System.out.println("Caught Exception Three..!");
                e.printStackTrace();
            }
        }
    }
}
