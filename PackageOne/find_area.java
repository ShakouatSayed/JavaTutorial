package PackageOne;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class find_area {
    public static void main(String args[]){
        //input a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double ra = sc.nextDouble(),area;
        area = 3.1416*ra*ra;
        System.out.println("Area of circle: "+area);
    }
}





