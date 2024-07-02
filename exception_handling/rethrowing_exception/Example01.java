package exception_handling.rethrowing_exception;

public class Example01 {
    public static void f() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Caught Exception....!");
            e.printStackTrace();
        }
    }

    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Caught Exception...!");
            e.printStackTrace();
            throw e;
        }
    }

    static void h() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Caught Exception...!");
            e.printStackTrace();
            throw (Exception) e.fillInStackTrace();
        }
    }

    public static void main(String args[]) {
        try {
            g();
        } catch (Exception e) {
            System.out.println("Caught Exception.....!");
            e.printStackTrace();
        }

        try {
            h();
        } catch (Exception e) {
            System.out.println("Caught Exception.....!");
            e.printStackTrace();
        }
    }
}
