/*
 * 20-10-2025
 * DSA Sheet #4
 * Return true if the array contains duplicates and return true if all the elements are distinct.
 */

import java.util.*;

// Brute force approach.
// Time complexity O(n^2)
public class ContainsDuplicate {

    public static boolean containsDuplicate(int arr[]) {
        int current = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            current = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == current) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(); // for better readability of output
        System.out.println("How many elements you want to enter in array");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter all the elements");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println(containsDuplicate(nums));
        sc.close();
    }
}
