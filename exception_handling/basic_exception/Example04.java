package exception_handling.basic_exception;

class ExceptionTest extends Exception {
    public ExceptionTest() {
    };

    public ExceptionTest(String msg) {
        super(msg);
    };
}

public class Example04 extends ExceptionTest {
    public void anyFunctionTest() throws ExceptionTest {
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 10);
        }
        throw new ExceptionTest();
    }

    public void anyFunctionTest01() throws ExceptionTest {
        String day = "Sunday";
        int day1 = 1;
        switch (day1) {
            case 1:
                if (day == "Saturday") {
                    System.out.println("Saturday");
                } else {
                    System.out.println("Sunday");
                }
                break;
            default:
                System.out.println("Code condition is not true then check the default body..! ");
        }
        throw new ExceptionTest("the Exception is created is .....!");
    }

    public static void main(String args[]) {
        Example04 OB1 = new Example04();
        try {
            OB1.anyFunctionTest();
        } catch (ExceptionTest e) {
            e.printStackTrace(System.out);
        }
        try {
            OB1.anyFunctionTest01();
        } catch (ExceptionTest e) {
            e.printStackTrace(System.out);
        }
    }
}
