/* Date: 28-09-2025 
* Problem Statement :
* Max Subarray Sum : Find the subarray with the largest sum
*/
package Arrays;

import java.util.*;

public class Subarrays {
    // #1 Brute Force
    // Time Complexity - O(n^3)
    public static void maxSubarraySum(int arr[]) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    currSum += arr[k];
                }
                System.out.println("Sum is: " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                currSum = 0;
            }
            System.out.println();
        }
        System.out.println("Maximum sum is: " + maxSum);
    }

    // #2 Prefix Sum
    public static void prefixSumSubarrays(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                System.out.print(arr[j] + " ");
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
            System.out.println("currSum = " + currSum);
        }
        System.out.println("maxSum = " + maxSum);
    }

    // #3 Kadane's Algorithm
    // Optimal Approach
    public static void kadanes(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        if (maxSum == 0) {
            maxSum = arr[0];
            for (int i = 1; i < arr.length; i++) {
                maxSum = Math.max(maxSum, arr[i]);
            }
        }
        System.out.println("Maximum sum : " + maxSum);
    }

    public static void main(String args[]) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter numbers: ");
            numbers[i] = sc.nextInt();
        }
        // maxSubarraySum(numbers);
        // prefixSumSubarrays(numbers);
        kadanes(numbers);
    }
}