package PackageFive;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class con1 {
    public static void main(String args[]){
        int i;
        for(i = 0; i <= 100; i++){
            if(i == 72)
                break;
            if(i % 9 == 0)
                continue;
            System.out.println(i);
        }
        int j = 0;
        while(true){
            j++;
            int k = j * 27;
            if(j == 2696)
                break;
            if(j % 10 != 0)
                continue;
            System.out.println(j);
        }
    }
}
