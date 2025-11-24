/* Date : 24-11-2025
 *  Diagonal Sum of 2D Array
*/

package TwoDArrays;

public class DiagonalSum {
    public static int diagonalSum(int[][] matrix) {

        // Brute Force Approach
        // Time Complexity O(n^2)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    // Optimized Solution
    // Time Complexity O(n)
    public static int optimizedDiagonalSum(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];

            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println("Diagonal Sum :" + diagonalSum(matrix));
        System.out.println("Optimized Diagonal Sum :" + optimizedDiagonalSum(matrix));
    }

}
