/*
 * Date: 17-11-2025
 * Calculate Trapped Rain Water
 * DSA Sheet #11
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining
 */

import java.util.*;

public class CalculateTrappedRainWater {
    public static int trappedWater(int[] height) {

        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int trappedWater = 0;

        for (int j = 0; j < n; j++) {
            int waterLevel = Math.min(leftMax[j], rightMax[j]);
            trappedWater += waterLevel - height[j];
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
