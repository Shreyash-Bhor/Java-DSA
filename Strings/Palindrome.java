/* Date: 02-12-2025
 * Check whether given string is palindrome or not.
*/

package Strings;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter string to check for palindrome: ");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
        sc.close();
    }
}
