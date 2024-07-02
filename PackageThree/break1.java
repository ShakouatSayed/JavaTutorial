/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageThree;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class break1 {
    public static void main(String args[]){
        int i = 0, s = 1;
        while(i < 13){
            if(s > 10)
                break;
            s = s + i;
            i++;
            System.out.println(s);
        }
    }
}
