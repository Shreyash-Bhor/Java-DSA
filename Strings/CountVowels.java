/* Date: 03-12-2025 
 * Assignment Question 1
 * Count lower case vowels in a string given by user.
*/
package Strings;

import java.util.Scanner;

public class CountVowels {

    // Version 1
    // Time complexity O(n) slightly slower because of array lookup.
    public static int countLowerCaseVowelsV1(String str) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (char c : vowels) {
                if (c == str.charAt(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    // Version 2
    // Time complexity O(n) Slightly faster.
    public static int countLowerCaseVowelsV2(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println();
        System.out.println(countLowerCaseVowelsV1(str));
        System.out.println(countLowerCaseVowelsV2(str));
        sc.close();
    }

}