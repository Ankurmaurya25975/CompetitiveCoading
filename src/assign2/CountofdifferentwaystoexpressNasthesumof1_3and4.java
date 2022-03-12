/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 11/12/2021
 *   Time: 11:08 PM
 *   File: CountofdifferentwaystoexpressNasthesumof1_3and4.java
 */

package assign2;

import java.util.Arrays;
import java.util.Scanner;

public class CountofdifferentwaystoexpressNasthesumof1_3and4 {
    public static long sol(int n, long[] dp) {
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        long c1 = sol(n - 1, dp);
        long c2 = sol(n - 3, dp);
        long c3 = sol(n - 4, dp);
        return dp[n] = c1 + c2 + c3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(sol(n, dp));
    }
}

