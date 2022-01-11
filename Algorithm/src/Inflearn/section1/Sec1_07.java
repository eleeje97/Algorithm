package Inflearn.section1;

/*
* 7. 회문 문자열
 */

import java.util.Scanner;

public class Sec1_07 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String str = scn.next();

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        Boolean flag = true;
        int left = 0;
        int right = str.length()-1;

        str = str.toUpperCase(); // 모두 대문자로 변환

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                flag = false;
                break;
            }
            left++;
            right--;
        }

        if (flag) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
