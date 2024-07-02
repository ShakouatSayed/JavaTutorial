package exception_handling.constructors_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class InputFile {
    private BufferedReader in;

    public InputFile(String f_name) throws Exception {
        try {
            in = new BufferedReader(new FileReader(f_name));
        } catch (FileNotFoundException e) {
            System.out.println("File could not found " + f_name);
            throw e;
        } catch (Exception e) {
            try {
                in.close();
            } catch (IOException e1) {
                System.out.println("in.close() is not successfully.");
            }
            throw e;
        } finally {

        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("File does not close successfully...");
        }
        return s;
    }

    public void dispose() {
        try {
            in.close();
            System.out.println("File close Successfully. ");
        } catch (IOException e2) {
            // System.out.println("File does not close successfully...");
            throw new RuntimeException("File does not close successfully...");
        }
    }
}

public class Example01 {
    public static void main(String args[]) {
        try {
            InputFile in = new InputFile("Example001.java");
            try {
                int i = 1;
                String s;

                while ((s = in.getLine()) != null)
                    ;
            } catch (Exception e) {
                System.out.println("Caught Exception...!");
                e.printStackTrace();
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("File in not work successfully." + e);
        }
    }
}