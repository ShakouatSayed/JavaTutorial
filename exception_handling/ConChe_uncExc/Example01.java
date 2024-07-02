package exception_handling.ConChe_uncExc;

import java.io.FileNotFoundException;
import java.io.IOException;

class UncheckedEx {
    public void throwAnException(int value) {
        try {
            switch (value) {
                case 0:
                    throw new FileNotFoundException();
                case 1:
                    throw new IOException();
                case 2:
                    throw new RuntimeException("Where I am.");
                default:
                    return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class SomeOtherException extends Exception {
};

public class Example01 {
    public static void main(String args[]) {
        UncheckedEx tre = new UncheckedEx();
        tre.throwAnException(3);
        for (int i = 0; i < 4; i++) {
            try {
                if (i < 3)
                    tre.throwAnException(i);
                else
                    throw new SomeOtherException();

            } catch (SomeOtherException e) {
                System.out.println("SomeOtherExecption : " + e);
            } catch (RuntimeException re) {
                try {
                    throw re.getCause();
                } catch (FileNotFoundException fe) {
                    System.out.println("File not found Exception : " + fe);
                } catch (IOException f) {
                    System.out.println("File not found Exception : " + f);
                } catch (Throwable re1) {
                    System.out.println("File not found Exception : " + re1);
                }
            }
        }
    }
}
