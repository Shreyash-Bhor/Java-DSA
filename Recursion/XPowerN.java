/*
 * Date : 03-01-2026
 * Problem 9 : Write a function to print x to the power of n (Brute Force)
 * Problem 10 : Write a function to print x to the power of n (Optimized)
*/

package Recursion;

import java.util.Scanner;

public class XPowerN {
    // Brute Force
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) {
            return x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter x : ");
        int x = sc.nextInt();
        System.out.println("Enter power n : ");
        int n = sc.nextInt();
        System.out.println("Power : " + power(x, n));
        System.out.println("Optimized Power : " + optimizedPower(x, n));

        sc.close();
    }
}
