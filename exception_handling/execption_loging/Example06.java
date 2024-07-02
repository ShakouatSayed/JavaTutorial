package exception_handling.execption_loging;

class MyException01 extends Exception {
    private int x;
    private String err_name;

    public MyException01() {
    };

    public MyException01(String msg) {
        super(msg);
    };

    public MyException01(String message, int x) {
        super(message);
        this.x = x;
    }

    public int valu() {
        return x;
    }

    public String getMessage() {
        return "Direct Message: " + x + super.getMessage();
    }

    // public String getMessage() {
    // return "Second Message: " + err_name + super.getMessage();
    // }
}

public class Example06 extends MyException01 {
    public static void f() throws MyException01 {
        System.out.println("This is the method of f() ");
        throw new MyException01(" Origined of f()", 47);
    }

    public static void g() throws MyException01 {
        System.out.println("This is the method of g() ");
        throw new MyException01(" Origined of g()");
    }

    public static void h() throws MyException01 {
        System.out.println(" This is the method of h() ");
        throw new MyException01();
    }

    public static void main(String args[]) {
        try {
            f();
        } catch (MyException01 e) {
            // TODO: handle exception
            e.printStackTrace(System.out);
            // System.out.println("e.value = "+e.value());
            System.out.println("Value of e: " + e.valu());
        }

        try {
            g();
        } catch (MyException01 e) {
            e.printStackTrace();
            // System.out.println("e.value = " + e.value());
        }
        try {
            h();
        } catch (MyException01 e) {
            e.printStackTrace();
        }
    }
}
