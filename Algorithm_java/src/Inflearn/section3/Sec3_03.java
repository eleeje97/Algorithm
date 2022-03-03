package Inflearn.section3;

import java.util.Scanner;

public class Sec3_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int K = scn.nextInt();
        int[] sales = new int[N];
        for (int i = 0; i < N; i++) {
            sales[i] = scn.nextInt();
        }

        System.out.println(solution(N, K, sales));
    }

    public static int solution(int N, int K, int[] sales) {
        int answer = 0;
        int current = 0;
        for (int i = 0; i < K; i++) {
            current += sales[i];
        }
        answer = current;
        for (int i = K; i < N; i++) {
            current -= sales[i-K];
            current += sales[i];
            if (answer < current) {
                answer = current;
            }
        }
        return answer;
    }
}
