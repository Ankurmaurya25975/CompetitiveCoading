/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 18/11/2021
 *   Time: 8:10 PM
 *   File: classAssignment.java
 */

import java.util.Scanner;

public class classAssignment {
    private static final Scanner scanner = new Scanner(System.in);
    private static int counter = 0;

    public static void classassignment(int n, String a) {
        if (a.length() == n) {
            counter++;
            return;
        }
        classassignment(n, a + "a");
        if (a.length() == 0 || a.charAt(a.length() - 1) != 'b') {
            classassignment(n, a + "b");
        }
    }

    public static void main(String[] args) {
        int value = scanner.nextInt();
        for (int i = 1; i < value + 1; i++) {
            int n = scanner.nextInt();
            classassignment(n, "");
            System.out.println("#" + i + " : " + counter);
            counter = 0;
        }
    }
}

