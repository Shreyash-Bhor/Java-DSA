/* Date: 04-12-2025
 * Perform Bitwise operations
*/

package BitManipulation;

public class BitOperations {

    // Get i th bit
    public static int getBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        }
        return 1;
    }

    // set i th bit
    public static int setBit(int n, int i) {
        return n | 1 << i;
    }

    // clear i th bit
    public static int clearBit(int n, int i) {
        return n & ~(1 << i);
    }

    // update i th bit
    public static int updateBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearBit(n, i);
        }
        return setBit(n, i);
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(getBit(10, 2)); // 0
        System.out.println(setBit(10, 2)); // 14
        System.out.println(clearBit(10, 1)); // 8
        System.out.println(updateBit(10, 2, 1)); // 14
    }
}
