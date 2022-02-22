package Inflearn.section2;

import java.util.Scanner;

public class Sec2_06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        String[] array = new String[num];
        for (int i = 0; i < num; i++) {
            array[i] = scn.next();
        }

        System.out.println(solution(num, array));
    }

    public static String solution(int num, String[] array) {
        String answer = "";
        int[] numbers = new int[num];

        // 숫자 뒤집기
        for (int i = 0; i < num; i++) {
            numbers[i] = Integer.parseInt(new StringBuffer(array[i]).reverse().toString());
        }

        // 소수면 정답에 추가
        for (int number : numbers) {
            if (isPrime(number)) {
                answer += number + " ";
            }
        }

        return answer;
    }

    // 소수인지 판별
    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return  false;
            }
        }

        return true;
    }

}