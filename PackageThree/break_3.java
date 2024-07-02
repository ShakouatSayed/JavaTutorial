/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageThree;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class break_3 {
    public static void main(String args[]){
        int number = 75, count = 1;
        while(count <= 10){
            if(number > 300)
                break;
            number = number + 75;
            count++;
        }
        System.out.println(number);
    }
}
