/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageThree;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class fibo {
    public static void main(String args[]){
        int n1 = 0, n2 = 1, i = 0, n;
        while(i < 15){
            n = n1 + n2;
            System.out.println(n);
            n1 = n2;
            n2 = n;
            i++;   
        }
    }
}
