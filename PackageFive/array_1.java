package PackageFive;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class array_1 {
    public static void main(String args[]){
        int num[] = {1, 2, 4, 2, 5};
        int i, j, temp;
        for(i = 4; i >= 0; i--){
            for(j = 0; j < i;  j++){
                if(num[j] > num[j + 1]){
                 temp = num[j];
                 num[j] = num[j + 1];
                 num[j+1] = temp;  
                }
            }
            System.out.println(num[j]);
        }
    }
}
