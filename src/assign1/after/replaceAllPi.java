/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 23/11/2021
 *   Time: 7:55 PM
 *   File: replaceAllPi.java
 */

package after;

import java.util.Scanner;

public class replaceAllPi {
    private static final Scanner scanner = new Scanner(System.in);

    public static String replacePi(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == 'p' && str.length() >= 2
                && str.charAt(1) == 'i') {
            return "3.14" + replacePi(str.substring(2));
        }

        return str.charAt(0) + replacePi(str.substring(1));
    }
    public static void main(String[] args) {
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            System.out.println(replacePi(str));
        }
    }
}
