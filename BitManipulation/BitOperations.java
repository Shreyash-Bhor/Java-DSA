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

    // clear i bits
    public static int clearIBits(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    // clear i bits in range
    public static int clearIBitsInRange(int n, int i, int j) {
        int a = ((~0) << (j + 1)); // 11111000000 Left side all ones.
        int b = (1 << i) - 1; // Right side all ones , if i=3 then 0111
        int bitmask = a | b;
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(getBit(10, 2)); // 0
        System.out.println(setBit(10, 2)); // 14
        System.out.println(clearBit(10, 1)); // 8
        System.out.println(updateBit(10, 2, 1)); // 14
        System.out.println(clearIBits(15, 2)); // 12
        System.err.println(clearIBitsInRange(10, 2, 4)); // 2
    }
}
