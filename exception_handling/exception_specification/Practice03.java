
/*
 * Exercise 9: (2) Create three new types of exceptions. Write a class with a
 * method that
 * throws all three. In main( ), call the method but only use a single catch
 * clause that will
 * catch all three types of exceptions.
 */

package exception_handling.exception_specification;

class Type01 {
    public void Exception01() throws Exception {
        String str[] = { "Sayed", "Shakouat", "Hossen", "Sakhawat", "Hossain" };
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        throw new Exception("My Exception is one....!");
    }
}

class Type02 {
    public void Exception02() throws Exception {
        int num[] = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        throw new Exception("My Exception is two....!");
    }
}

class Type03 {
    public void Exception03() throws Exception {
        double bal[] = { 1054145.551, 20854521.21, 301245.21, 404548545.011,
                50.2154154 };
        for (int i = 0; i < bal.length; i++) {
            System.out.println(bal[i]);
        }
        throw new Exception("My Exception is three....!");
    }
}

public class Practice03 {
    public static void main(String args[]) {
        try {
            Type01 OB1 = new Type01();
            OB1.Exception01();

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Type02 OB2 = new Type02();
            OB2.Exception02();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Type03 OB3 = new Type03();
            OB3.Exception03();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
