package Inflearn.section3;

import java.util.Scanner;

public class Sec3_06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int k = scn.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scn.nextInt();
        }

        System.out.println(solution(N, k, array));
    }

    public static int solution(int N, int k, int[] array) {
        int answer = 0;
        int lt = 0;
        int count = k;

        for (int rt = 0; rt < N; rt++) {
            if (array[rt] == 0) count--;
            while (count < 0) {
                if (array[lt] == 0) count++;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }
}
