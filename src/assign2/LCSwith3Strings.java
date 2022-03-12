/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 11/12/2021
 *   Time: 10:26 PM
 *   File: LCSwith3Strings.java
 */

package assign2;

import java.util.Scanner;

public class LCSwith3Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();
        int text1 = s1.length();
        int text2 = s2.length();
        int text3 = s3.length();
        int[][][] dp = new int[text1 + 1][text2 + 1][text3 + 1];
        for (int i = 1; i <= text1; i++) {
            for (int j = 1; j <= text2; j++) {
                for (int k = 1; k <= text3; k++) {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1) && s1.charAt(i - 1) == s3.charAt(k - 1)) {
                        dp[i][j][k] = 1 + dp[i - 1][j - 1][k - 1];
                    } else {
                        dp[i][j][k] = Math.max(dp[i - 1][j][k], Math.max(dp[i][j - 1][k], dp[i][j][k - 1]));
                    }
                }
            }
        }
        System.out.println(dp[text1][text2][text3]);
    }
}
