/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 06/02/2022
 *   Time: 9:42 PM
 *   File: i.java
 */

package assign3;

import java.util.LinkedList;
import java.util.Scanner;
public class i {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            LinkedList<Integer> list1 = new LinkedList<>();
            for (int i = 0; i < n; i++) list1.add(scn.nextInt());
            int m = scn.nextInt();
            LinkedList<Integer> list2 = new LinkedList<>();
            for (int i = 0; i < m; i++) list2.add(scn.nextInt());
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (list1.get(i) == list2.get(j)) {
                        System.out.println(list1.get(i));
                        return;
                    }
                }
            }
            System.out.println("-1");
        }
    }
