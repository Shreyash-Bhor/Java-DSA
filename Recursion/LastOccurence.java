/*
 * Date : 31-12-2025
 * Problem 8 : Find the Last occurence of element in an array
*/

package Recursion;

import java.util.Scanner;

public class LastOccurence {
    public static int lastOccurence(int[] arr, int key, int i) {
        if (i == 0) {
            return -1;
        }
        if (key == arr[i]) {
            return i;
        }
        return lastOccurence(arr, key, i - 1);
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
        System.out.println(lastOccurence(arr, key, n - 1));
        sc.close();
    }
}
