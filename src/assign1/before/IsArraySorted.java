/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 17/11/2021
 *   Time: 10:30 PM
 *   File: IsArraySorted.java
 */

import java.util.Scanner;

public class IsArraySorted {

    private static final Scanner scanner = new Scanner(System.in);

    private static boolean isGivenArraySorted(int[] array, int position, boolean result) {
        if (position == 0) {
            return result;
        }
        if (array[position] < array[position - 1]) {
            result = false;
            return result;
        }
        return isGivenArraySorted(array, position - 1, result);
    }

    public static void main(String[] args) {
        int loop = scanner.nextInt();
        int[] array = new int[loop];
        for (int i = 0; i < loop; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(isGivenArraySorted(array, array.length - 1, true));
    }
}
