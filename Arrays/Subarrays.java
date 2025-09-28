/* Date: 28-09-2025 
* Problem Statement :
* 1. To print all the subarrays in an array of integers.
* 2. To calculate the sum of all the subarrays.
* 3. To find the min and max sum among the subarrays.
*/
package Arrays;

public class Subarrays {
    public static void printSubarrays(int arr[]) {
        int sum = 0;
        int min_sum = Integer.MAX_VALUE;
        int max_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];

                }
                System.out.println("Sum is :" + sum);
                if (sum < min_sum) {
                    min_sum = sum;
                } else if (sum > max_sum) {
                    max_sum = sum;
                }
                sum = 0;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Minimum sum is: " + min_sum);
        System.out.println("Maximum sum is: " + max_sum);
    }

    public static void main(String args[]) {
        System.out.println("");
        int arr[] = { 2, 4, 6, 8, 10 };
        printSubarrays(arr);
    }
}