/*
 * Date : 26-12-2025
 * Problem 3 : Print factorial of a number.
*/

package Recursion;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        int fact = n * factorial(n - 1);
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
}
