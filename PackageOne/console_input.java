package PackageOne;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class console_input{
    public static void main(String args[])throws IOException{
        try ( //create output stream in file
                FileOutputStream output = new FileOutputStream("val.dat")) {
            for(int i = 1; i <= 10; i++)
                output.write(i);
        }
        
        try ( //create file input stream.
                FileInputStream input = new FileInputStream("val.dat")) {
            int value;
            while((value = input.read())!= -1)
                System.out.println(value+" ");
        }
    }
}