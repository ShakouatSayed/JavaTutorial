/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageFour;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class example3 {
    public static void main(String args[]){
        int i, sum = 0;
        for(i = 3; i <= 8; i++){
            if(sum > 20)
                break;
            System.out.println("Number: "+i);
            System.out.println("Sum: "+sum);
            sum = sum + i;
            
        }
    }
}
