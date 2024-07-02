package exception_handling.finally_return;

public class Example01 {
    public static void f(int i) {
        System.out.println("Initialized the code CleanUp...!");
        try {
            System.out.println("point 1");
            if (i == 1)
                return;
            System.out.println("point 2");
            if (i == 2)
                return;
            System.out.println("point 3");
            if (i == 3)
                return;
            System.out.println("End");
            return;
        } finally {
            System.out.println("Promot CleanUp.");
        }
    }

    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            f(i);
        }
    }
}
