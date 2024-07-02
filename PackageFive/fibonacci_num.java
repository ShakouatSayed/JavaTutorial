package PackageFive;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class fibonacci_num {
    public static void main(String[] arg) {
        int n1 = 0, n2 = 1, i = 2, n;
        while (i <= 15) {
            n = n1 + n2;
            n1 = n2;
            n2 = n;
            System.out.println(n);
            i++;
        }
    }
}
