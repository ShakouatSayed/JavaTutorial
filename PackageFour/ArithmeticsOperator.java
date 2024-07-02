/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageFour;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class ArithmeticsOperator {
    public void summationEqualTo(){
        int a = 2, b = 4, sum;
        sum = a += b;
        System.out.println("2 modulus equal to 4: "+sum);
    }
    public void subtractionEqualTo(){
        int a = 2, b = 4, sub;
        sub = a -= b;
        System.out.println("2 modulus equal to 4: "+sub);
    }
    public void multiplicationEqualTo(){
        int a = 2, b = 4, mul;
        mul = a *= b;
        System.out.println("2 modulus equal to 4: "+mul);
    }
    public void divitionEqualTo(){
        int a = 2, b = 4, div;
        div = a /= b;
        System.out.println("2 modulus equal to 4: "+div);
    }
    public void modulusEqualTo(){
        int a = 2, b = 4, mod;
        mod = a %= b;
        System.out.println("2 modulus equal to 4: "+mod);
    }
}
