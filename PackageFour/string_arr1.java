/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageFour;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class string_arr1 {
    public static void main(String arr[]){
        
        String book[] = {"Java", "PHP", "HTML\n"};
        for(int i = 0; i < 3; i++){
            System.out.println("Indes["+i+"] = "+book[i]);
        }
        
        
        String Book[] = new String[5];
        Book[0] = "java";
        Book[1] = "PHP";
        Book[2] = "HTML";
        for(int i = 0; i < 3; i++){
            System.out.println("Indes["+i+"} = "+Book[i]);
        }
    }
}
