/*
 * Thinking in java.
 * Exercise Solution 29:
 * 
 * Exercise 29: Modify all the exception types in Stormylnning.java so that they
 * extend RuntimeException, and show that no exception specifications or try
 * blocks are
 * necessary. Remove the ‘//!’ comments and show how the methods can be compiled
 * without
 * specifications.
 * 
 */

package exception_handling.ConChe_uncExc;

class BaseballExecption extends RuntimeException {
}

class Foul extends RuntimeException {
}

class Strik extends RuntimeException {
}

abstract class Innings {
    public Innings() {
    }

    public void walk() {
    }

    public abstract void aiBat();

    public void event() {
    }
}

class StormeException extends RuntimeException {
}

class PopFoul extends RuntimeException {
}

class RainedOut extends RuntimeException {
}

interface Storme {
    public void event();

    public void rainedHard();
}

public class Exercise29 extends Innings implements Storme {
    public Exercise29() {
    }

    public Exercise29(String msg) {
    }

    public void aiBat() {
    }

    public void event() {
    }

    public void walk() {
    }

    public void rainedHard() {
    }

    public static void main(String args[]) {
        System.out.println("This RuntimeException concept is OOP.");
        Exercise29 ex = new Exercise29();
        ex.aiBat();
        Innings in = new Exercise29();
        in.aiBat();
    }
}
