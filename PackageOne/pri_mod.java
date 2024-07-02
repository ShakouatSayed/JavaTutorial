/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageOne;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
class priv_med{
    private int a = 10; 
}

public class pri_mod {
    private String id = "132";
    private String name = "Shakouat Hossen";
    private String lastName = "Sayed";
    public static void main(String args[]){
        priv_med o1 = new priv_med();
        //this error is compiler error
        //System.out.println(p.id);
        pri_mod p = new pri_mod();
        System.out.println(p.id);
        System.out.println(p.name);
        System.out.println(p.lastName);
    }
}


