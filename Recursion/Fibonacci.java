/*
 * Date : 26-12-2025
 * Problem 5 : Print nth term in fibonacci sequence
*/
package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int answer = fibonacci(n - 1) + fibonacci(n - 2);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        sc.close();
    }
}
