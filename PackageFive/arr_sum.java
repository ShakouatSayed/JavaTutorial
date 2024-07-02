package PackageFive;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class arr_sum {
    public static void main(String args[]){
        int sum, i, j;
        int num[] = {2, 4, 1, 5, 2, 4};
        for(i = 0; i<=num.length; i++){
            for(j = 0; j < i; j++){
                if(num[j] > num[j+1]){
                    sum = num[j];
                    num[j] = num[j+1];
                    num[j+1] = sum;
                   
                }
            }
            System.out.println(num[j]);
        }
    }
}
