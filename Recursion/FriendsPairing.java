/*
 * Date : 06-01-2026
 * Problem 13 : Friends Pairing Problem
 * Given n friends, each one can remain single or can be paired
 * with some other friend.
 * Each friend can be paired only once.
 * Find out the total number of ways in which friends can remain single or can be paired up.
*/

package Recursion;

import java.util.Scanner;

public class FriendsPairing {
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter number of friends: ");
        int n = sc.nextInt();
        System.out.println(friendsPairing(n));
        sc.close();
    }
}
