package exception_handling.Catching_exception;

public class Example01 {
    public static void main(String args[]) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.out.println("Caught Excetion: ");
            System.out.println("e.message : " + e.getMessage());
            System.out.println("getLocalizedMessaeg(): " + e.getLocalizedMessage());
            System.out.println("toString : " + e.toString());
            System.out.println("printStackTrace(): ");
            e.printStackTrace(System.out);
        }
    }
}
