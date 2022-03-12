/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 07/02/2022
 *   Time: 10:30 PM
 *   File: Main.java
 */

package assign3;
import java.util.Scanner;
import java.util.Stack;
public class ftge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        st.push(0);
        for (int i = 0; i < n * 2; i++) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i % n]) {
                nge[st.pop()] = nums[i % n];
            }
            if (i < n) {
                st.push(i);
            }
        }
        while (!st.isEmpty()) {
            nge[st.pop()] = -1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nge[i] + " ");
        }
    }
}
