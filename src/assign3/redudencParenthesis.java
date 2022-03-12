/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 07/02/2022
 *   Time: 10:38 PM
 *   File: Main.java
 */

package assign3;

import java.util.Scanner;
import java.util.Stack;
public class redudencParenthesis {
    static boolean findDuplicateparenthesis(String s) {
        Stack<Character> Stack = new Stack<>();
        char[] str = s.toCharArray();
        for (char ch : str) {
            if (ch == ')') {
                char top = Stack.peek();
                Stack.pop();
                int elementsInside = 0;
                while (top != '(') {
                    elementsInside++;
                    top = Stack.peek();
                    Stack.pop();
                }
                if (elementsInside < 1) {
                    return true;
                }
            } else {
                Stack.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            if (findDuplicateparenthesis(s)) {
                System.out.println("Duplicate");
            } else {
                System.out.println("Not Duplicates");
            }
            t--;
        }
    }
}
