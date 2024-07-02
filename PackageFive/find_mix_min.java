/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageFive;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class find_mix_min {
    public static int max_min(int a, int b){
        if(a < b )
            return b;
        else{
        return a;
        }
    }
    public static void main(String args[]){
        int a = 10; 
        int b = 20;
        int max = max_min(a, b);
        System.out.println(max);
    }
}
