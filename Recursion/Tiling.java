/*
 * Date : 04-01-2026
 * Problem 11 : Find number of ways to place Tiles on a 2 x n floor.
*/

package Recursion;

import java.util.Scanner;

public class Tiling {
    public static int setTiles(int n) {
        if (n == 0 | n == 1) {
            return 1;
        }
        int verticalTiles = setTiles(n - 1);
        int horizontalTiles = setTiles(n - 2);
        return verticalTiles + horizontalTiles;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the size of floor: ");
        int n = sc.nextInt();
        System.out.println(setTiles(n));
        sc.close();
    }
}
