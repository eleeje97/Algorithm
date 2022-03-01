package Inflearn.section2;

import java.util.Scanner;

public class Sec2_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = scn.nextInt();
        }

        System.out.println(solution(num, array));
    }

    public static String solution(int num, int[] array) {
        String answer = "";

        answer += array[0];
        for (int i = 1; i < num; i++) {
            if (array[i] > array[i-1]) {
                answer += " " + array[i];
            }
        }

        return answer;
    }
}
