/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageFour;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class example1 {
    public static void main(String args[]){
        int i, sum = 0;
        for (i = 0; i <= 30; i++){
            if( i == 21){
                continue;
            }
            sum = sum + i;
            System.out.println("Number: "+i);
            System.out.println("Sum: "+sum);
        }
    }
}
