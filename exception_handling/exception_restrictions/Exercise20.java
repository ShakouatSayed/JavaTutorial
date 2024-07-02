
/*
 * Thinking in Java.
 * Exercise Solution 20:
 * Exercise 20: Modify StormyInning.java by adding an UmpireArgument
 * exception type and methods that throw this exception. Test the modified
 * hierarchy.
 * 
 */

package exception_handling.exception_restrictions;

class BaseballEx extends Exception {
}

class Strik extends BaseballEx {
}

class Foul1 extends BaseballEx {
}

class UmpireArgument extends BaseballEx {
}

class ThrownGame extends UmpireArgument {
}

abstract class Innings {
    public Innings() throws BaseballEx {
    }

    public abstract void atBall() throws Strik, Foul1, UmpireArgument;

    public void event() throws BaseballEx {
    }
}

class StromeException1 extends UmpireArgument {
}

class RainedOut extends Strik {
}

class PopFoul1 extends Foul1 {
}

interface Strome1 {
    public void event() throws RainedOut;

    public void rainedHard() throws RainedOut;
}

public class Exercise20 extends Innings implements Strome1 {
    public Exercise20() throws UmpireArgument, RainedOut, BaseballEx {
    }

    public Exercise20(String s) throws Foul1, BaseballEx {
    }

    public void rainedHard() throws RainedOut {
    }

    public void event() {
    }

    public void atBall() throws PopFoul1, ThrownGame {
        throw new ThrownGame();
    }

    public void questionAbleCall() throws UmpireArgument {
        throw new UmpireArgument();
    }

    public static void main(String[] args) {
        try {
            Exercise20 ex = new Exercise20();
            ex.atBall();
            ex.questionAbleCall();
        } catch (PopFoul1 e) {
            System.out.println(" Base Ball Exception.");
        } catch (Foul1 e) {
            System.out.println(" Foul Exception. ");
        } catch (UmpireArgument e) {
            System.out.println(" UmpireArgument Exception. ");
        } catch (RainedOut e) {
            System.out.println(" RainedOut Exception. ");
        } catch (Strik e) {
            System.out.println(" Strik Exception. ");
        } catch (BaseballEx e) {
            System.out.println(" BaseBall Exception. ");
        }

        try {
            Innings in = new Exercise20();
            in.atBall();
        } catch (Foul1 e) {
            System.out.println("null");
        } catch (RainedOut e) {
            System.out.println("null");
        } catch (Strik e) {
            System.out.println("null");
        } catch (BaseballEx e) {
            System.out.println("");
        }
    }
}