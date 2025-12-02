/* Date: 02-12-2025
 * Get shortest path from directions
*/

package Strings;

import java.util.Scanner;

public class ShortestPath {
    public static float getShortestPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);

            if (direction == 'S') {
                y--;
            } else if (direction == 'N') {
                y++;
            } else if (direction == 'E') {
                x++;
            } else {
                x--;
            }
        }
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Path: ");
        String path = sc.nextLine();
        System.out.println(getShortestPath(path));
        sc.close();
    }
}
