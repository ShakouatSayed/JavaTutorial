package PackageFive;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SHAKOUAT HOSSEN
 */
import java.util.Scanner;
public class arr_matrix {
    public static void main(String arg[]){
        int num[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            //num[i] = sc.nextInt();
            System.out.println("Input the number is: ");
            num[i] = sc.nextInt();
            System.out.println("The number is: "+num[i]);
            if(num[i] == 0)
                System.out.println("The number i = 0 : "+num[i]+" then program is stop.");
            //num[i] = 0;
        }
    }
}

