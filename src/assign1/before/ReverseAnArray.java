/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 17/11/2021
 *   Time: 9:57 PM
 *   File: ReverseAnArray.java
 */

import java.util.Scanner;

public class ReverseAnArray {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int loop = scanner.nextInt();
        int[] array = new int[loop];
        for (int i = 0; i < loop; i++) {
            array[i] = scanner.nextInt();
        }
        printArray(array, array.length - 1);
    }
    public static void printArray(int[] array, int position) {
        if (position == -1) {
            return;
        }
        System.out.print(array[position] + " ");
        printArray(array, position - 1);
    }
}
