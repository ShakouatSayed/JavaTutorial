package exception_handling.constructors_exception;

class NeedCleanUp {
    private static long count = 1;
    private final long id = count++;

    public void dispose() {
        System.out.println("NeedCleanUp " + id + " dispose.");
    }
}

class ConstructionException extends Exception {
}

class NeedCleanUp2 extends NeedCleanUp {
    public NeedCleanUp2() throws ConstructionException {
    }
}

public class Example02 {
    public static void main(String args[]) {
        // section 1
        NeedCleanUp n1 = new NeedCleanUp();
        try {
        } finally {
            n1.dispose();
        }

        // section 2
        NeedCleanUp n2 = new NeedCleanUp();
        NeedCleanUp n3 = new NeedCleanUp();
        try {
        } finally {
            n2.dispose();
            n3.dispose();
        }

        // section 3
        try {
            NeedCleanUp2 n4 = new NeedCleanUp2();
            try {
                NeedCleanUp2 n5 = new NeedCleanUp2();
                try {
                } finally {
                    n5.dispose();
                }
            } catch (ConstructionException e) {
                System.out.println(e);
            } finally {
                n4.dispose();
            }
        } catch (ConstructionException e) {
            System.out.println(e);
        }
    }
}
