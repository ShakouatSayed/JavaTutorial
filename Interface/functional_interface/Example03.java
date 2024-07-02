package functional_interface;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SHAKOUAT HOSSEN
 */
interface Square {

    int number(int x);
}

public class Example03 {

    public static void main(String args[]) {
        int a = 5;
        Square s = (int x) -> a * a;
        int ans = s.number(a);
        System.out.println(ans);
    }
}
