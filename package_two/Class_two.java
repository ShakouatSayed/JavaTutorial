/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package package_two;
import PackageThree.ComparisionOperator;
import PackageFour.ArithmeticsOperator;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class Class_two {
    public  void mainMethod(){
       int i = 2, j = 3, sub;
        sub = i - j;
        System.out.println("Subtraction = "+sub);
    }
    public static void main(String[] args){
         ComparisionOperator a = new ComparisionOperator();
         ArithmeticsOperator b = new ArithmeticsOperator();
         a.greterThenEqualTo();
         a.lessThenEqualTo();
         a.equalToEqualTo();
         a.notEqualTo();
         b.summationEqualTo();
         b.subtractionEqualTo();
         b.multiplicationEqualTo();
         b.divitionEqualTo();
         b.modulusEqualTo();
    }
}
