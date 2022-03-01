package Inflearn.section1;

/*
* 6. 중복문자 제거
 */

import java.util.Scanner;

public class Sec1_06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        char[] charArray = str.toCharArray();
        String answer = "";

        for (char c : charArray) {
            if (!answer.contains(Character.toString(c))) {
                answer += c;
            }
        }

        return answer;
    }
}

