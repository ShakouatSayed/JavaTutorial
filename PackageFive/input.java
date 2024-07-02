package PackageFive;


import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class input {
    public static void main(String args[])throws IOException{
        String N; int a, i, j;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(in);
        N = b.readLine();
        a = Integer.parseInt(N);
        for(i = 1; i <= a; i++){
            System.out.println();
            for(j = 1; j <= i; j++){
                System.out.print(j);
            }
        }
        System.out.println();
    }
}
