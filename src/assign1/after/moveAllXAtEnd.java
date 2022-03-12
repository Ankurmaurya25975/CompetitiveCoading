/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 23/11/2021
 *   Time: 7:52 PM
 *   File: moveAllXAtEnd.java
 */

package after;

import java.util.Scanner;

public class moveAllXAtEnd {
    private static final Scanner scanner = new Scanner(System.in);

    public static void moveTheEnd(String s, int i, int l) {
        if (i >= l)
            return;

        char curr = s.charAt(i);

        if (curr != 'x')
            System.out.print(curr);
        moveTheEnd(s, i + 1, l);

        if (curr == 'x')
            System.out.print(curr);
        return;

    }
    public static void main(String[] args) {
        String s = scanner.next();
        int l = s.length();
        moveTheEnd(s, 0, l);
    }
}
