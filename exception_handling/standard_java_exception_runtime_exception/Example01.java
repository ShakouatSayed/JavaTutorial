package exception_handling.standard_java_exception_runtime_exception;

public class Example01 {
    static void f() {
        throw new RuntimeException("Throw the message of RunTimeException....");
    }

    static void g() {
        f();
    }

    public static void main(String args[]) {
        g();
    }
}
