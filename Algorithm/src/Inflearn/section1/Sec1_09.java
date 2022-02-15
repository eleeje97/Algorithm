package Inflearn.section1;

/*
* 9. 숫자만 추출
 */

import java.util.Scanner;

public class Sec1_09 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        System.out.println(solution(str));
    }

    public static int solution(String str) {
        str = str.replaceAll("[^0-9]", "");
        int answer = Integer.parseInt(str);

        return answer;
    }
}
