/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageOne;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
class bd_book{
    protected static int m = 10;
    protected static void bd(){
        System.out.println("This class is protected static variable is m\nThe bd method proected is  modifier.");  
    }
}


public class protected_mod extends bd_book {
    private void bd1(){
        System.out.println("This class is protected static variable is m\n Themethod is private modifier.");
    }
    public static void main(String args[]){
        protected_mod o = new protected_mod();
        System.out.println(m);
        o.bd();
        bd();
    }
}
