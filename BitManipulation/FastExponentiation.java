/* Date: 05-12-2025
 * Fast exponentiation using bitwise method.
 * Time complexity O(log n)
*/

package BitManipulation;

import java.util.Scanner;

public class FastExponentiation {
    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans *= a;
            }
            a *= a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the number and its power : ");
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(fastExpo(a, n));
        sc.close();
    }
}
