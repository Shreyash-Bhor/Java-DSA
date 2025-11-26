/* Date: 26-11-2025
 * Write a program to Find Transpose of a Matrix
 * For a 2x3 matrix
 * Assignment Question 3
*/

package TwoDArrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        int row = 2, column = 3;
        int[][] transpose = new int[column][row];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
