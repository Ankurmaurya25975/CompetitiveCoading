/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 18/11/2021
 *   Time: 10:40 PM
 *   File: recursionConvertStringToInteger.java
 */

import java.util.Scanner;

public class recursionConvertStringToInteger {
        private static final Scanner scanner = new Scanner(System.in);

        public static int givenStringToInteger(String string) {
            if (string.length() == 1) {
                return (string.charAt(0) - '0');
            }
            double y = givenStringToInteger(string.substring(1));
            double x = string.charAt(0) - '0';

            x = x * Math.pow(10, string.length() - 1) + y;
            return (int) (x);
        }

        public static void main(String[] args) {
            String string = scanner.nextLine();
            System.out.println(givenStringToInteger(string));
        }
    }
