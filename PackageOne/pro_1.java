/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageOne;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class pro_1 {
    public static void main(String args[]){
        //input a charctera
        //Scanner sc = new Scanner(System.in);
        //char c;
        //c = sc.ne
        File myfile = new File("name.txt");
        try {
            myfile.createNewFile();
        } catch (IOException ex) {
            System.out.println("File is not create, have an error.");
            //Logger.getLogger(pro_1.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
}
