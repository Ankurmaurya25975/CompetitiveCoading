/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 11/12/2021
 *   Time: 11:03 PM
 *   File: GOLDMINEPROBLEM.java
 */

package assign2;

import java.util.Arrays;
import java.util.Scanner;

public class GOLDMINEPROBLEM {
    public static int goldmineProb(int[][] arr, int m, int n, int cr, int cc, int[][] dp) {
        if (cr < 0 || cr == n || cc == m) {
            return 0;
        }
        if (dp[cr][cc] != -1) {
            return dp[cr][cc];
        }
        int c = goldmineProb(arr, m, n, cr - 1, cc + 1, dp);
        int b = goldmineProb(arr, m, n, cr, cc + 1, dp);
        int a = goldmineProb(arr, m, n, cr + 1, cc + 1, dp);

        return dp[cr][cc] = arr[cr][cc] + Math.max(a, Math.max(b, c));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            int res = -1;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }
            int[][] dp = new int[n + 1][m + 1];
            for (int[] r : dp) {
                Arrays.fill(r, -1);
            }
            for (int q = 0; q < n; q++) {
                int resR = goldmineProb(arr, m, n, q, 0, dp);
                res = Math.max(res, resR);
            }
            System.out.println(res);
        }
    }
}