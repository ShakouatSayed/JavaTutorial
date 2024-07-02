package PackageFive;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class method8 {
    public static void add(int a,int b){
        int sum = a + b;
        System.out.println(sum); 
    }
    public static void sub(int a,int b){
        System.out.println(a-b);
    }
    public static void mul(int a,int b){
        System.out.println(a*b);
    }
    public static void div(int a,int b){
        System.out.println(a/b);
    }
    public static void mud(int a,int b){
        System.out.println(a%b);
    }
    public static int min(int a, int b){
        if(a>b)
            return b;
        else
            return a;
    }
    public static void main(String args[]){   
        add(1, 2);
        sub(1, 2);
        mul(1, 2);
        div(1, 2);
        mud(1, 2);
        System.out.println();
    }
}


    