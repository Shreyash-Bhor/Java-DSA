/* Date: 05-12-2025
 * Check whether the given number is power of 2 or not using bitwise operators
*/
package BitManipulation;

public class Powerof2OrNot {
    public static boolean power(int n) {
        if ((n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(power(4));
    }
}
