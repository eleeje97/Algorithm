package Inflearn.section1;

/*
* 8. 유효한 팰린드롬
 */

import java.util.Scanner;

public class Sec1_08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        char[] charArray = str.toCharArray();
        String string = "";

        for (char c : charArray) {
            if (Character.isAlphabetic(c)) {
                string += c;
            }
        }

        String reversedString = new StringBuilder(string).reverse().toString();
        if (string.equalsIgnoreCase(reversedString)) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
