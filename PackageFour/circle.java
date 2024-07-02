              /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageFour;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
class circle1{
    double radius = 1.0;
    public circle1(){
        System.out.println("Calculate the area: ");
    }
    circle1(double n){ 
        radius = n;
    }
    public double getArea(double n){
        n = radius   * radius;
        System.out.println(n);
        return n;
    }
}

public class circle {
    public static void main(String args[]){
        circle1 c = new circle1();
        circle1 c1 = new circle1(2);
    }
}
