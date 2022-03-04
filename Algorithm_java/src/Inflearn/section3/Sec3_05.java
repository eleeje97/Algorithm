package Inflearn.section3;

import java.util.Scanner;

public class Sec3_05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        System.out.println(solution(N));
    }

    public static int solution(int N) {
        int answer = 0;

        int lt = 1;
        int rt = 1;
        int sum = 1;
        while (rt <= N/2 + 1) {
            if (sum == N) {
                answer++;
                sum -= lt++;
                sum += ++rt;
            }
            else if (sum < N) sum += ++rt;
            else sum -= lt++;
        }

        return answer;
    }
}
