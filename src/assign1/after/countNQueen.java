/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 23/11/2021
 *   Time: 7:32 PM
 *   File: countNQueen.java
 */

package after;

import java.util.Scanner;

public class countNQueen {
    private static final Scanner scanner = new Scanner(System.in);
    private static int count;

    public static boolean placeTheQueen(int[][] board, int cr, int cc, int n) {
        for (int row = 0; row <= cr - 1; row++) {
            if (board[row][cc] == 1) {
                return false;
            }
        }
        int row = cr;
        int col = cc;

        while (row >= 0 && col < n) {
            if (board[row][col] == 1) {
                return false;
            }
            row--;
            col++;
        }
        row = cr;
        col = cc;
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 1) {
                return false;
            }
            row--;
            col--;
        }
        return true;
    }
    public static void queen(int[][] board, int cr, int n) {
        if (cr == n) {
            count++;
            return;
        }
        for (int cc = 0; cc < n; cc++) {
            if (placeTheQueen(board, cr, cc, n)) {
                board[cr][cc] = 1;
                queen(board, cr + 1, n);
                board[cr][cc] = 0;
            }

        }
    }
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[][] board = new int[n][n];
        queen(board, 0, n);
        System.out.println(count);
    }
}
