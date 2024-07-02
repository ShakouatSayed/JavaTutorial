/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageOne;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
class str_equalIgnore{
    String s1, s2;
    public void str_eqIgn(){
         s1 = "Sayed";
         s2 = "Sayed";
         boolean s = s1.equalsIgnoreCase(s2);
        System.out.println(s);
    }
    
    public void strEqIg(String st1, String st2){
        s1 = st1;
        s2 = st2;
        boolean s = s1.equals(s2);
        System.out.println(s);
    }
    
    public void str_con(String con1, String con2){
        s1 = con1;
        s2 = con2;
        String s3 = s1 +"Love this Programming.";
        System.out.println(s3);
    }
    public void str_opr(String s){
        s1 = s;
        s2 = s.toString();  
        String s3 = s2.toString();
        s3 = "Sayed Shakouat";
        String s4 = s3.toString();
        System.out.println(s4);
    }
       
    public void str_len(String len){
        s1 = len;
        int s2 = s1.length();
        System.out.println(s2);
    }
    public void str_car(String cha){
        s1 = cha;
        char c = s1.charAt(15);
        System.out.println(c);
           
    }   
    public void set_char_at(){
           //s1 = setChar_at;
        StringBuffer s;
        s = new StringBuffer( "Book bd");
        s.setCharAt(4, '_');
        System.out.println(s);
        StringBuffer s1;
        s1  = new StringBuffer("SAyed ");
        s1.setCharAt(5, '_');
        System.out.println(s1);         
    }
    public void Str_index_of(String str_ind_of){
           s1 = str_ind_of;
           int i;
           i = s1.indexOf("ed");
           System.out.println(i);
    }
    public void Str_upperCase(String str_upper){
         s1 = str_upper;
           String s = s1.toUpperCase();
           System.out.println(s);
    }
    public void str_concat(String str_reven){
           s1 = str_reven;
           String s = s1.concat("Sayed");
           System.out.println(s);
    }
    public void str_replace(String str_replace){
        s1 = str_replace;
        String s = s1.replace("Sayed", "This is my name.");
        
        System.out.println(s);
    }
    public void point_of_sels(String c_name, String p_name){
        s1 = c_name;
        //s2 = p_name;
        String brand_name = "Calvin nick";
         //s2 = c_name.compareTo();
    }
}


public class str_con {
    public static void main(String args[]){
        str_equalIgnore str = new str_equalIgnore();
        str.strEqIg("sayeD", "SAyeD");
        str.str_con("Sakouat ", "Sayed ");
        str.str_opr("sayed");
        str.str_car("I love Java Programming");
        str.set_char_at();
        str.Str_index_of("Shakouat Hossen Sayed");
        str.Str_upperCase("Shakouat Hossen Sayed");
        str.str_concat("Shakouat Hossen ");
        str.str_replace("Shakouat Hossen Sayed");
        //String s1, s2;
        //s1 = "Love";
        //s2 = s2.to//String(s1);
        
        //str.to_string("Syed", "Sayed");
    }
}
