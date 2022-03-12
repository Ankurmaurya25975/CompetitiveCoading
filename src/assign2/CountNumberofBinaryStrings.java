/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 11/12/2021
 *   Time: 10:33 PM
 *   File: CountNumberofBinaryStrings.java
 */

package assign2;

import java.util.Arrays;
import java.util.Scanner;

public class CountNumberofBinaryStrings {
        private static long sol(int n, long[] arr) {
            if (n == 0 || n == 1) {
                return n;
            }
            if (arr[n] != -1) {
                return arr[n];
            }
            long N_1 = sol(n - 1, arr);
            long N_2 = sol(n - 2, arr);

            long N = N_1 + N_2;
            return arr[n] = N;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                long[] dp = new long[n + 3];
                Arrays.fill(dp, -1);
                System.out.println(sol(n + 2, dp));
            }
        }
    }
