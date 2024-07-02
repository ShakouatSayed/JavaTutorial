package PackageFive;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class User_o_in {
    public static void main(String args[])throws IOException{
        int n; String c;
        System.out.println("Input an integer: ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(in);
        c = b.readLine();
        n = Integer.parseInt(c);
        while(n != 0){
            System.out.println("You entered: "+n);
            System.out.println("Input an integer: ");
            c = b.readLine();
            n = Integer.parseInt(c);
        }
    }
}
