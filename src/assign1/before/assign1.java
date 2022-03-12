/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 14/11/2021
 *   Time: 10:40 PM
 *   File: assign1.java
 */

public class assign1 {
        public static void main(String[] args) {
            int n = 3;
            char[] str = new char[2 * n];
            Parenthesis(str, n);
        }
        static void Parenthesis(char[] str, int position, int n, int openparentheses, int closeparentheses) {
            if (closeparentheses == n) {
                for (int i = 0; i < str.length; i++)
                    System.out.print(str[i]);
                System.out.println();
                return;

            } else {
                if (openparentheses > closeparentheses) {
                    str[position] = ')';
                    Parenthesis(str, position + 1, n, openparentheses, closeparentheses + 1);
                }
                if (openparentheses < n) {
                    str[position] = '(';
                    Parenthesis(str, position + 1, n, openparentheses + 1, closeparentheses);
                }
            }
        }
        static void Parenthesis(char[] str, int n) {
            if (n > 0)
                Parenthesis(str, 0, n, 0, 0);
            return;
        }
    }
