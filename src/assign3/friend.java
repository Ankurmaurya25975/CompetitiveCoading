/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 07/02/2022
 *   Time: 10:28 PM
 *   File: Main.java
 */

package assign3;

import java.util.Scanner;
import java.util.Stack;
public class friend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String str = sc.next();
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i <= str.length(); i++) {
                st.push(i + 1);
                if (i == str.length() || Character.getNumericValue(str.charAt(i)) % 2 == 0) {
                    while (!st.isEmpty()) {
                        System.out.print(st.pop());
                    }
                }
            }
            System.out.println();

            T--;
        }
    }
}
