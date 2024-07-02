package exception_handling.basic_exception;

class InheritException extends Exception {
}

public class Example02 extends InheritException {
    public void deminetor() throws InheritException {
        int a = 0, b = 10, div;
        div = b / a;
        System.out.println(div);
        throw new InheritException();
    }

    public static void main(String args[]) {
        Example02 OB1 = new Example02();
        try {
            OB1.deminetor();
        } catch (InheritException e) {
            System.out.println("Caught it found.....");
        }
    }
}
