/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 11/12/2021
 *   Time: 10:43 PM
 *   File: Knapsack0_1.java
 */

package assign2;

import java.util.Arrays;
import java.util.Scanner;

public class Knapsack0_1 {
    public static int sol(int current, int N, int[] weight, int[] price, int S, int[][] dp) {
        if (S == 0 || current == N) {
            return 0;
        }
        if (dp[S][current] != -1) {
            return dp[S][current];
        }
        int c1 = 0, c2 = 0, c3 = 0;
        if (weight[current] <= S) {
            c1 = price[current] + sol(current + 1, N, weight, price, S - weight[current], dp);
            c3 = price[current] + sol(current, N, weight, price, S - weight[current], dp);
        }
        c2 = sol(current + 1, N, weight, price, S, dp);
        return dp[S][current] = Math.max(c1, Math.max(c2, c3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] weight = new int[N];
        for (int i = 0; i < N; i++) {
            weight[i] = sc.nextInt();
        }
        int[] price = new int[N];
        for (int j = 0; j < N; j++) {
            price[j] = sc.nextInt();
        }
        int[][] dp = new int[S + 1][N + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(sol(0, N, weight, price, S, dp));
    }
}
