
package exception_handling.exception_restrictions;

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class Inning {
    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
    }

    abstract void atBat() throws Strike, Foul;

    public void walk() {
    }
}

class StromeException extends Exception {
}

class RainOut extends StromeException {
}

class PopFoul extends Foul {
}

interface Strome {
    public void event() throws RainOut;

    public void rainHard() throws RainOut;
}

public class Example01 extends Inning implements Strome {
    public Example01() throws RainOut, BaseballException {
    };

    public Example01(String s) throws Foul, BaseballException {
    };

    public void rainHard() throws RainOut {
    };

    public void atBat() throws PopFoul {
    };

    public void event() {
    };

    public static void main(String args[]) {
        try {
            Example01 ex = new Example01();
            ex.atBat();
        } catch (PopFoul e) {
            System.out.println(e);
        } catch (RainOut e) {
            System.out.println("Rain Out.");
        } catch (BaseballException e) {
            System.out.println("Base ball Exaception.");
        }

        try {
            Inning in = new Example01();
            in.atBat();
        } catch (Strike e) {
            System.out.println("Strike Exception.");
        } catch (Foul e) {
            System.out.println("Foul Exception");
        } catch (RainOut e) {
            System.out.println("Rain out Exception.");
        } catch (BaseballException e) {
            System.out.println("Base ball Exception ");
        }
    }
}
