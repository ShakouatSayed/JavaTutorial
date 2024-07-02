/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageOne;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class problem_4 {
    public static void main(String args[]){
       //FileWriter writeFile;
        try {
           FileWriter writeFile = new FileWriter("name.txt");
            writeFile.write("1 2 3 4 5 6 7 8 9 10");
            writeFile.close();
        } catch (IOException ex) {
            
            System.out.println("File is not open, have an error.");
            Logger.getLogger(problem_4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
