/*
 * Thinking in Java.
 * Exercise Solution 30:
 * 
 * Exercise 30: Modify Human.java so that the exceptions inherit from
 * RuntimeException. Modify main( ) so that the technique in
 * TurnOffChecking.java is
 * used to handle the different types of exceptions.
 */

package exception_handling.ConChe_uncExc;

class Human extends RuntimeException {
}

class TrunOffChecking1 extends Human {
}

class NewOpera {
    // private boolean man1 = true;
    // private String man2 = "known his";

    // public void beforeIntroduct() {
    // if (man1 == true) {
    // if (man2 == "Unknown Person")
    // System.out.println("Ignore it..");
    // else
    // System.out.println("Introduct the him self.");
    // } else
    // System.out.println("This is not man and this man Ignore.");
    // }

    public void throwException(int type) {
        try {
            switch (type) {
                case 0:
                    throw new Human();
                case 1:
                    throw new TrunOffChecking1();
                case 2:
                    throw new RuntimeException("Who I'M..!");
                default:
                    return;
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
}

public class Exercise30 {
    public static void main(String args[]) {
        // NewOpera no = new NewOpera();
        // try {
        // no.beforeIntroduct();
        // throw new Human();
        // } catch (NullPointerException e) {
        // System.err.println(e);
        // }
        NewOpera no = new NewOpera();
        no.throwException(3);
        try {
            for (int i = 0; i < 4; i++) {
                if (i < 3)
                    no.throwException(i);
                else
                    throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            try {
                throw e.getCause();
            } catch (TrunOffChecking1 e1) {
                System.out.println("Human : " + e1);
            } catch (Human e2) {
                System.out.println("Trun off checking..." + e2);
            } catch (Throwable e3) {
                System.out.println("Throwable exception is: " + e3);
            }
        }
    }
}
