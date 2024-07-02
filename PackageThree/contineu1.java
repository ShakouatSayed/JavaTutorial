/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageThree;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class contineu1 {
    public static void main(String args[]){
        int i, sum = 0;
        for(i = 1; i < 5; ++i){
            if(i == 2)
                continue;
            sum = sum + i;
            System.out.println(sum);
        }
    }
}
