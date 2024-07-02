package PackageOne;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test_one{
    public static void main(String args[]){
        int ch;
        System.out.println("Enter your text: ");
        try {
            while ((ch = System.in.read()) != 'n'){
                System.out.println((char)ch);
            }
        } catch (IOException ex) {
            System.out.println("Have an occours.");
            //Logger.getLogger(Test_one.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}