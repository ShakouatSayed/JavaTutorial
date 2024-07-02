package PackageFive;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class even_for {
    public static void main(String args[]){
        int i, sum = 0;
        for(i = 20; i <= 65; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
