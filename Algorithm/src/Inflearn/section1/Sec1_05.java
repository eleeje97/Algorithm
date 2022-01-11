package Inflearn.section1;

/*
* 5. 특정 문자 뒤집기
 */

import java.util.Scanner;

public class Sec1_05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = "";
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = str.length()-1;

        while (left < right) {
            if (!Character.isAlphabetic(charArray[left])) {
                left++;
            } else if (!Character.isAlphabetic(charArray[right])) {
                right--;
            } else {
                char tmp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = tmp;
                left++;
                right--;
            }
        }

        answer = String.valueOf(charArray);

        return answer;
    }
}
