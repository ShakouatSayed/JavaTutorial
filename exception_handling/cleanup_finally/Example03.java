package exception_handling.cleanup_finally;

class FourException extends Exception {
}

public class Example03 {
    public static void main(String args[]) {
        System.out.println("Entring the try block.");
        try {
            System.out.println("Entring the 1st try block.");
            try {
                throw new FourException();
            } finally {
                System.out.println("The finally block is 1st try block.");
            }
        } catch (FourException e) {
            System.out.println("Entring the catch block.");
        } finally {
            System.out.println("The finally block is Catch block.");
        }
    }
}
