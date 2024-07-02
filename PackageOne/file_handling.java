package PackageOne;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class file_handel {
    public void create_file() {
        File myFile = new File("Create.txt");
        try {
            myFile.createNewFile();
        } catch (IOException ex) {
            System.out.println("This file is not create.");
            // Logger.getLogger(file_handel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void write_file() {
        try{
            FileWriter writeFile = new FileWriter("Create.txt");
            //writeFile.write("1 2 3 4 5 6 7 8 9 10");
            writeFile.close();

        } catch (IOException ex) {
            System.out.println("This file is not write.");
            // Logger.getLogger(file_handel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void read_file() {
        try {
            File myFile = new File("Create.txt");
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("This file is not read.");
            // Logger.getLogger(file_handel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleted_file() {
        File myFile = new File("Create.txt");
        if (myFile.delete()) {
            System.out.println(myFile.getName() + " file is deleted.");
        } else {
            System.out.println("This file is not deleted.");
        }
    }
}

public class file_handling {
    public static void main(String args[]) {
        file_handel e = new file_handel();
        e.create_file();
        e.write_file();
        e.read_file();
        // e.deleted_file();
    }
}
