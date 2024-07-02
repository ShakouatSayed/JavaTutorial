/*Leaner search in java program */

// Leaner Search algorithom time complexity  Best case is: O(1)
// Leaner Search algorithom time complexity  Average case is: O(N)
// Leaner Search algorithom time complexity  Worst case is: O(N)
// Leaner Search algorithom Auxiliary Space is: O(1)

package problem_solving_question;

import java.util.Scanner;

/**
 * LeanerSearch
 */
public class LeanerSearch {

    int leanerSearch(int arr[], int num, int x) {
        for (int i = 0; i < num; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Shakoat Hossen Sayed.");

        LeanerSearch ls = new LeanerSearch();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element number : ");
        int size = sc.nextInt();

        System.out.println("Enter the element of array: ");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt(); 
        }

        System.out.println("Enter the Search number: ");
        int num = sc.nextInt();

        int result = ls.leanerSearch(arr, arr.length, num);
        if (result == -1)
            System.out.println("Element is not found. ");
        else
            System.out.println("Element index number is: " + result);
    }
}

//now we see the output how to search a number using the leaner search.
//Thanks for watching.