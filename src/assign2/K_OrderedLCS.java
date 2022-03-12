/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 11/12/2021
 *   Time: 10:53 PM
 *   File: K_OrderedLCS.java
 */

package assign2;

import java.util.Arrays;
import java.util.Scanner;

public class K_OrderedLCS {
        public static int kOrderLCS(int[] seq1, int[] seq2, int n, int m, int k, int[][][] dp) {
            if (k < 0) {
                return Integer.MIN_VALUE;
            }
            if (n <= 0 || m <= 0) {
                return 0;
            }
            if (dp[n][m][k] != -1) {
                return dp[n][m][k];
            }

            int ans = Math.max(kOrderLCS(seq1, seq2, n - 1, m, k, dp), kOrderLCS(seq1, seq2, n, m - 1, k, dp));
            if (seq1[n - 1] == seq2[m - 1]) {
                ans = Math.max(ans, 1 + kOrderLCS(seq1, seq2, n - 1, m - 1, k, dp));
            }
            ans = Math.max(ans, 1 + kOrderLCS(seq1, seq2, n - 1, m - 1, k - 1, dp));
            return dp[n][m][k] = ans;

        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[] seq1 = new int[n];
            int[] seq2 = new int[m];
            for (int i = 0; i < n; i++) {
                seq1[i] = sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
                seq2[j] = sc.nextInt();
            }
            int[][][] dp = new int[n + 1][m + 1][k + 1];
            for (int[][] arr : dp) {
                for (int[] arr1 : arr) {
                    Arrays.fill(arr1, -1);
                }
            }
            System.out.println(kOrderLCS(seq1, seq2, n, m, k, dp));


        }
    }
