package Inflearn.section2;

import java.util.Scanner;

public class Sec2_09 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int array[][] = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                array[i][j] = scn.nextInt();
            }
        }

        System.out.println(solution(num, array));
    }

    public static int solution(int num, int[][] array) {
        int answer = 0;
        int a = 0;
        int b = 0;

        for (int i = 0; i < num; i++) {
            a = 0;
            b = 0;

            for (int j = 0; j < num; j++) {
                a += array[i][j];
                b += array[j][i];
            }

            if (answer < a) answer = a;
            if (answer < b) answer = b;
        }

        a = 0;
        b = 0;
        for (int i = 0; i < num; i++) {
            a += array[i][i];
            b += array[i][num-(i+1)];
        }
        if (answer < a) answer = a;
        if (answer < b) answer = b;


        return answer;
    }

}
