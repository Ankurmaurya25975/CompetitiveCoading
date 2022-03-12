/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 18/11/2021
 *   Time: 10:35 PM
 *   File: recursionKeypadCodes.java
 */

import java.util.Scanner;

public class recursionKeypadCodes {
    private static final Scanner scanner = new Scanner(System.in);
    public static int count = 0;

    private static String mapping(char cc) {
        if (cc == '1') {
            return "abc";
        } else if (cc == '2') {
            return "def";
        } else if (cc == '3') {
            return "ghi";
        } else if (cc == '4') {
            return "jkl";
        } else if (cc == '5') {
            return "mno";
        } else if (cc == '6') {
            return "pqrs";
        } else if (cc == '7') {
            return "tuv";
        } else if (cc == '8') {
            return "wx";
        } else if (cc == '9') {
            return "yz";
        }

        return "";
    }

    public static void allTheCombination(String input, String output) {
        if (input.length() == 0) {
            count++;
            System.out.print(output + " ");
            return;
        }
        char cc0th = input.charAt(0);//'2'
        String mappedString = mapping(cc0th);//"abc"

        for (int i = 0; i < mappedString.length(); i++) {
            char ith = mappedString.charAt(i);
            String ros = input.substring(1);
            allTheCombination(ros, output + ith);
        }
    }

    public static void main(String[] args) {
        String value = scanner.nextLine();
        allTheCombination(value, "");
        System.out.println();
        System.out.println(count);
    }
}
