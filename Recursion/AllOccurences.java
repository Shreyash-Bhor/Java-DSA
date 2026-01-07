/*
 * Date : 07-01-2026
 * Problem 14 : Find all occurences of an element in an array.
*/

package Recursion;

public class AllOccurences {

    public static void allOccurences(int[] arr, int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (key == arr[i]) {
            System.out.print(i + " ");
        }
        allOccurences(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 2, 5, 67, 2, 2 };
        System.out.println();
        allOccurences(arr, 2, 0);
    }
}
