/*
 * Date: 11-01-2026
 * Problem 16 : Tower of Hanoi
*/
package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + helper);

        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println(("Enter number of disks: "));
        int n = sc.nextInt();
        towerOfHanoi(n, "A", "B", "C");
        sc.close();
    }
}