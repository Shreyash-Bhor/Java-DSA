/* Date: 26-11-2025
 * Print the number of 7’s that are in the 2d array
 * Assignment Question 1
*/

package TwoDArrays;

public class CountElements {

    public static void main(String[] args) {
        int[][] arr = { { 4, 7, 8 }, { 8, 8, 7 } };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("Count is :" + count);
    }
}