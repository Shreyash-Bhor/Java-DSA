/*
 * Date: 03-11-2025
 * Search in Rotated Array Problem
 * DSA Sheet #6
 * Search for the target in rotated array with time complexity O(log n). (Binary Search)
 */

import java.util.Scanner;

public class SearchInRotatedSubarray {

    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
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

        System.out.println("Enter the target to find");
        int target = sc.nextInt();

        System.out.println();

        System.out.println(search(nums, target));

        sc.close();
    }
}
