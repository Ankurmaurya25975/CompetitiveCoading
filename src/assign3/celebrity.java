/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 07/02/2022
 *   Time: 9:51 PM
 *   File: Main.java
 */

package assign3;

import java.util.Scanner;

public class celebrity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[] friend = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1 && i != j) {
                    friend[j]++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (friend[i] == n - 1) {
                System.out.println(i);
                return;
            }
        }
        System.out.print("No Celebrity");

    }
}
