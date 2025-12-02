/* Date:02-12-2025 
 * Print Largest String in array
*/

package Strings;

public class LargestString {
    public static void main(String[] args) {
        String[] fruits = { "apple", "mango", "banana" };
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
