/*How to write data in text file using java program*/

package problem_solving_question;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataTxtFile {

    public static void writeFile(){
        try {
            FileWriter file_writer = new FileWriter("D:\\Java_Tutorial\\problem_solving_question\\text.txt");
            file_writer.write("Hi, this day is thursday and morning is very fresh.");
            file_writer.write("\nToday data is: 01-04-2024");
            file_writer.close();
            System.out.println("File was written Successfully.");
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("File cann't find."+e);
        }
    }
    public static void main(String[] args) {
        writeFile();
    }
}
