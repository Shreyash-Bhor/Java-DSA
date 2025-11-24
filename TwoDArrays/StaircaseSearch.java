/* Date: 24-11-2025
 * Staircase Search Problem
 * Search for key in sorted 2D Matrix
*/
package TwoDArrays;

public class StaircaseSearch {
    public static boolean searchInSortedMatrix(int[][] matrix, int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {

            if (key < matrix[row][col]) {
                col--;
            } else if (key > matrix[row][col]) {
                row++;
            } else {
                System.out.println("Key found at " + row + "," + col);
                return true;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println();
        System.out.println();
        searchInSortedMatrix(matrix, 6);
    }
}
