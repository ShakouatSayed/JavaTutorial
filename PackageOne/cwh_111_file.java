package PackageOne;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


class end_file{
    public void create_file(){
        try {
            File myFile = new File("create.txt");
            myFile.createNewFile();
        } catch (IOException ex) {
            System.out.println("Unable create this file.");
           Logger.getLogger(end_file.class.getName()).log(Level.SEVERE, null, ex);        
        }
    }
    
    public void write_file(){     
        try {
            try (FileWriter fileWrite = new FileWriter("create.txt")) {
                fileWrite.write("This the java programming.\nand ");
                fileWrite.close();
            }
        } catch (IOException ex) {
            System.out.println("Unable create this file.");
           Logger.getLogger(end_file.class.getName()).log(Level.SEVERE, null, ex);        
           
        }
    }
    
    public void read_file(){     
        try {
            File myFile = new File("create.txt");
            try (Scanner sc = new Scanner(myFile)) {
                while(sc.hasNextLine()){
                    String line = sc.nextLine();
                    System.out.println(line);
                }
            }
        } catch (IOException ex) {
           System.out.println("Unable create this file.");
           Logger.getLogger(end_file.class.getName()).log(Level.SEVERE, null, ex); 
           ex.printStackTrace();
        }
    }
    
    public void delete_file(){     
            File myFile = new File("create.txt");
            if(myFile.delete()){
                System.out.println("I have deleted. "+myFile.getName());
            }else{
                System.out.println("This file is not deleted have a problem.");
            }
    }  
} 


public class cwh_111_file {
    public static void main(String[] args) {
        end_file e = new end_file();
        //e.create_file();
        //e.write_file();
        //e.read_file();
        e.delete_file();
        }
    }

