/*Bubble sort program in java */
//Bubble sort Algorithom time complexity is : O(N^2)
//Bubble sort algorithom Auxiliry Space is: O(1)

package problem_solving_question;

import java.util.Scanner;

public class BubbleSort {

    //now we create a method bubbleSort 
    public static void bubbleSort(int arr[], int num){
        int i, j, temp;
        boolean swapped;

        for(i = 0; i < num - 1; i++){
            swapped  = false;
            for(j = 0; j < num - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;   
                }
            }
            if(swapped == false)
                break;
        }
    }

    // now we print in sorted array.
    public static void printSortedArray(int arr[], int size){
        int i;
        for(i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Shakouat Hossen Sayed.");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array Size Number: ");
        int n = sc.nextInt();
        
        System.out.println("Enter the array number: ");
        int arr[]  = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        //int arr[] = {12, 3, 4, 1, 5, 11, 15, 8, 4};

        int size = arr.length;

        bubbleSort(arr, size);

        System.out.println("Sorted array: ");
        
        printSortedArray(arr, size);
    }
}

//new see this the output.
// thanks for