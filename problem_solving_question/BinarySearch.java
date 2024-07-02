/*Binary Search Program in java. */
//Binary Search Time Complexity is Best Case : O(1)
//Binary Search Time Complexity is Average Case : O(Log n)
//Binary Search Time Complexity is worst Case : O(Log n)
//Binary Search Auxiliry Space is : O(1)

package problem_solving_question;

import java.util.Scanner;

/**
 * BinarySearch
 */
public class BinarySearch {

    static int binarySearch(int arr[], int n){
        int left = 0, right = arr.length - 1, mid;
        
        while (left <= right) {
            mid = left + (right - left)/ 2;
            if(arr[mid] == n)
                return mid;
            if(arr[mid] < n)
                left = mid + 1;
            else    
                right = mid - 1;
        }
        return -1;
    } 
    public static void main(String[] args) {
        System.out.println("Shakouat Hossen Sayed.");

        //int arr[] = {1, 3, 5, 11, 14, 15, 16, 19, 23};
        //int n = 23;

        //then we user an input
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.println("Enter the element number: ");
        size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Eneter the element: ");
        for(int i = 0; i < size; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the search Element number: ");
        int n = sc.nextInt();

        int result = binarySearch(arr, n);
        if(result == -1)
            System.out.println("Element is not Found.");
        else 
            System.out.println(n+" Element index is: "+result);
    }
}

//now we see the how to search an element in the array
//Thanks for watching.