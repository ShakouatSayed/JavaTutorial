/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_one;

public class Class_one {
    public  void mainMethod(){
        int i = 2, j = 3, sum;
        sum = i + j;
        System.out.println("2 Summation 3 = "+sum);
    }
     public  void mainMethod1(){
       int i = 2, j = 3, sub;
        sub = i - j;
        System.out.println("2 Subtraction 3= "+sub);
    }
    public  void mainMethod2(){
        int i = 2, j = 3, mul;
        mul = i * j;
        System.out.println("2 multiplication 3 = "+mul);
    }
   
    public  void mainMethod3(){
       float i = 2, j = 3, div;
        div =  (i / j);
        System.out.println("2 division 3= "+div);
    }
    public  void mainMethod4(){
       float i = 2, j = 3, mod;
        mod = i / j;
        System.out.println("2 modulus 3= "+mod);
    }
    public static void main(String[] args){
        Class_one a = new Class_one();
       a.mainMethod();
       a.mainMethod1();
       a.mainMethod2();
       a.mainMethod3();
       a.mainMethod4();
    }
}
