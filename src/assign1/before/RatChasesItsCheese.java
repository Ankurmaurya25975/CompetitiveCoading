/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 18/11/2021
 *   Time: 10:22 PM
 *   File: RatChasesItsCheese.java
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RatChasesItsCheese {
    private static int[][] maze;
    private static int[][] resp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int m = Integer.parseInt(st[0]);
        int n = Integer.parseInt(st[1]);
        maze = new int[m][n];
        resp = new int[m][n];
        for (int i = 0; i < m; i++) {
            String row = br.readLine();
            for (int j = 0; j < n; j++) {
                if (row.charAt(j) == 'X') {
                    maze[i][j] = 1;
                }
            }
        }
        getPaths(0, 0, m, n);
        if (resp[m - 1][n - 1] != 1) {
            System.out.println("NO PATH FOUND");
            return;
        }

        for (int i = 0; i < resp.length; i++) {
            System.out.print(resp[i][0]);
            for (int j = 1; j < resp[0].length; j++) {
                System.out.print(" " + resp[i][j]);
            }
            System.out.println();
        }
    }

    static boolean getPaths(int i, int j, int m, int n) {
        if (i >= m || i < 0 || j >= n || j < 0 || maze[i][j] == 1 || resp[i][j] == 1) {
            return false;
        }
        if (i == m - 1 && j == n - 1 && maze[i][j] != 1) {
            resp[i][j] = 1;
            return true;
        }

        resp[i][j] = 1;
        boolean isReach = false;
        isReach = isReach || getPaths(i + 1, j, m, n);
        isReach = isReach || getPaths(i, j + 1, m, n);
        isReach = isReach || getPaths(i - 1, j, m, n);
        isReach = isReach || getPaths(i, j - 1, m, n);
        if (isReach) {
            return true;
        } else {
            resp[i][j] = 0;
            return false;
        }
    }
}
