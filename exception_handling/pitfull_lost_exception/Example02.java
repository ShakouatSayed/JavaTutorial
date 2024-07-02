package exception_handling.pitfull_lost_exception;

public class Example02 {
    public static void main(String args[]) {
        try {
            throw new RuntimeException();
        } finally {
            return;
        }
    }

}
