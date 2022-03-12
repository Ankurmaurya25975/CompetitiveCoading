/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 18/11/2021
 *   Time: 10:58 PM
 *   File: mazePathD2CountPrint.java
 */

import java.util.Scanner;

public class mazePathD2CountPrint {
        private static final Scanner scanner = new Scanner(System.in);

        public static int printAllPaths(int cr, int cc, int dr, int dc, String path) {
            if (cr > dr || cc > dc) {
                return 0;
            }
            if (cr == dr && cc == dc) {
                System.out.print(path + " ");
                return 1;
            }
            int right = printAllPaths(cr + 1, cc, dr, dc, path + "V");
            int left = printAllPaths(cr, cc + 1, dr, dc, path + "H");
            int diag = 0;
            if (cr == cc || (cr + cc) == dr) {
                diag = printAllPaths(cr + 1, cc + 1, dr, dc, path + "D");
            }
            return right + left + diag;
        }

        public static void main(String[] args) {

            int n1 = scanner.nextInt();
            int result = printAllPaths(0, 0, n1 - 1, n1 - 1, "");
            System.out.println();
            System.out.println(result);
        }
    }