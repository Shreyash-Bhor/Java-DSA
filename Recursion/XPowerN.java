/*
 * Date : 03-01-2026
 * Problem 9 : Write a function to print x to the power of n.
*/

package Recursion;

import java.util.Scanner;

public class XPowerN {

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter x : ");
        int x = sc.nextInt();
        System.out.println("Enter power n : ");
        int n = sc.nextInt();
        System.out.println(power(x, n));
        sc.close();
    }
}
