/*
 * Date : 26-12-2025
 * Problem 1 : Print numbers from n to 1 in decreasing order.
 * Problem 2 : Print numbers from n to 1 in increasing order. 
*/

package Recursion;

import java.util.Scanner;

public class PrintNumbers {
    // Decreasing Order
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDec(n - 1);
    }

    // Increasing Order
    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        printInc(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Numbers in Decreasing Order:");
        printDec(n);
        System.out.println("Numbers in Increasing Order:");
        printInc(n);
        sc.close();
    }
}