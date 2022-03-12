/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 07/02/2022
 *   Time: 10:18 PM
 *   File: MAin.java
 */

package assign3;

import java.util.Scanner;
import java.util.Stack;
public class fmn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int j = 0; j < n; j++) {
            String str = arr[j];
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i <= str.length(); i++) {
                st.push(i + 1);
                if (i == str.length() || str.charAt(i) == 'I') {
                    while (!st.isEmpty()) {
                        System.out.print(st.pop());
                    }
                }
            }
            System.out.println();
        }
    }
}
