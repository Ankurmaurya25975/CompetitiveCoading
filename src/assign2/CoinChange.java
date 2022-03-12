/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 11/12/2021
 *   Time: 10:58 PM
 *   File: CoinChange.java
 */

package assign2;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static int sol(int current, int n, int amount, int[] arr, int[][] dp) {
        if (amount == 0) {
            return 1;
        }
        if (current == arr.length) {
            return 0;
        }
        if (dp[current][amount] != -1) {
            return dp[current][amount];
        }
        int c1 = 0, c2 = 0;
        if (arr[current] <= amount) {
            c2 = sol(current, n, amount - arr[current], arr, dp);
        }
        c1 = sol(current + 1, n, amount, arr, dp);

        return dp[current][amount] = c1 + c2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        int[][] dp = new int[m + 1][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(sol(0, m, n, arr, dp));
    }
}
