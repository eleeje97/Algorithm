package Inflearn.section2;

import java.util.Scanner;

public class Sec2_05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(solution(n));
    }

    /** 숫자 하나하나가 소수인지 아닌지 판별 -> 시간초과
    public static int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer++;
            }
        }

        return answer;
    }
     **/


    /** 시간초과 **/
    public static int solution(int n) {
        int answer = 0;
        int[] numbers = new int[n+1]; // int배열은 생성할 때 0으로 초기화된다.

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                answer++;
                for (int j = i; j < numbers.length; j++) {
                    if (j%i == 0) {
                        numbers[j] = 1;
                    }
                }
            }
        }

        return answer;
    }
}
