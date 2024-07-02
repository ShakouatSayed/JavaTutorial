package PackageFive;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class skip_con {
    public static void main(String args[]){
        int i;
        for(i= 0; i < 10; i++){
            if(i % 2 == 0)
                continue;
            System.out.println("Print the odd Number: "+i+"\t");
        }
    }
}
