package exception_handling.cleanup_finally;

class ExceptionThree extends Exception {
}

public class Example01 {
    static int count = 0;

    public static void main(String args[]) {
        while (true) {
            try {
                if (count++ == 0)
                    throw new ExceptionThree();
                System.out.println("NO Exception.");
            } catch (ExceptionThree ex) {
                System.out.println("Exception Three.");
            } finally {
                if (count == 2)
                    break;
                System.out.println("This is finally clause.");
            }
        }
    }
}
