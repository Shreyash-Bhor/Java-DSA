/*
 * Date: 07-01-2026
 * Problem 15 : Print the number in String format
*/

package Recursion;

import java.util.Scanner;

public class Digits {
    static String[] digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void printDigits(int n) {
        if (n == 0) {
            return;
        }
        int lastDigit = n % 10;
        printDigits(n / 10);
        System.out.print(digits[lastDigit] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        printDigits(number);
        sc.close();
    }
}
