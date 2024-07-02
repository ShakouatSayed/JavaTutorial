package exception_handling.basic_exception;

class InheritingExceptions extends Exception {
}

public class Example01 {
    public void f() throws InheritingExceptions {
        System.out.println("Exceptions error...");
        int a = 10, b = 20;
        if (a <= b && a >= b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        throw new InheritingExceptions();
    }

    public static void main(String args[]) {
        Example01 OB1 = new Example01();

        // int t;
        // if (t == null) {
        // throw new NullPointerException();
        // }else{
        // throw new NullPointerException(t == null)
        // }

        // try {
        // // try block body for the code execute
        // } catch (Exception e) {
        // // TODO: handle exception
        // } catch (Type2 id2) {
        // // exception handler type 1
        // } catch (Type3 id3) {
        // // exception handler type 2
        // } catch (Type4 id4) {
        // // exception handler type 3
        // }
        try {
            OB1.f();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("the exception is Caugth it.....!");
        }
    }

}
