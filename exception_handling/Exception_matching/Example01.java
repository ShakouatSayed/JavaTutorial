package exception_handling.Exception_matching;

class Senzee extends Exception {
}

class Annoyance extends Senzee {
}

public class Example01 {
    public static void main(String args[]) {
        // catch extce block
        try {
            throw new Annoyance();
        } catch (Annoyance e) {
            System.out.println("Caught Senzee block. ");
        } catch (Senzee s) {
            System.out.println("caught Annoyance block. ");
        }

        // catch base block
        try {
            throw new Annoyance();
        } catch (Senzee e) {
            System.out.println("Caught Annoyance block 1. ");
        }
    }
}
