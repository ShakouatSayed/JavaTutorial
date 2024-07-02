package exception_handling.exception_specification;

class TypeOne extends Exception {
    TypeOne(String msg) {
        super(msg);
    };
}

class TypeTwo extends Exception {
    TypeTwo(String msg) {
        super(msg);
    };
}

class TypeThree extends Exception {
    TypeThree(String msg) {
        super(msg);
    };
}

public class Practice02 {
    static void f(int x, int num) throws TypeOne, TypeTwo, TypeThree {
        if (x < 0 || num > x)
            throw new TypeOne("This is the exception one");
        if (x > 0 || num < x)
            throw new TypeOne("This is the exception tow");
        if (x == 0 || num == x)
            throw new TypeOne("This is the exception three");
    }

    public static void main(String args[]) {
        try {
            f(0, 10);
            f(1, 2);
            f(-1, 3);
        } catch (Exception e) {
            System.out.println("Caught Exception.......!");
            e.printStackTrace(System.out);
        }
    }
}
