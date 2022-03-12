/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 23/11/2021
 *   Time: 7:39 PM
 *   File: funkyChessBoard.java
 */

package after;

import java.util.Scanner;
public class funkyChessBoard {

    private static final Scanner scanner = new Scanner(System.in);
    private static int m;

    public static void funkyChessBoard(int[][] board, int r, int c, int count, int n) {
        if (r < 0 || r >= n || c < 0 || c >= n || board[r][c] == 0) {
            return;
        }
        board[r][c] = 0;
        if (m < count + 1) {
            m = count + 1;
        }
        funkyChessBoard(board, r - 1, c - 2, count + 1, n);
        funkyChessBoard(board, r - 2, c - 1, count + 1, n);
        funkyChessBoard(board, r + 1, c - 2, count + 1, n);
        funkyChessBoard(board, r + 2, c - 1, count + 1, n);
        funkyChessBoard(board, r - 1, c + 2, count + 1, n);
        funkyChessBoard(board, r - 2, c + 1, count + 1, n);
        funkyChessBoard(board, r + 1, c + 2, count + 1, n);
        funkyChessBoard(board, r + 2, c + 1, count + 1, n);
        board[r][c] = 1;
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[][] board = new int[n][n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scanner.nextInt();
                if (board[i][j] == 1) {
                    sum++;
                }
            }
        }
        m = 0;
        funkyChessBoard(board, 0, 0, 0, n);
        System.out.println(sum - m);

    }
}
