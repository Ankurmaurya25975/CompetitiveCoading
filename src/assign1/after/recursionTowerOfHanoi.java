/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 23/11/2021
 *   Time: 7:59 PM
 *   File: recursionTowerOfHanoi.java
 */

package after;

import java.util.Scanner;

public class recursionTowerOfHanoi {

    private static final Scanner scanner = new Scanner(System.in);
    private static int count;

    public static void recursionTowerOfHanoi(int n, String from_rod, String to_rod, String aux_rod) {
        if (n == 1) {
            count++;
            System.out.println("Move 1th disc from " + from_rod + " to " + to_rod);
            return;
        }
        recursionTowerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move " + n + "th disc from " + from_rod + " to " + to_rod);
        count++;
        recursionTowerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }
    public static void main(String[] args) {
        int n = scanner.nextInt();
        recursionTowerOfHanoi(n, "T1", "T2", "T3");
        System.out.println(count);
    }
}
