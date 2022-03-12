/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 17/11/2021
 *   Time: 10:27 PM
 *   File: MazepathD.java
 */

import java.util.Scanner;

public class MazepathD {
    private static final Scanner scanner = new Scanner(System.in);

    private static int printallPaths(int cr, int cc, int dr, int dc, String path) {
        if (cr > dr || cc > dc) {
            return 0;
        }
        if (cr == dr && cc == dc) {
            System.out.print(path + " ");
            return 1;
        }
        int right = printallPaths(cr + 1, cc, dr, dc, path + "H");
        int left = printallPaths(cr, cc + 1, dr, dc, path + "V");
        int diagonal = printallPaths(cr + 1, cc + 1, dr, dc, path + "D");
        return right + left + diagonal;
    }

    public static void main(String[] args) {
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int result = printallPaths(0, 0, row - 1, column - 1, "");
        System.out.println();
        System.out.println(result);
    }
}
