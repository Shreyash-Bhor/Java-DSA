/* Date: 03-12-2025
 * Check whether given 2 strings are Anagrams of each other.
*/

package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter string 1 : ");
        String str1 = sc.nextLine();
        System.out.println("Enter string 2: ");
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean result = Arrays.equals(ch1, ch2);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
        }
        sc.close();

    }
}
