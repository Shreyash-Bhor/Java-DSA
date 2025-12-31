/*
 * Date : 31-12-2025
 * Problem 6 : Check whether the given array is sorted or not
*/

package Recursion;

import java.util.Scanner;

public class CheckSortedArray {

    public static boolean checkSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return checkSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(checkSorted(arr, 0));
        sc.close();
    }
}
