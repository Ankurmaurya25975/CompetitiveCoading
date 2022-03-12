/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 18/11/2021
 *   Time: 10:48 PM
 *   File: allIndicesProblem.java
 */

import java.util.Scanner;

public class allIndicesProblem {
        private static final Scanner scanner = new Scanner(System.in);

        public static int indexes(int[] arr, int n, int m, int[] arr1) {
            if (n == 0) {
                return 0;
            }
            int ans = indexes(arr, n - 1, m, arr1);
            if (arr[n - 1] == m) {
                arr1[ans++] = n - 1;
            }
            return ans;
        }

        public static void allTheIndex(int[] arr, int n, int m) {
            int[] arr1 = new int[n];
            int size = indexes(arr, n, m, arr1);
            for (int i = 0; i < size; i++) {
                System.out.print(arr1[i] + " ");
            }
        }

        public static void main(String[] args) {
            int value = scanner.nextInt();
            int[] arr = new int[value];
            for (int i = 0; i < value; i++) {
                arr[i] = scanner.nextInt();
            }
            int m = scanner.nextInt();
            allTheIndex(arr, value, m);
        }
    }
