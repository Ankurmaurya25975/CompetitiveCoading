/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 11/12/2021
 *   Time: 10:30 PM
 *   File: LengthofLCS.java
 */

package assign2;

import java.util.Scanner;

public class LengthofLCS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        int text1 = s1.length();
        int text2 = s2.length();
        int[][] dp = new int[text1 + 1][text2 + 1];
        for (int i = 1; i <= text1; i++) {
            for (int j = 1; j <= text2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        System.out.println(dp[text1][text2]);
    }
}
