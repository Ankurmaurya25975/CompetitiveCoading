/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 18/11/2021
 *   Time: 10:10 PM
 *   File: RecursionAsciiSubsequences.java
 */

import java.util.Scanner;

public class RecursionAsciiSubsequences {
    private static final Scanner scanner = new Scanner(System.in);

    public static int RecursionAsciiSubsequences(String n, String m, int ascii) {
        if (ascii == n.length()) {
            if (m.length() > 0) {
                System.out.print(" " + m + " ");
            }
            return 1;
        }
        char m0 = n.charAt(ascii);
        int first = RecursionAsciiSubsequences(n, m, ascii + 1);
        int second = RecursionAsciiSubsequences(n, m + m0, ascii + 1);
        int third = RecursionAsciiSubsequences(n, m + (int) m0, ascii + 1);
        return first + second + third;
    }
    public static void main(String[] args) {
        String value = scanner.nextLine();
        int result = RecursionAsciiSubsequences(value, "", 0);
        System.out.println();
        System.out.println(result);
    }
}
