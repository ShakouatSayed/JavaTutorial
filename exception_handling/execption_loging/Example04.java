package exception_handling.execption_loging;

public class Example04 {
    public static void main(String args[]) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.err.println("Caught: " + e);
            e.printStackTrace();
            e.printStackTrace(System.out);

        }
    }
}
