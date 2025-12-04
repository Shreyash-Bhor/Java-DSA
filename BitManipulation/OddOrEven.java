/* Date: 04-12-2025 
 * Check whether the given number is odd or even using logical operators.
*/
package BitManipulation;

public class OddOrEven {
    public static void findOddOrEven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 1) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }
    }

    public static void main(String[] args) {
        findOddOrEven(22);
        findOddOrEven(50);
        findOddOrEven(41);
    }
}
