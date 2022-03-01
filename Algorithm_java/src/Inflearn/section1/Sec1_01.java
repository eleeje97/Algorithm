package Inflearn.section1;

/*
* 1. 문자찾기
* 입력받은 문자열에 특정문자가 몇 개 존재하는지 출력
*/

import java.util.Scanner;

public class Sec1_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char c = scn.next().charAt(0);

        System.out.println(solution(str, c));
    }

    public static int solution(String str, char c) {
        int count = 0;

        for (char i : str.toCharArray()) {
            if ((i == c)||(i == c-32)||(i == c+32)) {
                count++;
            }
        }
        return count;
    }
}
