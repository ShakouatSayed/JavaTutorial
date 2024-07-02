package exception_handling.stack_trace;

public class Example01 {
    public static void f() {
        try {
            throw new Exception("this is exception....");
        } catch (Exception e) {
            System.out.println("caught Exception...!");
            for (StackTraceElement ste : e.getStackTrace())
                System.out.println(ste.getMethodName());
        }
    }

    static void g() {
        f();
    }

    static void h() {
        g();
    }

    public static void main(String args[]) {
        f();
        System.out.println("....................");
        g();
        System.out.println("....................");
        h();
    }
}
