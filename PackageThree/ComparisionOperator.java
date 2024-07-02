/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageThree;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class ComparisionOperator {
    public void greterThenEqualTo(){
        int a = 6, b = 12;
        if(a >= b){
            System.out.println("6 gerter then equal to 12: "+a);
        }
        else System.out.println("6 less then equal to 12: "+b);
    }
    public void lessThenEqualTo(){
         int a = 6, b = 12;
        if(a <= b){
            System.out.println("6 less then equal to 12: "+a);
        }
        else System.out.println("6 gerter then equal to 12: "+b);
    }
    public void equalToEqualTo(){
         int a = 6, b = 12;
        if(a == b){
            System.out.println("6 equal to equal to 12: "+a);
        }
        else System.out.println("6 not equal to 12: "+b);
    }
    public void notEqualTo(){
         int a = 6, b = 12;
        if(a != b){
            System.out.println("6 not equal to 12: "+a);
        }
        else System.out.println("6 equal to equal to 12: "+b);
    }
}


