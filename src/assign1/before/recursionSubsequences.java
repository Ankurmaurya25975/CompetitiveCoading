/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 18/11/2021
 *   Time: 10:54 PM
 *   File: recursionSubsequences.java
 */

import java.util.Scanner;

public class recursionSubsequences {
        private static final Scanner scanner = new Scanner(System.in);

        public static int allSequence(String n, String m) {
            if (n.length() == 0) {
                System.out.print(m + " ");
                return 1;
            }
            char m0 = n.charAt(0);
            String m1 = n.substring(1);
            int first = allSequence(m1, m);
            int second = allSequence(m1, m + m0);
            return first + second;
        }

        public static void main(String[] args) {
            String n = scanner.nextLine();
            int res = allSequence(n, "");
            System.out.println();
            System.out.println(res);
        }
    }
