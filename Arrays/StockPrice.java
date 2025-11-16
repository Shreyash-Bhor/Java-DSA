/*
 * Date: 16-11-2025
 * Buy and Sell Stocks
 * DSA Sheet #8
 * You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.
 * Return the maximum profit you can achieve from this transaction.
 * If you cannot achieve any profit, return 0.
 */

import java.util.*;

public class StockPrice {
    public static int buyAndSell(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                profit = Math.max(prices[i] - buyPrice, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the number of days you have prices for : ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the price of day " + (i + 1));
            prices[i] = sc.nextInt();
        }
        System.out.println(buyAndSell(prices));
        sc.close();
    }
}
