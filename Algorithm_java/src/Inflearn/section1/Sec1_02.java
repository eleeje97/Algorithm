package Inflearn.section1;

import java.util.Scanner;

/*
* 2. 대소문자 변환
* 입력받은 문자열을 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력
*/
public class Sec1_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = str;
        char[] charArray = str.toCharArray();

        for (int i = 0; i < answer.length(); i++) {
            if (charArray[i] <= 90) { // 소문자 이면
                charArray[i] = (char)(charArray[i] + 32);
            } else {
                charArray[i] = (char)(charArray[i] - 32);
            }
        }

        answer = String.valueOf(charArray);
        return answer;
    }
}
