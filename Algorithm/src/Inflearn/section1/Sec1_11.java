package Inflearn.section1;

import java.util.Scanner;

public class Sec1_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = "";
        char current = '0';
        int count = 1;

        for (char c : str.toCharArray()) {
            if (current == c) {
                count++;
            } else {
                if (count != 1) {
                    answer += count;
                }
                current = c;
                answer += c;
                count = 1;
            }
        }

        if (count != 1) {
            answer += count;
        }


        return answer;
    }
}
