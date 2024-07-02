package PackageFive;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class vec2 {
    public static void main(String args[]){
        Vector v = new Vector(3);
        v.addElement("Shakouat");
        v.addElement("Hossen");
        v.add(1);
        v.add( 2);
        //v.remove(2);
        for(int i = 0 ; i < 4; i++){
            System.out.println(v.elementAt(i));
        }
    }
}

