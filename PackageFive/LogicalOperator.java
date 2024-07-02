/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageFive;
/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class LogicalOperator {

    public void andOperator(){
        int a = 10, b = 20;
        if((a == b) && (a <= b)){
            System.out.println("The condition is true: "+a);
        }else{
            System.out.println("The condition is flase: "+b);
        }
    }
    public void orOperator(){
        int a = 10, b = 20;
        if((a != b) || (a >= b)){
            System.out.println("The condition is true: "+a);
        }else{
            System.out.println("The condition is flase: "+b);
        }
    }
    public void notOperator(){
        int a = 10, b = 20;
        if(!(a != b) || (b >= a)){
            System.out.println("The condition is true: "+a);
        }else{
            System.out.println("The condition is flase: "+b);
        }
    }
    
    public static void main(String[] args){
        BitwiseOperator a = new BitwiseOperator();
        a.andOperator();
        a.orOperator();
        a.xorOperator();
        a.complementOperator();
        a.rightOperator();
        a.leftOperator();
    }
}
