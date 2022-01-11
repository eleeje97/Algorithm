package Inflearn.section1;

import java.util.Scanner;

/*
* 3. 문장 속 단어
 */

public class Sec1_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = "";
        String[] strArray = str.split(" ");

        for (String s : strArray) {
            if (s.length() > answer.length()) {
                answer = s;
            }
        }

        return answer;
    }
}
