/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 18/11/2021
 *   Time: 10:31 PM
 *   File: GenerateParentheses.java
 */

import java.util.Scanner;

public class GenerateParentheses {
    private static final Scanner scanner = new Scanner(System.in);
        public static void possibleParenthesis(int o, int c, int n, String combination) {
            if (o == n && c == n) {
                System.out.println(combination);
                return;
            }

            if (o > c) {
                possibleParenthesis(o, c + 1, n, combination + ')');
            }
            if (o < n) {
                possibleParenthesis(o + 1, c, n, combination + '(');
            }
        }

        public static void main(String[] args) {
            int value = scanner.nextInt();
            possibleParenthesis(0, 0, value, "");
        }
    }
