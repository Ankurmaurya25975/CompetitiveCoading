/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 17/11/2021
 *   Time: 10:23 PM
 *   File: LastIndex.java
 */

import java.util.Scanner;
public class LastIndex {
        private static Scanner scanner = new Scanner(System.in);

        private static int theLastIndex(int[] array, int pos, int value){
            if(pos == -1){
                return -1;
            }
            if(array[pos] == value){
                return pos;
            }
            return theLastIndex(array, pos - 1, value);
        }
        public static void main(String[] args) {
            int loop = scanner.nextInt();
            int[] array = new int[loop];
            for (int i = 0; i < loop; i++) {
                array[i] = scanner.nextInt();
            }
            int value = scanner.nextInt();
            System.out.println(theLastIndex(array, array.length - 1, value));
        }
    }
