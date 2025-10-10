/*
 * Date: 10-10-2025
 * Trapping Rain Water Problem #22 DSA Sheet
 * Find the amount of trapped rain water between the bars whose width is 1 unit each.
 */

import java.util.*;

public class TrappingRainWater {

    public static int trappedWater(int height[]) {
        int n = height.length;
        // Calculate maximum left boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0]; // init leftMax with the first element of height Array
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]); // Compare height and leftMax of previous bar to store the
                                                              // max value.
        }
        // Calculate maximum right boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1]; // init rightMax with the last element of height Array
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);// Compare height and rightMax of previous bar to store
                                                               // the max value.
        }
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of bars: ");
        int n = sc.nextInt();
        int height[] = new int[n];
        for (int i = 0; i < height.length; i++) {
            System.out.println("Enter the height of " + (i + 1) + " bar: ");
            height[i] = sc.nextInt();
        }
        System.out.println(trappedWater(height));
        sc.close();
    }
}