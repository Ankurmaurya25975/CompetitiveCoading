/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 18/11/2021
 *   Time: 8:14 PM
 *   File: smartKeypad.java
 */

import java.util.Scanner;

public class smartKeypad {

    private static final Scanner scanner = new Scanner(System.in);
    private static String mapping(char cc) {
            if (cc == '0') {
                return " ";
            } else if (cc == '1') {
                return ".+@$";
            } else if (cc == '2') {
                return "abc";
            } else if (cc == '3') {
                return "def";
            } else if (cc == '4') {
                return "ghi";
            } else if (cc == '5') {
                return "jkl";
            } else if (cc == '6') {
                return "mno";
            } else if (cc == '7') {
                return "pqrs";
            } else if (cc == '8') {
                return "tuv";
            } else if (cc == '9') {
                return "wxyz";
            }

            return "";
        }

        public static void smartKeyboardCombination(String inp, String out) {
            if (inp.length() == 0) {
                System.out.println(out);
                return;
            }
            char cc0th = inp.charAt(0);//'2'
            String mappedString = mapping(cc0th);//"abc"

            for (int i = 0; i < mappedString.length(); i++) {
                char ith = mappedString.charAt(i);
                String ros = inp.substring(1);
                smartKeyboardCombination(ros, out + ith);
            }
        }

        public static void main(String[] args) {
            String value = scanner.nextLine();
            smartKeyboardCombination(value, "");

        }
    }

