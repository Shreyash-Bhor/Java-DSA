/* Date: 25-12-2025
 * Check whether the given number is power of 2 or not using bitwise operators
*/

package BitManipulation;

import java.util.Scanner;

public class CountSetBits {

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter number to count it's set bits: ");
        int n = sc.nextInt();
        System.out.println("Set bits are: " + countSetBits(n));
        sc.close();
    }
}