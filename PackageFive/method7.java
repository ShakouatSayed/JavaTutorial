/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageFive;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class method7 {
    public static void pen(){
        System.out.println("This is a pen");
    }
    public static void pen(int a){
        System.out.println(a);
    }
    public static int pen(int a, int b){
        return a+b;
    }
    public static void main(String args[]){
        pen();
        pen(5);
        System.out.println(pen(10, 20));
    }
}
