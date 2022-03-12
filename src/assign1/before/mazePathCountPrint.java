/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 18/11/2021
 *   Time: 11:04 PM
 *   File: mazePathCountPrint.java
 */

import java.util.Scanner;

public class mazePathCountPrint {
        private static final Scanner scanner = new Scanner(System.in);

        public static int printAllThePaths(int cr, int cc, int dr, int dc, String path) {
            if (cr > dr || cc > dc) {
                return 0;
            }
            if (cr == dr && cc == dc) {
                System.out.print(path + " ");
                return 1;
            }
            int right = printAllThePaths(cr + 1, cc, dr, dc, path + "V");
            int left = printAllThePaths(cr, cc + 1, dr, dc, path + "H");
            return right + left;
        }

        public static void main(String[] args) {
            int row = scanner.nextInt();
            int column = scanner.nextInt();
            int result = printAllThePaths(0, 0, row - 1, column - 1, "");
            System.out.println();
            System.out.println(result);
        }
    }
