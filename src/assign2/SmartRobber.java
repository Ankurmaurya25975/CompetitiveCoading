/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 11/12/2021
 *   Time: 10:51 PM
 *   File: SmartRobber.java
 */

package assign2;

import java.util.Arrays;
import java.util.Scanner;

public class SmartRobber {
    public static int sol(int current, int n, int[] arr, int[] dp) {

        if (current >= n) {
            return 0;
        }
        if (dp[current] != -1) {
            return dp[current];
        }
        int c1 = sol(current + 1, n, arr, dp);
        int c2 = arr[current] + sol(current + 2, n, arr, dp);
        return dp[current] = Math.max(c1, c2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] dp = new int[n + 1];
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.fill(dp, -1);
            System.out.println(sol(0, n, arr, dp));
        }
    }
}