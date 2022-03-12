/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 11/12/2021
 *   Time: 11:01 PM
 *   File: BoardpathCount_Print.java
 */

package assign2;

import java.util.Scanner;

public class BoardpathCount_Print {
    static int count = 0;
    public static void Path(int n, int m, int c, String res) {
        if (c == n) {
            System.out.print(res + " ");
            count++;
            return;
        }
        if (c > n) {
            return;
        }
        for (int i = 1; i <= m; i++) {
            Path(n, m, c + i, res + i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Path(n, m, 0, "");
        System.out.println();

        System.out.println(count);
    }
}