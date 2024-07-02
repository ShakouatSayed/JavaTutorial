/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageFive;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class BitwiseOperator {
    public void andOperator(){
        int a = 2, b = 3;
        if((a & b) == a)
            System.out.println("a and b value is: "+(a & b));
        else
            System.out.println("print a value: "+a);
    }
    public void orOperator(){
        int a = 2, b = 3;
        if((a | b) >= a)
            System.out.println("a or b value is: "+(a | b));
        else
            System.out.println("print a value: "+a);
    }
    public void xorOperator(){
        int a = 2, b = 3;
        if((a ^ b) <= a)
            System.out.println("a xor b value is: "+(a ^ b));
        else
            System.out.println("print a value: "+a);
    }
    public void complementOperator(){
        int a = 2, b = 3;
        if(a >= (~a))
            System.out.println("a omplement value is: "+(~a));
        else
            System.out.println("print b complement value: "+(~b));
    }
    public void rightOperator(){
        int a = 2, b = 3;
        if(a >= (a>>2))
            System.out.println("a right shift operator is: "+(a>>2));
        else
            System.out.println("print b right shift value is: "+(b>>2));
    }
     public void leftOperator(){
        int a = 2, b = 3;
        if(b <= (b<<2))
            System.out.println("b left shift operator is: "+(b<<2));
        else
            System.out.println("print a left shift value is: "+(a<<2));
    }
}
