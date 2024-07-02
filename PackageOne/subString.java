/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package PackageOne;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class subString {
    public static String string(String s){
        
        String sn = s.substring(7,12);
        System.out.println(sn);
        return null;
    }
    
    public static String str_contain(String s){
        boolean f;
        f = s.contains("ban");
        System.out.println(f);
        return null;
    }
    public static void main(String[] args) {
         str_contain("bangla e book");
    }
}
