/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageFive;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class methodMin {
    public static int find_min(int n1, int n2){
        int min;
        if(n1<n2)
            min = n1;
        else 
            min = n2;
        return min;
    }
    public static void main (String args[]){
        int a = 10; 
        int b = 20;
        int c = find_min(a, b);
        System.out.println(c);
    } 
}
