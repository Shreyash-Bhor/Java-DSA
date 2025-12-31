/*
 * Date : 31-12-2025
 * Problem 7 : Find the first occurence of element in an array
*/

package Recursion;

import java.util.Scanner;

public class FirstOccurence {
    public static int firstOccurence(int[] arr, int key, int i) {
        if (arr.length == i) {
            return -1;
        }
        if (key == arr[i]) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
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
        System.out.println("Enter key: ");
        int key = sc.nextInt();
        System.out.println(firstOccurence(arr, key, 0));
        sc.close();
    }
}
