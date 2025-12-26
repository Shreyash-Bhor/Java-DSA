/*
 * Date : 26-21-2025
 * Problem 4 : Print sum of first N natural numbers.
*/

package Recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int sumOfNaturalNumbers(int n) {
        if (n == 0) {
            return n;
        }
        int answer = n + sumOfNaturalNumbers(n - 1);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(sumOfNaturalNumbers(n));
        sc.close();
    }
}
