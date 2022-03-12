/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 11/12/2021
 *   Time: 10:48 PM
 *   File: ClimbingStairs.java
 */

package assign2;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbingStairs {
    public static int sol(int current, int n, int[] dp) {
        if (current == n) {
            return 1;
        }
        if (current > n) {
            return 0;
        }
        if (dp[current] != -1) {
            return dp[current];
        }
        int c1 = 0, c2 = 0;
        c1 = sol(current + 1, n, dp);
        c2 = sol(current + 2, n, dp);
        return dp[current] = c1 + c2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);
        System.out.println(sol(0, n, dp));
    }
}

