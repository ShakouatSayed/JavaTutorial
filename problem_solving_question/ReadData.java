/*How to read Data from Text file in Java pragram. */

package problem_solving_question;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {

    // public void createFile(){
    // try {
    // File read_data = new File("text.txt");
    // read_data.createNewFile();
    // } catch (IOException e) {
    // // TODO: handle exception
    // System.out.println("File name is invalid."+e);
    // }
    // }

    // public void writeFile(){
    // try {
    // FileWriter file = new FileWriter("text.txt");
    // //file.write("Hi, I'm Shakouat Hossen Sayed.");
    // file.close();
    // } catch (IOException e) {
    // // TODO: handle exception
    // System.out.println("File can't write."+e);
    // }
    // }

    public static void readFile() {
        try {
            File file = new File("D:\\Java_Tutorial\\problem_solving_question\\text.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                System.out.println(str);
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("File can't read.");
        }
    }

    public static void main(String[] args) {
        readFile();
    }
}
