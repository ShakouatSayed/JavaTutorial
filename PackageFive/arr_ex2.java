package PackageFive;

/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class arr_ex2 {
    public static void main(String arg[]){
        int mul[][] = new int[3][3];
        int mul1[][] = new int [3][3];
        int arr[][] = new int[10][10];
        //System.out.println("Enter your Number: ");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the number of first matrix is: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3;j++){
                mul[i][j] = sc.nextInt();
                //System.out.println(arr[i][j]);
            }  
            //System.out.println();
        }
        
        System.out.println("The first matrix is: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Input the number of Second matrix is: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3;j++){
                mul1[i][j] = sc.nextInt();
                //System.out.println(arr[i][j]);
            }  
            //System.out.println();
        }
        
        System.out.println("The second matrix is: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3;j++){
                System.out.print(mul1[i][j]+" ");
            }
            System.out.println();
        }
        
        //System.out.println("Input the number of third matrix is: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3;j++){
                arr[i][j] += mul[i][j] * mul[i][j];
                //System.out.println(arr[i][j]);
            }  
            //System.out.println();
        }
        System.out.println("The multiplecation matrix is: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //sc.close();
    }
}
