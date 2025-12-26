/*
 * Date : 26-12-2025
 * Problem 1 : Print numbers from n to 1 in decreasing order. 
*/

package Recursion;

import java.util.Scanner;

public class PrintNumbers {

    public static void printNumbers(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        printNumbers(n);
        sc.close();
    }
}