package BaekJoon;

import java.util.Scanner;

public class BaekJoon11899 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String parenthesis = scn.next();
        int answer = 0;

        int count = 0;
        for (char c : parenthesis.toCharArray()) {
            if (c == '(') {
                count++;
            } else {
                count--;
            }

            if (count < 0) {
                answer++;
                count++;
            }
        }

        answer += count;
        System.out.println(answer);
    }

}
