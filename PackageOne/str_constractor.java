  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageOne;

/**
 *
 * @author SHAKOUAT HOSSEN
 */

class  str_opr{
    String s, s1, s2;
    boolean b;
    public str_opr(){
        s = "Bangla e book.";
        s = s.toLowerCase();
    }
    
    public void str(String st, String st1){
          s2 = st;
        s1= st1;
        b = s1.equals(s2);
    } 
    
    public void str1(String st, String st1){
          s2 = st;
        s1= st1;
        b = s1.equalsIgnoreCase(s2);
    } 
    
    public void show(){
        System.out.println(s);
        System.out.println(b);
        System.out.println(b);
    }
    
    
    
}


public class str_constractor {
    public static void main(String args[]){
        str_opr s = new str_opr();
        //s.show();
        
        s.str("sayed", "Sayed");
        s.show();
        s.str1("sayed", "Sayed"); 
        //s.show();
    }
}
