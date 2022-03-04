package Inflearn.section3;

import java.util.Scanner;

public class Sec3_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scn.nextInt();
        }

        System.out.println(solution(N, M, array));
    }

    public static int solution(int N, int M, int[] array) {
        int answer = 0;
        int sum = array[0];
        int p1 = 0;
        int p2 = 0;

        while (p2 < N) {
            if (sum < M) {
                p2++;
                if (p2 < N) sum += array[p2];
            } else if (sum > M) {
                sum -= array[p1++];
            } else {
                answer++;
                sum -= array[p1++];
                p2++;
                if (p2 < N) sum += array[p2];
            }
        }

        return answer;
    }
}
