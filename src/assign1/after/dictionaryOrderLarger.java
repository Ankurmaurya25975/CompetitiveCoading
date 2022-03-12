/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 23/11/2021
 *   Time: 7:44 PM
 *   File: dictionaryOrderLarger.java
 */

package after;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class dictionaryOrderLarger {
    private static final Scanner scanner = new Scanner(System.in);
    static ArrayList<String> pr = new ArrayList<>();

    public static void largeOrder(String str, int l, int r) {
        if (l == r) {
            pr.add(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                largeOrder(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }
    public static String swap(String s, int i, int j) {
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String s = scanner.next();
        int n = s.length();
        largeOrder(s, 0, n - 1);
        pr.sort(Comparator.comparing(String::toString));
        int index = pr.indexOf(s);
        for (int i = index + 1; i < pr.size(); i++) {
            System.out.println(pr.get(i));
        }
    }
}
